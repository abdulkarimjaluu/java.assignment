
/**
 * Write a description of class Palindrome here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a five-digit integer:");
        int number = input.nextInt();
        
        int ProcessOne=number%10;
        int ProcessTwo=number/10;
        
        int PalindromeNumber=ProcessOne*10+ProcessTwo;
        
        if(number==PalindromeNumber){
            System.out.println("the number: " + number + "is Palindrome");
        }else{
            System.out.println("the number: " + number + "is not palindrome");
        }
        }
        
    }
        
        
    