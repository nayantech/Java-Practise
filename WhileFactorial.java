package program;
import java.util.*;

//Fine any number of factorial using While loop
public class WhileFactorial {

	public static void main(String[] args) {

		int n,fact=1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number");
		n=obj.nextInt();
		int i=1;
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial is " + n + " is " + fact);
	}

}