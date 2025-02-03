package estruturasExcepcionais;

import java.util.Locale;
import java.util.Scanner;


public class AboutMe {
    public static void main(String[] args) {
        try {
            
        
        //Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("First name: ");
        String name = scanner.next();

        System.out.println("Surname: ");
        String surname = scanner.next();

        System.out.println("Age: ");
        int age = scanner.nextInt();

        System.out.println("Height: ");
        double height = scanner.nextDouble();

        // Results
        System.out.println("Hi, my name is " + name.toUpperCase() + " " + surname.toUpperCase());
        System.out.println("I am " + age + "years old.");
        System.out.println("I am "+ height + "height");
        scanner.close();

        } catch (java.util.InputMismatchException e) {
            System.err.println("The filds for age and height must be numeric.");
        }
    }
}