package io.mosn.layotto.preview.controller;

import io.mosn.layotto.preview.domain.vo.BookCoverResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}