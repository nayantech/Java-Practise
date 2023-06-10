package program;
import java.util.*;

class Veggi
{
	Veggi()
	{
		System.out.println("Parent class Veggi  with vit as method");
	}
}
class Broccoli extends Veggi
{
	Broccoli()
	{
		System.out.println("It has sufficient amount of vitamin K");
	}
}
class Carrot extends Broccoli
{
	Carrot()
	{
		System.out.println("Lots of vitamin A is present in Carrot");
	}
}
class Lemon extends Carrot
{
	Lemon()
	{
		System.out.println("Lemon is the best source of vitamin C");
	}
}
public class ConstructorInherit {

	public static void main(String[] args) {
		Lemon l=new Lemon();

	}

}