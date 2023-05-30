package program;
import java.util.*;

class Student1{
	
	double per=0,sum=0;
	
	public void Student(int r){
		System.out.println("Roll No is : " + r);
	}
	
	public void Student(String n,int s) {
		System.out.println("Name is : " + n);
		System.out.println("Standard is : " + s);
		
	}
	
	public void Student(int m1, int m2, int m3) {
		sum=m1+m2+m3;
		
		System.out.println("English is " + m1);
		System.out.println("Hindi is " + m2);
		System.out.println("Marathi is " + m3);
		System.out.println("Total Marks obtain is " +sum);
		per=sum/300*100;
		System.out.println("Percentage is : " + per);
	}
}

public class StudentOverloading {

	public static void main(String[] args) {
		int roll,stan,mrk1,mrk2,mrk3;
		String name;
		Student1 c = new Student1();
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Student Details : ");
		
		System.out.println("Enter Student Roll No : ");
		roll=obj.nextInt();
		c.Student(roll);
		
		
		System.out.println("Enter Student Name and Standard : ");
		name=obj.next();
		stan=obj.nextInt();
		c.Student(name,stan);
		
		System.out.println("Enter Marks obtain in 3 subject : ");
		System.out.println("Enter English Subject Marks : ");
		mrk1=obj.nextInt();
		System.out.println("Enter Hindi Subject Marks : ");
		mrk2=obj.nextInt();
		System.out.println("Enter Marathi Subject Marks : ");
		mrk3=obj.nextInt();
		c.Student(mrk1,mrk2,mrk3);
		
	}

}