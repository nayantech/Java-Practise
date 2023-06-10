package program;
import java.util.*;

//Overloading

class Operators{
	int add;
	double sub;
	public void calcu(int i1,int i2) {
		add=i1+i2;
		System.out.println("Addition of " + i1 + "and" + i2 + "is : " +add);
		
	}
	
	public void calcu(double i1, double i2) {
		sub=i1-i2;
		System.out.println("Subtraction of " + i1 + "and " + i2 +"is : " +sub );
	}
}
public class OverloadingPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1,a2;
		double b1,b2;
		Operators obj = new Operators();
		Scanner c = new Scanner(System.in);
		System.out.println("Enter Two Number for Addition :");
		a1=c.nextInt();
		a2=c.nextInt();
		obj.calcu(a1,a2);
		
		System.out.println("Enter Two Number for Subtraction :");
		b1=c.nextDouble();
		b2=c.nextDouble();
		obj.calcu(b1,b2);
		
	}

}