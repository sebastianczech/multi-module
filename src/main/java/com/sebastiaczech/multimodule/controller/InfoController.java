package com.sebastiaczech.multimodule.controller;

import com.sebastiaczech.multimodule.model.InfoModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @RequestMapping("/")
    public InfoModel defaultPage() {
        return new InfoModel("1.0.0");
    }

}
