import java.util.*;
class stack{

	public static void main(String[] args) {
		check c=new check();
		Main m1 = new Main(10);
		Main m2 = new Main(10);
		Scanner s = new Scanner(System.in);
		int choice,data;
		while(true){
		    System.out.println("1 to push in 1st stack.");
		    System.out.println("2 to push in 2nd stack.");
		    System.out.println("3 to pop in 1st stack.");
		    System.out.println("4 to pop in 2nd stack.");
		    System.out.println("Enter choice");
		    choice=s.nextInt();
		    switch(choice)
		    {
		        case 1:
		            System.out.println("Enter data to push in 1st stack");
		            data = s.nextInt();
		            m1.push(data);
		            c.checkIfEqual(m1,m2);
		            break;
                case 2:
                    System.out.println("Enter data to push in 2nd stack");
                    data = s.nextInt();
		            m2.push(data);
		            c.checkIfEqual(m1,m2);
                    break;
                case 3:
                    System.out.println("Element popped: "+m1.pop()+" from 1st stack");
                    c.checkIfEqual(m1,m2);
                    break;
                case 4:
                    System.out.println("Element popped: "+m2.pop()+" from 2nd stack");
                    c.checkIfEqual(m1,m2);
                    break;
		    }
		}
	}
}