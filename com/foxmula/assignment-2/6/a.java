import java.util.ArrayList;
import java.util.Scanner;

public class a {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter 5 numbers.");
        arrayList.add(s.nextInt());
        arrayList.add(s.nextInt());
        arrayList.add(s.nextInt());
        arrayList.add(s.nextInt());
        arrayList.add(s.nextInt());

        System.out.println(arrayList.get(1));

        System.out.println("Enter element of sum.");
        int sum = s.nextInt();

        System.out.println("The pairs are::");

        for (int i=0;i<arrayList.size();i++){
            for (int j=i+1;j<arrayList.size();j++){
                if(sum==(arrayList.get(i)+ arrayList.get(j))){
                    System.out.println("("+arrayList.get(i)+","+arrayList.get(j)+")");
                }
            }
        }
    }
}
