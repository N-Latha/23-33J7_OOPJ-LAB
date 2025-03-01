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
class puppy extends dog
{
	void weep()
{
	System.out.println("The puppy weeps");
}
}
public class MultilevelInheritance
{
	public static void main(String[]args)
{
	puppy p=new puppy();
	p.eat();
	p.bark();
	p.weep();
}
}