
/**
 * Write a description of class TaxCalculator here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TaxCalculator
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double ASSESSMENT_PERCENTAGE = 0.6;
        double TAX_RATE_PER_100 = 2.64;
        
        System.out.print("Enter the actual value of the property: $");
        double actualValue = input.nextDouble();
        double assessedValue =actualValue *  ASSESSMENT_PERCENTAGE;
        double annualTax = (assessedValue / 100) * TAX_RATE_PER_100;
        System.out.println("For a property Valued at $" + actualValue);
        System.out.println("Assessed Value: $" + assessedValue);
        System.out.println("Annual property tax: $" + annualTax);
    }
    }