package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication {
    public static Logger logger = LoggerFactory.getLogger(JenkinsProjectApplication.class);

    public void initt() {
        logger.info("Application strarted");
    }


    public static void main(String[] args) {
        logger.info("Application executed....");
        SpringApplication.run(JenkinsProjectApplication.class, args);
    }

}
