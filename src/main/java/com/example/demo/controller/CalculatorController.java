package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CalculatorEntity;

@RestController
public class CalculatorController {
	
	
	@PostMapping("/add")
	public String add(@RequestBody CalculatorEntity cal)
	{
		int num1= cal.getNum1();
		int num2= cal.getNum2();
		int total = num1+num2;
		
		return num1+" + "+num2+" is "+total ;
	}
	
	@PostMapping("/sub")
	public String sub(@RequestBody CalculatorEntity cal)
	{
		int num1= cal.getNum1();
		int num2= cal.getNum2();
		int total = num1-num2;
		
		return num1+" - "+num2+" is "+total ;
	}
	
	@PostMapping("/mul")
	public String mul(@RequestBody CalculatorEntity cal)
	{
		int num1= cal.getNum1();
		int num2= cal.getNum2();
		int total = num1*num2;
		
		return num1+" * "+num2+" is "+total ;
	}
	
	@PostMapping("/div")
	public String div(@RequestBody CalculatorEntity cal)
	{
		int num1= cal.getNum1();
		int num2= cal.getNum2();
		int total = num1/num2;
		
		return num1+" / "+num2+" is "+total ;
	}

}
