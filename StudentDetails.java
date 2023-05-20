package program;
import java.util.*;

//Write a Program in java to display student name, roll no , standard , and marks obtain in 3 subject and calculate total marks obtain in 3 subjects and percentage 


class Data
{
	int stu;
	
	float mrk1,mrk2,mrk3,sum=0,stu1;
	float cent;
	String name;

	Data(String n)
	{
		name = n;
		System.out.println("Students Name is : " + name);

	}
	Data(int r){
		stu = r;
		System.out.println("Students Roll is : " + stu);
	}

	Data(Float st)
	{
		stu1=st;
		System.out.println("Students Standard is : " + stu1);
	}
	Data(float m1, float m2, float m3)
	{
		mrk1=m1;
		mrk2=m2;
		mrk3=m3;

		System.out.println("Marks in 3 sub are : " +mrk1+ " " +mrk2+ " " +mrk3);
		sum=mrk1+mrk2+mrk3;
		System.out.println("Total Marks Obtain is : " + sum);
		cent=sum/300*100;
		System.out.println("Percentage is : " + cent);
	}




}
public class StudentDetails {

	public static void main(String[] args) {
		int roll;
		float mrks1,mrks2,mrks3,stand;
//		double cent;
		String name;
		Scanner s=new Scanner(System.in);

		System.out.println("Enter Name of Student : ");
		name=s.nextLine();
		Data d2=new Data(name);
		
		System.out.println("Enter Roll No. of Student : ");
		roll=s.nextInt();
		Data d3=new Data(roll);
		
		System.out.println("Enter Standard of Students");
		stand=s.nextFloat();
		Data d4=new Data(stand);
		
		System.out.println("Enter Marks in 3 subject of Students");
		System.out.println("Enter English Subject Marks : " );
		mrks1=s.nextInt();
		System.out.println("Enter Hindi Subject Marks : ");
		mrks2=s.nextInt();
		System.out.println("Enter Math Subject Marks : ");
		mrks3=s.nextInt();
		Data d5=new Data(mrks1,mrks2,mrks3);
		


	}

}