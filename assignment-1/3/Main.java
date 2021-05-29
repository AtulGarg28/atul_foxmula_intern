import java.util.*;
public class Main
{
    public static void main(String []args)
	{

		Scanner s = new Scanner(System.in);
		int choice;
		while(true){
		    System.out.println("1 Square");
		    System.out.println("2 Rectangle");
		    System.out.println("3 Parallelogram");
		    System.out.println("4 Trapezoid");
		    System.out.println("Enter choice");
		    choice=s.nextInt();
		    switch(choice)
		    {
		        case 1:
		            Square sq=new Square(10,12,15,15,48,23,65,11);
		            System.out.println("Square's area is " + sq.area());
		            break;
                	case 2:
                            Rectangle rec=new Rectangle(14,12,15,4,56,5,6,4);
		            System.out.println("Rectangle's area is " + rec.area());
                            break;
                	case 3:
                            Parallelogram parallelogram=new Parallelogram(2,45,7,5,6,12,10,14,2);
		            System.out.println("Parallelogram's area is " + parallelogram.area());
                            break;
       	         	case 4:
                            Trapezoid trapezoid=new Trapezoid(1,2,54,85,92,6,1,8,2);
		            System.out.println("Trapezoid's area is " + trapezoid.area());
                            break;
		    }
		}		
	}
}

