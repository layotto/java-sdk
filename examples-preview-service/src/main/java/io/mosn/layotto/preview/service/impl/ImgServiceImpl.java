package io.mosn.layotto.preview.service.impl;

import io.mosn.layotto.preview.config.FileConfiguration;
import io.mosn.layotto.preview.service.ImgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spec.sdk.runtime.v1.client.RuntimeClient;
import spec.sdk.runtime.v1.domain.file.GetFileRequest;
import spec.sdk.runtime.v1.domain.file.GetFileResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@Service
public class ImgServiceImpl implements ImgService {
    private static final Logger log = LoggerFactory.getLogger(ImgServiceImpl.class);

    @Autowired
    private RuntimeClient client;

    @Autowired
    private FileConfiguration fileConfiguration;

    private GetFileRequest request = new GetFileRequest();

    public InputStream getImgWithOss(String id) throws Exception {
        request.setFileName(id);
        request.setStoreName(fileConfiguration.getStoreName());

        GetFileResponse resp = client.getFile(request, 3000);
        InputStream reader = resp.getIn();

        return reader;
    }

    public void parseResponse(HttpServletResponse response, InputStream inputStream) throws IOException {
        OutputStream out = response.getOutputStream();
        byte[] bytes = new byte[1024];
        int len = 0;

        while ((len = inputStream.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }

        out.flush();
    }
}
