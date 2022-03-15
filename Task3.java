package task3;
import java.util.Scanner;

public class Task3 {
   public static void main(int number, int isPower) {
      
      float check = isPower;
      boolean output = false;

      int i;
      for(i=1; number<=check; check/=number) {
    	 // to prevent infinite loop which occurs if two numbers are both 1
         if(number == 1 && check ==1) {
            output = true;
            break;
         }
         // No matter how many times you square 1 in a different number, it cannot be changed to another number.
         else if (number ==1 && check !=1) {
            output = false;
            break;
         }
         // to show that same numbers (except 1) are in square relationship.
         else if (check==number) {
            output = true;
            System.out.printf("power = %d\n", i);
         }
         i++;   
      }
      // Every number is 1 if you square it by zero.
      if (number !=1 && check ==1) {
     	 output = true;
     	 System.out.printf("power = 0\n");
      }
      System.out.printf("Output: %s\n", output);
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the number: ");
      int randomNum = sc.nextInt();
      System.out.print("Enter your guessed power of above number: ");
      int guessNum = sc.nextInt();
      
      System.out.println("==========================");
      main(randomNum,guessNum);   
   }
}