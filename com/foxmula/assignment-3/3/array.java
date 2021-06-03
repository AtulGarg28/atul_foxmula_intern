import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args){
        System.out.println("Enter 5 numbers.");
        Scanner scanner=new Scanner(System.in);
        Integer[] ar=new Integer[5];

        for(int i=0;i<5;i++){
            ar[i]=scanner.nextInt();
        }

        int count=0;
        System.out.println("Enter element for search.");
        int a=scanner.nextInt();
        for (int no:ar){
            if(a==no){
                count++;
            }
        }
        System.out.println("No. of occurences :: "+count);

        System.out.println("Before sorting........");
        for(int i:ar){
            System.out.println(i);
        }
        System.out.println("After sorting.........");
        Arrays.sort(ar);
        for(int i:ar){
            System.out.println(i);
        }
    }
}
