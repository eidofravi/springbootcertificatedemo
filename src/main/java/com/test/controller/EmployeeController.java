package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
   @RequestMapping("/")
    public String getEmployees()
    {
     return "hello employee!";
    }
}