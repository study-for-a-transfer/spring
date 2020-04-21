package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController2.class);

    @RequestMapping("doC")
    public String doC(@ModelAttribute("msg") String msg) {
        LOGGER.info("doC called.....");

        return "result";
    }
}
