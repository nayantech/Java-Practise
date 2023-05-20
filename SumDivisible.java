package program;
import java.util.*;
public class SumDivisible {

	public static void main(String[] args) {
		int i,sum=0;
		System.out.println("Numbers Between 200 and 300, divisible by 9 : \n");
		for(i=201;i<300;i++) {
			if(i%9==0) {
				System.out.print(" " + i);
				sum += i;
			}
		}
		System.out.println("\nThe Sum : " + sum);
	}

}
