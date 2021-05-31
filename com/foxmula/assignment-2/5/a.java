import java.util.ArrayList;
import java.util.Scanner;

public class a {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("One");

        int count=0;
        System.out.println("Enter element for search.");
        String a=s.next();
        for (String st:arrayList){
            if(a.equals(st)){
                count++;
            }
        }

        System.out.println("No. of occurences :: "+count);
        System.out.println(arrayList);
    }
}
