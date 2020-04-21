package org.zerock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex00Application {
    public static void main(String[] args) {
        SpringApplication.run(Ex00Application.class, args);
    }
}

//@SpringBootApplication(exclude = WebMvcAutoConfiguration.class)
//public class Ex00Application implements CommandLineRunner {
//    private static final Logger LOGGER = LoggerFactory.getLogger(Ex00Application.class);
//
//    public static void main(String[] args) {
//        SpringApplication.run(Ex00Application.class, args);
//    }
//
//    @Autowired
//    EmpRepository empRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        LOGGER.info(String.valueOf(empRepository.getEmpInfoAll()));
//    }
//}