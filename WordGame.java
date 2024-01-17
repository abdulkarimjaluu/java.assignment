
/**
 * Write a description of class WordGame here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class WordGame
{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=input.nextLine();
        System.out.print("Enter your age:");
        int age=input.nextInt();
        System.out.print("Enter your city:");
        String city=input.nextLine();
        System.out.print("Enter your college:");
        String college=input.nextLine();
        System.out.print("Enter your profession:");
        String profession=input.nextLine();
        System.out.print("Enter a type of animal:");
        String animal=input.nextLine();
        System.out.print("Enter your petname:");
        String petname=input.nextLine();
        System.out.println("\n There once was a person named" + name + "who lived in" + city + ".");
        System.out.println("At the age of" + age + "," + name + "went to college at" + college + ".");
        System.out.println(name + "graduated and went to work as a " + profession + ".");
        System.out.println("Then," + name + "adopted a(n)" + animal + "named" + petname + ".");
        System.out.println("They both lived happily ever after!");
    
    }
    }

