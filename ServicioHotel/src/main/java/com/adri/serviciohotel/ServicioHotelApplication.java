package com.adri.serviciohotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.adri.model")
@EnableJpaRepositories(basePackages = "com.adri.dao")
@SpringBootApplication(scanBasePackages = {"com.adri.service" , "com.adri.controller"})
public class ServicioHotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicioHotelApplication.class, args);
    }

}
