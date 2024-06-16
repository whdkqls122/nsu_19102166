package programming_09;

class Box <Object> { 
    Object random; 
    public void set (Object random) { 
        this.random = random; 
    } 
    
    public Object get() { 
        return  random; 
    } 
}
public class BoxTest { 
    public static void main(String[] args) { 
        Box<Integer> i = new Box<>(); 
        // 오토박싱으로 그냥 100을 써도 무방한듯 
        i.set(new Integer(100)); 
        System.out.println(i.get()); 
        Box<String> s = new Box<>(); 
        s.set("만능이네!"); 
        System.out.println(s.get()); 
    } 
} 
