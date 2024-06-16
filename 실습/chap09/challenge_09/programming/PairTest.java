package programming_09;

public class PairTest { 
    public static void main(String[] args) {
    	
        Pair<Integer> p1 = new Pair<>(10,20); 
        
        Pair<Double> p2 = new Pair<>(10.0,20.0); 
        
        System.out.println(p1.first()); 
        System.out.println(p2.second()); 
    } 
} 

class Pair <Number>{ 
    Number x, y; 
    
    public Pair (Number x, Number y) { 
        this.x = x; 
        this.y = y; 
    } 
    
    public Number first() { 
        return x; 
    } 
    
    public Number second() { 
        return y; 
    } 
}