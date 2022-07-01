package io.mosn.layotto.preview.service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

public interface ImgService {
    InputStream getImgWithOss(String id) throws Exception;

    void parseResponse(HttpServletResponse response, InputStream inputStream) throws IOException;
}
