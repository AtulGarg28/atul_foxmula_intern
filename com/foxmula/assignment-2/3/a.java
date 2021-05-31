import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class a {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Set<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("a");
        set.add("A");
        set.add("AB");
        set.add("Ab");
        set.add("One");
        set.add("one");

        System.out.println(set);
        System.out.println(set.size());
        for(String st:set){
            System.out.println(st);
        }

        System.out.println("*******Using object array.*********");
        Object[] arr = set.toArray();
        for(Object st:arr){
            System.out.println(st);
        }
    }
}
