package com.example.exampleapp;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ExampleAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleAppApplication.class, args);
    }

    @GetMapping("/echo/{msg}")
    public String echo(@PathVariable("msg")String msg) throws IOException {
        return new URL("echo:"+msg).getContent().toString();
    }
}
