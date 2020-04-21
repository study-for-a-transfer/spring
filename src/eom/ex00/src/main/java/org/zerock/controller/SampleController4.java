package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class SampleController4 {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController4.class);

    @RequestMapping("/doE")
    public String doE(RedirectAttributes rtts) {
        LOGGER.info("doE called but redirect to /doF.....");

        rtts.addFlashAttribute("msg", "This is the Message!! with redirected");
        return "redirect:/doF";
    }

    @RequestMapping("/doF")
    public void doF(String msg) {
        LOGGER.info("doF called....." + msg);
    }
}
