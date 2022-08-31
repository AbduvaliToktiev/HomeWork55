package com.example.homework55.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnHTMLController {

  @GetMapping(value = "/html", produces = MediaType.TEXT_HTML_VALUE)
   public String returnHTML() {
     return "<!DOCTYPE html>\n" +
             "<html lang=\"en\" >\n" +
             "<head>\n" +
             "    <meta charset=\"UTF-8\">\n" +
             "    <title>HW55</title>\n" +
             "</head>\n" +
             "<body>\n" +
             "<h1>Salam Aleikum</h1>\n" +
             "\n" +
             "</body>\n" +
             "</html>";
  }
}
