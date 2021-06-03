import java.util.Scanner;

public class check {

    public static void main(String[] args) throws CustomException{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no.");
        int no = scanner.nextInt();
        int count=0;
        for (int i=2;i<no;i++){
            if(no%i==0){
                count++;
            }
        }
        if (count>0){
            System.out.println("Not");
        }else {
            System.out.println("Odd and prime");
            throw new CustomException("Exception occurs...........");           //The no. which is prime will also be odd.
        }

    }
}
