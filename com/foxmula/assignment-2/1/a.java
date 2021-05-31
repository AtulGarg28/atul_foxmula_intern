import java.util.ArrayList;
import java.util.Scanner;

public class a {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");

        System.out.println("Enter element for search.");
        String a=s.next();

        if (arrayList.contains(a)){
            System.out.println("Contains");
        }else{
            System.out.println(("Not Contains"));
        }
        System.out.println(arrayList);
    }
}
