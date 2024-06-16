package challenge_12;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamChallenge{
    public static void main(String[] args) {
        
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");

        List<String> filteredNames = names.stream()	
                .filter(name -> {					 
                    String firstName = name.substring(0, 1);	              
                    return firstName.compareTo("��") < 0;		
                })
                .collect(Collectors.toList());	

        for (String name : filteredNames) {
        	System.out.print(name + " ");						
        }
        
        System.out.println("");
        names.stream().sorted().forEach(name -> System.out.print(name + " ")); 
        Optional<String> firstname = names.stream().findFirst();			   
        System.out.println("\n" + firstname);																   
        
        firstname.ifPresent(name -> System.out.println(name));				   
    
        long count = names.stream().count();								   
        																	   
        System.out.println(count);											   
    }
}
