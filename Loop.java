
/**
 * Write a description of class Loop here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Loop
{
  public static void main(String[]args){
      Scanner input=new Scanner(System.in);
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      int number;
      do{
          System.out.print("Enter an integer (or -99 to end):");
          number=input.nextInt();
          if(number!=-99){
              if(number<min){
                  min = number;
              }
              if(number>max){
                  max=number;
              }
          }
      }while (number!= -99);
      if (min !=Integer.MAX_VALUE && max != Integer.MIN_VALUE){
          System.out.println("\nSmallest number entered: " + min);
          System.out.println("Largest number entered: " + max);
        }else{
            System.out.println("No valid numbers entered.");
        }
      }
  }