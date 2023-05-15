package program;
import java.util.*;

//To find Array of maximum number and minimum Number?
public class ArrayMaxMin {

	public static void main(String[] args) {
		int a[]=new int[50];
		int i,n,max,min;
		Scanner obj=new Scanner(System.in);
		System.out.println("How many array");
		n=obj.nextInt();
		max=a[0];
	
		System.out.println("Enter "+n+"Element in array");
		for(i=0;i<n;i++) {
			a[i]=obj.nextInt();
		}
		System.out.println("Array element are as follow ");
		for(i=0;i<n;i++) {
			System.out.print(" "+a[i]);
		}
		for(i=0;i<n;i++){
			if(max<a[i])
				max=a[i];
		}
		min=a[0];
		for(i=0;i<n;i++) {
			if(min>a[i])
				min=a[i];
		}
		System.out.println("\nMaximum number is "+max);
		System.out.println("\nMinimum number is "+min);
	}

}