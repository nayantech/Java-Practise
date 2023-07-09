package program;
import java.util.*;

class EvenOdd extends Exception{
	String st;
	EvenOdd(String s){
		st=s;
	}
	public String toString() {
		return st;
	}
}

class Num{
	public void check(int n) throws EvenOdd{
		if(n%2!=0) {
			throw new EvenOdd("Number is Not Divisible By 2 :((");
		}
		else {
			System.out.println("Number is Even");
		}
	}
}
public class User_Defined_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Number");
			n=sc.nextInt();
			Num c = new Num();
			c.check(n);
		}
		catch(EvenOdd e) {
			System.out.println(e.toString());
		}
	}

}
