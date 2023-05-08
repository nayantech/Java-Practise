package program;
import java.util.*;
class Sphere {
	int r;
	double vol;
	Scanner sc=new Scanner(System.in);
	public void get() {
		System.out.println("Enter the radius of sphere:");
		r=sc.nextInt();
	}
	public void display() {
		vol=1.33333*3.14*r*r*r;
		
		System.out.println("Volume of Sphere is " +vol);
	}
}
public class VolSphere {


	public static void main(String[] args) 
	{
		Sphere obj=new Sphere();
		obj.get();
		obj.display();
		

	}

}
