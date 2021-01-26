package com.springframework.springdemo.GreetingExxample;


import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class SpringControllerEx {

        private static final String template = "Hello, %s!";
        private final AtomicLong counter = new AtomicLong();

        @GetMapping("/greeting")
        public SpringFrame greeting(@RequestParam(value = "name", defaultValue = "Sangeetha") String name) {
            return new SpringFrame(String.format(template, name), counter.incrementAndGet());
        }
    }

