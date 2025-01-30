import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input for coefficients a, b, and c
        System.out.println("Enter coefficient a (non-zero): ");
        double a = scanner.nextDouble();
        
        System.out.println("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.println("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Step 2: Calculate the discriminant
        double D = (b * b) - (4 * a * c);
        System.out.println("Discriminant (D): " + D);

        // Step 3: Determine the nature of the roots
        if (D > 0) {
            System.out.println("The equation has two real and distinct roots.");
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (D == 0) {
            System.out.println("The equation has two real and equal roots.");
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("The equation has two complex roots.");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}


OUTPUT:
Enter coefficient a (non-zero):
4
Enter coefficient b:
7
Enter coefficient c:
9
Discriminant (D): -95.0
The equation has two complex roots.
Root 1: -0.875 + 1.2183492931011204i
Root 2: -0.875 - 1.2183492931011204i