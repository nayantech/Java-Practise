package program;
import java.util.*;

//write a program in java to calculate Volume of Cube take input from user?
class Cone
{
	int r,h;
	double vol;
	Scanner sc=new Scanner(System.in);
	public void get()
	{
		System.out.println("Enetr radius of cone:");
		r=sc.nextInt();
		System.out.println("Enetr height of cone:");
		h=sc.nextInt();
	}
	public void display() 
	{
		vol=0.3333*3.14*r*r*h;
		System.out.println("Volume of cone is  " +vol);
	}
}
public class VolCube 
{

	public static void main(String[] args) 
	{
		Cone obj=new Cone();
		obj.get();
		obj.display();

	}

}