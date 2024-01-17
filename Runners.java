
/**
 * Write a description of class Runners here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Runners
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name of the runners");
        System.out.println();
        String[]runners=new String[3];
        int[]times=new int[3];
        
        for(int i=0;i<3;i++){
            System.out.println("Enter name of runners" +(i+1)+";");
            runners[i]=input.nextLine();
            
            System.out.println("Enter finish time for "+runners[i]+";");
            times[i]=input.nextInt();
            input.nextLine();
        }
        
        System.out.println("\nOrder of runners");
        
        for(int i=0;i<3;i++){
            System.out.println((i+1)+ "."+runners[i]+"-"+times[i]+"minutes");
        }
    }
}
   