package sample1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text = "Today is a beautiful day"; 
	        List<String> words = Arrays.asList(text.split(" "));
	        
	        List<String> resultWords = words.stream()
	                                        .filter(word -> word.length() <= 5) 
	                                        .collect(Collectors.toList());
	        
	        System.out.println(resultWords);
	}

}
