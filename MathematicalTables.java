
/**
 * Write a description of class MathematicalTables here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MathematicalTables
{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter your number:");
        int number = input.nextInt();
        
        for(int i=1;i<=number;i++){
            if(number<=2){
                int second=i*2;
                System.out.println(i+"\t" + second);
            }else if(number<=3){
                int two=i*2;
                int three=i*3;
                System.out.println(i+"\t" +two+"\t"+three);
            }else if(number<=4){
                int two=i*2;
                int three=i*3;
                int four=i*4;
                System.out.println(i+"\t"+two+"\t"+three+"\t"+four);
            }else if (number<=5){
                int five=i*5;
                int two=i*2;
                int three=i*3;
                int four=i*4;
                System.out.println(i+"\t"+two+"\t"+three+"\t"+four+"\t"+five);
            }else if(number<=6){
               int five=i*5;
                int two=i*2;
                int three=i*3;
                int four=i*4;
                int six=i*6;
                System.out.println(i+"\t"+two+"\t"+three+"\t"+four+"\t"+five+"\t"+six);
            }else if(number<=7){
              int five=i*5;
                int two=i*2;
                int three=i*3;
                int four=i*4;
                int six=i*6;
                int seven=i*7;
                System.out.println(i+"\t"+two+"\t"+three+"\t"+four+"\t"+five+"\t"+six+"\t"+seven);
            }
  
            }
        }
    }