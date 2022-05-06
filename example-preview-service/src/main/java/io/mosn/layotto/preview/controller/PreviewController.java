package io.mosn.layotto.preview.controller;

import io.mosn.layotto.preview.domain.vo.BookCoverResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreviewController {

    @GetMapping("/book/cover")
    public BookCoverResponse index() {
        return new BookCoverResponse("test");
    }
}