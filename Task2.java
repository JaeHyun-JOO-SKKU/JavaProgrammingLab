package task2;
import java.util.Scanner;

public class Task2 {

   public static void main(String[] args) {
            int numberofDays;
            int quo; // from quotient that Days divided by 7
            int rem; // from remainder that Days divided by 7
            int quoSum = 0;
            int sumSum = 0;
            int restSum;
            int sum;

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of days: ");
            numberofDays = sc.nextInt();
            
            quo = numberofDays/7;
            rem = numberofDays%7;
            
            int i = 0;
            while(i<quo) {
               //As of the 7th, added the value of the week that has passed by. 
               quoSum=7*(2000+1000*i);
               //every 7days, multiple by 1,000
               sumSum+=quoSum;
               quoSum = 0;
               i++;
            }
            
            //Add the rest of the value.
            restSum = rem*(2000+1000*quo);
            
            //Adding the sum multiplied by the quotient and the sum of the remainder.
            sum=sumSum+restSum;
            
            System.out.println("===================================");
            System.out.println("Jin's total savings after " + numberofDays + "days: " + sum +" won");

         }
   }

