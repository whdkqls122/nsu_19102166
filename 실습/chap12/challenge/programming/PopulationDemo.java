package programming_12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Population {
    private final String city;
    private final double population;

    public Population(String city, double population) {
        this.city = city;
        this.population = population;
    }

    public String getCity() {
        return city;
    }

    public double getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return city + "(" + population + ")";
    }
}

public class PopulationDemo {

	 public static void main(String[] args) {
	        List<String> cities = Arrays.asList("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
	        List<Double> populations = Arrays.asList(973.7, 63.2, 2115.0, 224.4, 326.5, 853.9);

	        Stream<Population> populationStream = zipLists(cities, populations);

	        populationStream.filter(p -> p.getPopulation() > 300.0)
	                        .forEach(System.out::println);
	    }

	    private static Stream<Population> zipLists(List<String> cities, List<Double> populations) {
	        if (cities.size() != populations.size()) {
	            throw new IllegalArgumentException("리스트의 크기가 같아야 합니다.");
	        }
	        
	        return Stream.iterate(0, i -> i + 1)
	                     .limit(cities.size())
	                     .map(i -> new Population(cities.get(i), populations.get(i)));
	    }

}
