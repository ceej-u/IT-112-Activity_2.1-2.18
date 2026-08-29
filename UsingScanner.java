//Urbano Christian James/BSIT-NETSEC/1st Year/1-1
import java.util.Scanner;
public class UsingScanner 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter your middle name: ");
        String middleName = input.next();
        System.out.print("Enter your last name: ");
        String lastName = input.next();
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
    }
}
