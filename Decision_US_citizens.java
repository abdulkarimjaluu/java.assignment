
/**
 * Write a description of class Decision_US_citizens here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Decision_US_citizens
{
   public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your age: ");
       int age = input.nextInt();
       System.out.print("Enter the number of years you have been a US citizen:");
       int yearsOfCitizenship = input.nextInt();
       boolean senateEligible = age >= 30 && yearsOfCitizenship >=9;
       boolean houseEligible = age >= 25 && yearsOfCitizenship >=7;
       System.out.println("\nSenate Eligibility: " + (senateEligible ? "Yes" : "No"));
       System.out.println("House Eligibility: " + (houseEligible ? "Yes" : "No"));
    }
   }