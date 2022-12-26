package com.vivek.FabHotel.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

 @GetMapping("/home")
 public static String PostSwagger(){

    return "Status : Success , ErrorMessage : Success ";
 }
    
}
