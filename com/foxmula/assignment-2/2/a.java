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

        System.out.println("Enter element for search.");
        String a=s.next();

        if (set.contains(a)){
            System.out.println("Contains");
        }else{
            System.out.println(("Not Contains"));
        }
        System.out.println(set);
    }
}
