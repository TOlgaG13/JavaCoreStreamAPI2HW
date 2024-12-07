package sample4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> xmlLines = Arrays.asList("<dependency>", "<groupId>junit</groupId>",
				"<artifactId>junit</artifactId>", "<version>4.4</version>", "<scope>test</scope>", "</dependency>",
				"<dependency>", "<groupId>org.powermock</groupId>", "<artifactId>powermock-reflect</artifactId>",
				"<version>3.2</version>", "</dependency>");
		List<String> groupIds = xmlLines.stream().filter(line -> line.contains("<groupId>"))
				.map(line -> line.replaceAll(".*<groupId>(.*)</groupId>.*", "$1")).collect(Collectors.toList());

		System.out.println(groupIds);
	}

}
