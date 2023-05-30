package program;
import java.util.*;


//to take value from user employee data and by using class and object?
class Details{
	String name,department;
	int id,salary,age;
	Scanner obj = new Scanner(System.in);
	public void get() {
		
		
		System.out.println("Enter Employee Details  : ");
		System.out.println("Enter  Employe Name : ");
		name=obj.nextLine();
		System.out.println("Enter Employe id : ");
		id=obj.nextInt();
		System.out.println("Enter Employe Age : ");
		age=obj.nextInt();
		System.out.println("Enter Employe Salary : ");
		salary=obj.nextInt();
		System.out.println("Enter Employe Department : ");
		department=obj.next();
		
	}
	
	public void display() {
		System.out.println("Name is : " + name );
		System.out.println("Id no : " + id);
		System.out.println("Age : " + age );
		System.out.println("Salary :" + salary);
		System.out.println("Department : " + department);
	}
}

public class Employee2 {

	public static void main(String[] args) {
		
		Details d = new Details();
		d.get();
		d.display();
	}

}