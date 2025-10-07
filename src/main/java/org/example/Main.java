package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  // Combines @Controller + @ResponseBody
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/")  // Maps the root URL
    public String home() {
        // Returns HTML directly in the response
        return "<!DOCTYPE html>" +
               "<html lang='en'>" +
               "<head>" +
               "<meta charset='UTF-8'>" +
               "<title>Welcome to Ragavan's Web Page</title>" +
               "<style>" +
               "body { display:flex; justify-content:center; align-items:center; height:100vh; " +
               "background:linear-gradient(135deg, #6a11cb, #2575fc); font-family:Arial, sans-serif; color:white; }" +
               "h1 { font-size:3em; text-transform:uppercase; letter-spacing:2px; }" +
               "</style>" +
               "</head>" +
               "<body>" +
               "<h1>Welcome to Ragavan's java web page</h1>" +
               "</body>" +
               "</html>";
    }
}

