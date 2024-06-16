package programming_12;

import java.util.stream.Collectors;

import chapter_12.Nation;

public class NationStream1 {

	 public static void main(String[] args) {
	        String result = Nation.nations.stream()
	                                      .filter(nation -> !nation.isIsland())
	                                      .map(Nation::getName)
	                                      .collect(Collectors.joining(", "));

	        System.out.println(result);
	    }
}
