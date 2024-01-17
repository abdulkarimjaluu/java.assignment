
/**
 * Write a description of class Integer here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Integer
{
   public static void main(String[]args){
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a 2-digit integer where the rightmost digit is non-zero: ");
       int x = input.nextInt();
       int rightDigit = x %10;
       int leftDigit =x/10;
       int y = rightDigit*10 + leftDigit;
       int sum = x+y;
       System.out.println("x:"+ x);
       System.out.println("y:" + y);
       System.out.println("x+y:" + sum);
    }
   }