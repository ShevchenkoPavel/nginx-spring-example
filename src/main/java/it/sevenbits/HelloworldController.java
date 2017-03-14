package it.sevenbits;


import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Controller
public class HelloworldController {

   @RequestMapping("/hello")
   @ResponseBody
   public String home() {
       return "Hello from HelloWorldController!";
   }

}
