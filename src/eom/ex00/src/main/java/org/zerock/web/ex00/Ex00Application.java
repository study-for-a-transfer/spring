package org.zerock.web.ex00;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.zerock.web.ex00.repository.EmpRepository;

//@SpringBootApplication
//public class Ex00Application {
//    public static void main(String[] args) {
//        SpringApplication.run(Ex00Application.class, args);
//    }
//}

@SpringBootApplication(exclude = WebMvcAutoConfiguration.class)
public class Ex00Application implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(Ex00Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Ex00Application.class, args);
    }

    @Autowired
    EmpRepository empRepository;

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info(String.valueOf(empRepository.getEmpInfoAll()));
    }
}