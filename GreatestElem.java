package program;
import java.util.*;
public class GreatestElem {

	public static void main(String[] args) {
		int i,n,max,min,flag=0;
		int a[]=new int[20];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limits of array");
		n=s.nextInt();
		System.out.println("Enter "+n+" elements in array");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Elements of array as follows");
		for(i=0;i<n;i++)
		{
			System.out.println(" "+a[i]);
		}
	    max = min = a[0];
        
        for(i = 1; i < n; i++) {
            if(a[i] > max)
                max = a[i];
            else if (a[i] < min)
                min = a[i];
                
        }
        
        System.out.println("Largest Number : " + max);
        System.out.println("Smallest Number : " + min);

	}

}

