package com.example.displaymessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class MessageController {

	@GetMapping
	public String getMessage() {
		return "Muzahiddin";
	}
	
	@GetMapping("/list")
	public List<String> getAllList() {
	List<String> list =Arrays.asList("Muzahid","Amzad","Ainu");
	
	return list;
	
	
	}
	
	@GetMapping("/rst")
	public List<String> rst(){
		List<String> list =Arrays.asList("muzahid","Amzad","Ainu");
		List<String> rstlist = new ArrayList<>();
		for(String name: list) {
		String s1=new StringBuilder(name).reverse().toString();
			rstlist.add(s1);
		}
		
		return rstlist;
	}
	
	@GetMapping("/sum")
	public int findSumArrayElements() {
		int [] array = {23,45,65,48,90};
		int sum=0;
		
		for(int elements:array) {
		sum= sum+elements;
		}
		return sum;
		
		
	}
	@GetMapping("/reverse")
	public String reverseString() {
		String str= "Muzahiddin Baadsha";
		String rts ="";
		for(int i=str.length()-1; i>=0; i--) {
			rts =rts+str.charAt(i);
		}
		return rts;
	}
	
	@GetMapping("/primeNumber")
	
	public Boolean isprime() {
		int number = 25;
		if(number<=1) {
			return false;
		}
		for(int i=2; i<=number; i++) {
			if(number%i==0) {
				return false;
			}
			
		}
		return true;
			
		
	}
	
	@GetMapping("/price")
	public Double bill() {
		int nune =100;
		int papad =10;
		int quantity =2;
		
		double bill=nune+papad*quantity;
		if(bill>=100) {
			bill*=0.9;
		}
		return bill;
		
	
	}
	
	@GetMapping("/fact")
	public int fact() {
		int number =5;
		int result =1;
		if(number==0) {
			return 0;
		}else {
			for(int i=number; i>=1; i--) {
				result *=i;
			}
		}
		return result;
	}
	@GetMapping("/polindrome")
	public String polindrome() {
		String str= "AmmA";
		String rts=new StringBuilder(str).reverse().toString();
		return rts+" is polindrome";
	}
}
