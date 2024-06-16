package challenge_12;

import java.util.List;
import java.util.stream.Collectors;

enum Gender { 남, 여 }

public class StreamChallenge2 {
	
    public static void main(String[] args) {
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);	
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);

      
        int sum = ages.stream().reduce(0, Integer::sum);	
        System.out.println(sum);			

       
        int maxAge = ages.stream().max(Integer::compare).orElse(0);
        System.out.println(maxAge);			   

        
        double averageAge = ages.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(averageAge);		 																	   
    }
}
