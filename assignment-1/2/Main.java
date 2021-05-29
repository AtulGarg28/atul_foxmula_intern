import java.util.*;
public class Main
{
    private int[] stack;
    private int max,top;
    
    Main(int max){
        this.max=max;
        stack = new int[max];
        top=-1;
    }
    
    boolean push(int data){
        boolean result=false;
        if(top>=max){
            System.out.println("Stack overflowed....");
            result=false;
        }else{
            top++;
            stack[top]=data;
            result=true;
        }
        return result;
    }
    
    int pop(){
        int pop_no=0;
        if(top<=-1){
            System.out.println("Stack is already empty....");
            pop_no=0;
        }else{
            pop_no=stack[top];
            top--;
        }
        return pop_no;
    }
    
    boolean checkEmpty(){
        boolean result=false;
        if(top<=-1){
            System.out.println("Stack empty");
            result=true;
        }
        return result;
    }
    
    int count(){
        if(top>-1){
            return top+1;
        }
        return 0;
    }
    
    
    
    
	
}
