//Urbano Christian James/BSIT-NETSEC/1st Year/1-1
import java.util.Scanner;
public class ConcatenateString 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = input.next();
        System.out.print("Enter a color: ");
        String color = input.next();
        System.out.print("Enter an animal: ");
        String animal = input.next();
        System.out.print("Enter a food: ");
        String food = input.next();

        System.out.println("I had a dream that " + name
                + " ate a " + color + " " + animal
                + " and said it tasted like " + food + "!");
    }
}
