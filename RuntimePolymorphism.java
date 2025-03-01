class Animal
{
void makesound()
{ 
System.out.println("The animal makes sound");
}
}
class Dog extends Animal
{
void makesound()
{
System.out.println("The dog makes sound as bow,bow");
}
}
class Cat extends Animal
{
void makesound()
{
System.out.println("The cat makes sound as meow,meow");
}
}
public class RuntimePolymorphism
{
public static void main(String[] args)
{
Animal myAnimal;
myAnimal=new Dog();
myAnimal.makesound();
myAnimal=new Cat();
myAnimal.makesound();
}
}