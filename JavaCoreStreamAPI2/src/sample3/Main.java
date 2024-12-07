package sample3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cat> cats = Arrays.asList(
		new Cat ("Teo",2,"Red"),
		new Cat("Mari",7,"White"),
		new Cat("Bro",3,"Black"),
		new Cat("Neak",5,"Yellow"),
		new Cat("Simba",1,"Grey")
		);
		List<Cat>result=cats.stream()	
				.filter(cat -> cat.getWeight() >= 3)
				.sorted(Comparator.comparing(Cat::getName))
				.collect(Collectors.toList());
		System.out.println(result);
		
		
	}

}
