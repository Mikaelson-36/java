package test;
import java.util.*;
public class MyException{
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		int c=10;
	    int b,a;
	    
	    try {
	    	a=sc.nextInt();
	    	b=c/a;
	    }
	    catch(ArithmeticException e) {
	    	System.out.println("Arithemetic error:"+e);
	    }
	    catch (InputMismatchException ex) {
	    	System.out.println("InputMismatchException:"+ex);
	    }
	   
	    
	}
	
}
