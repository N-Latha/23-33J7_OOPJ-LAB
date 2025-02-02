
class Student {
    String name;
    int age;
 Student() {
        System.out.println("Default Constructor Called!");
        }
 Student(String studentName, int studentAge) {
        System.out.println("Parameterized Constructor Called!");
        name = studentName;
        age = studentAge;
    }
void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
  }
}
public class ConstructorExample {
    public static void main(String[] args) {
     Student s1 = new Student();
        s1.display();
		Student s2 = new Student("John", 20);
        s2.display();
    }
}
