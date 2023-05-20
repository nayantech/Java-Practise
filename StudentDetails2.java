package program;

import java.util.Scanner;

//Write a Program in java to display student name, roll no , standard , and marks obtain in 3 subject and calculate total marks obtain in 3 subjects and percentage 

class Details1{
	
	String stud;
	int st;
	float sum=0,per,st1;
	
	
	Details1(){
		System.out.println("Enter Student details :");
	}
	Details1(String n){
		stud=n;
		System.out.println("Name is : " +stud);
	}
	Details1(int r){
		st=r;
		System.out.println("roll No. " + st);
	}
	Details1(float sta){
		st1=sta;
		System.out.println("Standard is . " + st1);
	}
	Details1(float m1,float m2, float m3){
		System.out.println("Enter Subject Marks is : " + m1 + " " + m2 + " " + m3 );
		sum=m1+m2+m3;
		System.out.println("Total marks is : " + sum );
		per=sum/300*100;
		System.out.println("Percentage is : " + per);
	}
	
	
	
	
}



public class StudentDetails2 {

	public static void main(String[] args) {
		int roll  ;
		float mark1,mark2,mark3,stand;
		String name;
		
		Scanner obj = new Scanner(System.in);
		Details1 d1 = new Details1();
		
		System.out.println("Enter Student Name : ");
		name=obj.nextLine();
		Details1 d2 = new Details1(name);
		
		System.out.println("Enter Roll No : ");
		roll = obj.nextInt();
		Details1 d3 = new Details1(roll);
		
		System.out.println("Enter Standard : ");
		stand = obj.nextFloat();
		Details1 d4 = new Details1(stand);
		
		System.out.println("Enter English Subject Makrs : ");
		mark1=obj.nextFloat();
		System.out.println("Enter Hindi Subject Marks : ");
		mark2=obj.nextFloat();
		System.out.println("Enter Math Subject Marsk : ");
		mark3=obj.nextFloat();
		Details1 d5 = new Details1(mark1,mark2,mark3);

	}

}
