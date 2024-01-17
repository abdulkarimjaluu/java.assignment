
/**
 * Write a description of class DistanceTravels here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DistanceTravels
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed of the vehicle in mph? ");
        double speed=input.nextDouble();
        System.out.print("Enter hours that has it traveled? ");
        int hours = input.nextInt();
        System.out.println("\nHour\tDistance Traveled");
        for (int hour = 1; hour<=hours; hours++){
            double distance = speed * hour;
            System.out.println(hour + "\t" + distance);
        }
        }
    }
    