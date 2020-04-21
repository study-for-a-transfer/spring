package org.zerock.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVO;

@Controller
public class SampleController3 {
    private static final Logger LOGGER = LoggerFactory.getLogger(SampleController3.class);

    @RequestMapping("/doD")
    public String doD(Model model) {
        ProductVO product = new ProductVO("Sample Product", 10000);   // make sample data
        LOGGER.info("doD called.....");
        model.addAttribute("product", product);
        return "productDetail";
    }
}
