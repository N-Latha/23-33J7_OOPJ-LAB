import java.util.Scanner;
class person{
  String name;
  int age;
  double salary;
  void getdetails()
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the name?");
  name=sc.next();
  System.out.println("Enter the age?");
  age=sc.nextInt();
  System.out.println("Enter the salary?");
  salary=sc.nextDouble();
  }
  void display()
  {
  System.out.println("Display details");
  System.out.println("Name :"+name);
  System.out.println("Age :"+age);
  System.out.println("salary:"+salary);
  }
  }
public class Main
{
public static void main(String[] args)
{
person p = new person();
 p.getdetails();
 p.display();
 }
}
 
  
	
  
  

