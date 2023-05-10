package program;
import java.util.*;

//find any number mathematical table
public class WhileMathematicalTable {

	public static void main(String[] args) {

		
		int n,sum=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Your Number");
		n=obj.nextInt();
		int i=1;
		while(i<=10) {

			sum=n*i;
			System.out.println(n + "*" + i + "=" +sum);
			i++;
		}
	}

}