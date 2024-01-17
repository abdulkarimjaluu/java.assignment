
/**
 * Write a description of class Rainfall here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Rainfall
{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numYears = input.nextInt();
        int totalMonths = numYears*12;
        double totalRainfall=0;
        for(int year =1; year<=numYears;year++){
            for(int month = 1; month<=12;month++){
                System.out.print("Enter the inches of rainfall for year" + year + ",Month" + month + ":");
                double rainfall = input.nextDouble();
                totalRainfall += rainfall;
            }
        }
        double averageRainfall=totalRainfall/totalMonths;
        System.out.println("\nNumber of months: " + totalMonths);
        System.out.println("Total inches of rainfall: " + totalRainfall);
        System.out.println("Average rainfall per month:" + averageRainfall + "inches");
      }
        }
    