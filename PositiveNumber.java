
/**
 * Write a description of class PositiveNumber here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PositiveNumber
{
   public static void main(String[]args){
       Scanner input=new Scanner(System.in);
       double sum=0;
       double number;
       do{
           System.out.print("Enter a series of positive numbers(or a negative number to end): ");
           number = input.nextDouble();
           if(number>=0){
               sum +=number;
           }else if (number<0){
               System.out.println("Ending input.Negative number entered.");
           }
        }while(number>=0);
        System.out.println("Sum of positive numbers: " + sum);
       }
    }