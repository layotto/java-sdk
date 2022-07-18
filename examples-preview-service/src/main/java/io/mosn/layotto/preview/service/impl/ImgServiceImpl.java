package io.mosn.layotto.preview.service.impl;

import io.mosn.layotto.preview.config.FileConfiguration;
import io.mosn.layotto.preview.service.ImgService;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spec.sdk.runtime.v1.client.RuntimeClient;
import spec.sdk.runtime.v1.domain.file.GetFileRequest;
import spec.sdk.runtime.v1.domain.file.GetFileResponse;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

@Service
public class ImgServiceImpl implements ImgService {
    private static final Logger log = LoggerFactory.getLogger(ImgServiceImpl.class);

    @Autowired
    private RuntimeClient client;

    @Autowired
    private FileConfiguration fileConfiguration;

    private static final String FILE_PATH = "example/img/bookimg%s.jpg";

    private GetFileRequest request = new GetFileRequest();

    public String getImgWithOss(String id) throws Exception {
        String path = String.format(FILE_PATH, id);
        request.setFileName(path);
        request.setStoreName(fileConfiguration.getStoreName());

        GetFileResponse resp = client.getFile(request, 3000);
        InputStream reader = resp.getIn();

        return imgToBase64(reader);
    }

    protected String imgToBase64(InputStream in) throws IOException {
        byte[] bytes = IOUtils.toByteArray(in);
        return Base64.getEncoder().encodeToString(bytes);
    }
}
