package com.mycompany.propertymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.propertymanagement.model.CalculatorDTO;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {
    
    //http://localhost:8080/api/v1/calculator/add?num1=6.7&num2=1.3
    @GetMapping("/add")
    public Double add(@RequestParam("num1") Double num1, @RequestParam("num2") Double num2) {
        return num1 + num2;
    }
    
    @GetMapping("/sub/{num1}/{num2}")
    public Double subtract(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        Double result = null;
        if(num1>num2) {
            result = num1-num2;
        } else {
            result = num2-num1;
        }
        return result;

    }

    @PostMapping("/mul")
    public Double multiply(@RequestBody CalculatorDTO calculatorDTO) {
        Double result = null;
        result = calculatorDTO.getNum1() * calculatorDTO.getNum2() * calculatorDTO.getNum3() * calculatorDTO.getNum4();
        return result;
    }

}
