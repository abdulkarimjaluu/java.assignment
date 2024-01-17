
/**
 * Write a description of class Table here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import javax.swing.Box;

public class Table
{
    public static void main(String[]args){
        System.out.print("N=\t10*N\t100*N\t1000*N");
        int n=1;
        while(n<=5){
            int tenTimesN = 10*n;
            int hundredTimesN= 100*n;
            int thousandTimesN = 1000*n;
            System.out.println(n+"\t" + tenTimesN + "\t" + hundredTimesN + "\t" +thousandTimesN);
            n++;
        }
    }
}
    
    