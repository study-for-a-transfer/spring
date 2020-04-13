package org.zerock.web.ex00.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

@Controller
@RequestMapping("/")
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/web")
    public String hello(Locale locale, Model model) {
        String greeting = "Hello world!";
        // 서버 접속 로그
        LOGGER.info("서버 접속: {}", locale);   // LOMBOK 종속?

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);

        model.addAttribute("greeting", greeting);
        model.addAttribute("serverTime", formattedDate);

        return "home";
    }
}
