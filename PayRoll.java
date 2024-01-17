
/**
 * Write a description of class PayRoll here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PayRoll
{
     public static void main(String[]args){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter employees ID number: ");
         int idNumber = input.nextInt();
         System.out.print("Enter hourly rate of pay:$");
         double hourlyRate = input.nextDouble();
         System.out.print("Enter number of hours worked for the week: ");
         double hoursWorked = input.nextDouble();
         
         double regularHours = Math.min(40,hoursWorked);
         double overtimeHours = Math.max(0,hoursWorked-40);
         
         double regularPay = regularHours * hourlyRate;
         double overtimePay = overtimeHours * 1.5 * hourlyRate;
         double grossPay = regularPay + overtimePay;
         double incomeTax = (grossPay>500.00)?0.15*grossPay:0;
         double parkingCharge=20.00;
         double deductions = incomeTax + parkingCharge;
         double netPay = grossPay - deductions;
         
         System.out.println("ID Number:\t\t" + idNumber);
         System.out.println("Pay Rate:\t\t$" + hourlyRate);
         System.out.println("Regular Hours:\t\t" + regularHours);
         System.out.println("Overtime Hours:\t\t" + overtimeHours);
         System.out.println("Total Hours:\t\t" + hoursWorked);
         System.out.println("Regular Pay:\t\t$" + regularPay);
         System.out.println("Overtime Pay:\t\t$" + overtimePay);
         System.out.println("Gross pay:\t\t$" + grossPay);
         System.out.println("Deductions:\t\t$" + deductions);
         System.out.println("Net Pay:\t\t$" + netPay);
        }
     }
     