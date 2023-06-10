package program;
import java.util.*;
class Company
{
	String cname,ho;
	int est;
	Scanner obj=new Scanner(System.in);
	public void get()
	{
		System.out.println("Enter Company Name & Established Year as well as Headoffice of company");
		cname=obj.next();
		est=obj.nextInt();
		ho=obj.next();
	}
	public void display()
	{
		System.out.println("Company name is "+cname);
		System.out.println("HeadOffice in "+ho);
		System.out.println("Established in "+est);
	}
}
class Emp extends Company
{
	String ename,qu;
	int exp;
	public void get()
	{
		super.get();
		System.out.println("Enter Emp name qualification & Experiation");
		ename=obj.next();
		qu=obj.next();
		exp=obj.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.println("name is "+ename);
		System.out.println("qualification is "+qu);
		System.out.println("Experiance of "+exp+" years");
	}
}
class Department extends Emp
{
	String dpt;
	int salary,exp;
	public void get()
	{
		super.get();
		System.out.println("Enter Employee Department , Salary and Experiance year");
		dpt=obj.next();
		salary=obj.nextInt();
		exp=obj.nextInt();
	}
	public void display()
	{
		super.display();
		System.out.println("Department is " +dpt);
		System.out.println("Salary is " +salary);
		System.out.println("Experience Year is " +exp);

	}
}
public class MultiLevel {

	public static void main(String[] args) {
		Department d=new Department();
		d.get();
		d.display();

	}

}