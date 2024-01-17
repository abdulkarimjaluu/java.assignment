
/**
 * Write a description of class QuizScore here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class QuizScore
{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the quiz score(0-5): ");
        int quizScore = input.nextInt();
        
        String grade;
        switch(quizScore){
            case 5:
                grade="A";
                break;
                case 4:
                    grade="B";
                    break;
                    case 3:
                        grade="C";
                        break;
                        case 2:
                            grade="D";
                            break;
                            case 1:
                                grade="F";
                                break;
                                case 0:
                                    grade="F";
                                    break;
                                    default:
                                        
        System.out.println("Please enter a valid quiz score btn 0 and 5.");
        return;
    }
    System.out.println("The grade for the quiz score" + quizScore + "is:" +grade);
                                
                                
                                
                
        }
    }
   