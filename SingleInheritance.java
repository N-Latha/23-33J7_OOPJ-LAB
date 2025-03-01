class animal{
	void eat()
	{
		System.out.println("The animal eat food");
	}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("The dog barks");
	}
}
public class SingleInheritance
{
	public static void main(String[]args)
{
	dog d=new dog();
	d.eat();
	d.bark();
}
}