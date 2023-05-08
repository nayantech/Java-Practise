package program;
import java.util.*;
public class Leapyear {

	public static void main(String[] args) {
		int num;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Year :" );
		num=obj.nextInt();
		if(num%4==0) {
			System.out.println("It Is a Leap Year");
		}
		else{
			System.out.println("It is not a Leap Year");
		}
	

	}

}
