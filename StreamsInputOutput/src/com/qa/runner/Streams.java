package com.qa.runner;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Bob", "Trevor", "Steve", "Gary");
		names.stream()
        	.forEach(x -> System.out.println("hello " + x));
		
		
		List<Integer> number = Arrays.asList(3,4,7,8,12);
	    int product = 
	        number.stream()
	            .reduce((a,b) -> a*b)
	            .get();
	    System.out.println("Product of all numbers " + product);
	    
	    Optional<Integer> max1 =
	    		number.stream().max((a,b) -> a.compareTo(b));
	    		
	    System.out.println(max1);
	    
	    Optional<Integer> min1 =
	    		number.stream().min((a,b) -> a.compareTo(b));
	    		
	    System.out.println(min1);
	
	  
	   List<Integer> even = 
	       number.stream()
	                .filter(x -> x % 2 != 0)
	                .collect(Collectors.toList());
	   System.out.println(even);
	   
	   List<Integer> odd = 
		       number.stream()
		                .filter(x -> x % 2 == 0)
		                .collect(Collectors.toList());
		   System.out.println(odd);
	       
		  
		    int sum = 
		        number.stream()
		            .reduce((a,b) -> a+b)
		            .get();
		    System.out.println("Sum of all numbers " + sum);
		    
		   List<Integer> oddsquares =
		    		number.stream()
		    		.map(x -> x*x)
		    		.filter(x -> x % 2 != 0)
		    		.collect(Collectors.toList());
		   Optional<Integer> minvalue =
				   oddsquares.stream()
				   .min((a,b) -> a.compareTo(b));
		   
		   System.out.println(minvalue);
	}
}
