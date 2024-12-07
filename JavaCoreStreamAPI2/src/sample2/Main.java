package sample2;

import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text = "gfj^*&gfn g3829^&*^**_$#@ /*/-#@@# @!@>?>"; 
		  String result = text.chars()  
	                .filter(ch -> Character.isLetter(ch) || Character.isWhitespace(ch)) 
	                .mapToObj(c -> String.valueOf((char) c)) 
	                .collect(Collectors.joining()); 
	        
	        System.out.println(result);
	    }
	}
	

