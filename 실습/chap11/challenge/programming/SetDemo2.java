package programming_11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {

	 public static void main(String[] args) {
	        Set<String> hashSet = new HashSet<>();
	        hashSet.addAll(Arrays.asList("독수리", "나비", "염소", "고양이", "개미", "여우"));
	        System.out.println("hashset: " + hashSet);

	        Set<String> treeSet = new TreeSet<>(hashSet);
	        System.out.println("treeset: " + treeSet);

	        System.out.println("첫 번째 동물: " + ((TreeSet<String>) treeSet).first());
	        System.out.println("마지막 동물: " + ((TreeSet<String>) treeSet).last());
	        System.out.println("나비 앞에 있는 동물: " + ((TreeSet<String>) treeSet).lower("나비"));
	    }

}
