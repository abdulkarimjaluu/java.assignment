
/**
 * Write a description of class EmployeePayChecks here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EmployeePayChecks
{
    public static void main(String[]args){
        double annualSalary = 32500.0;
        double MonthlyPay = annualSalary/24;
        double biWeeklyPay = annualSalary/26;
        System.out.println("For Monthly Pay(24 paychecks per year): $" + MonthlyPay + " per pay period");
        System.out.println("For bi-Weekly pay (26 paychecks per year):$" + biWeeklyPay + " per pay period");
    }
    }

