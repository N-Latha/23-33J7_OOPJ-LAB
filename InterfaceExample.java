interface IntfA
{
void cook();
void eat();
}
class cook implements IntfA
{
public void cook()
{
System.out.println("We have to cook the food");
}
public void eat()
{
System.out.println("We have to eat the food");
}
}
public class InterfaceExample
{
public static void main(String [] args)
{
IntfA c=new cook();
c.cook();
c.eat();
}
}
