package com.bs23.travelagency;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by nafizul.islam on 9/26/2020.
 */
@SpringBootApplication(scanBasePackages = "com.bs23.travelagency")
public class TravelAgencyNafizul {
    private static final Logger logger = LogManager.getLogger(TravelAgencyNafizul.class);
    public static void main(String[] args) {
        SpringApplication.run(TravelAgencyNafizul.class, args);
    }
}
