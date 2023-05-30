package program;
import java.util.*;



// to take employe detail form user by using constructor?
class Employ{
	String em,depart;
	int ide,agee,sala;
	
	Employ(String n,String d){
		em = n;
		System.out.println("Employee Name is : " + n);
		depart = d;
		System.out.println("Department is : "  + d);
	}
	Employ(int i,int a,int s){
		ide = i;
		System.out.println("Id no . "+ i);
		agee = a;
		System.out.println("Age is : " + a);
		sala = s;
		System.out.println("Salary is : " + s);
	}


	
}

public class Employee {

	public static void main(String[] args) {
		int id,age,salary;
		String name,department;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Employee Details : ");
		System.out.println("Enter Employe Name and Department : ");
		name=obj.nextLine();
		department=obj.nextLine();
		Employ c = new Employ(name,department);
		
		System.out.println("Enter Employee id,age,salray : ");
		id=obj.nextInt();
		age=obj.nextInt();
		salary=obj.nextInt();
		Employ c1 = new Employ(id,age,salary);
		

		

	}

}