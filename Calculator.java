import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
           try (Scanner keyboard = new Scanner(System.in)) {


               System.out.print("Type any # | ");
               double a = keyboard.nextDouble();
               System.out.print("Enter a Symbol 1 = + , 2 = - , 3 = * , 4 = / ,  | ");
               int b = keyboard.nextInt();
               System.out.print("Type another # | ");
               double c = keyboard.nextDouble();
               System.out.print("Do you want it to be rounded? 1 = yes , 0 = no , (Rounds up on neg#s , Rounds down on pos#s) | ");
               int f = keyboard.nextInt();               
               System.out.print("Type 5 for the remainder of #/# , type 0 to ignore| ");
               int d = keyboard.nextInt();

               double z = 0;


               if (b == 1) {
                z = a + c;
               }

               if (b == 2) {
                z = a - c;
               }

               if (b == 3) {
                z = a * c;
               }

               if (b == 4) {
                z = a / c;
               }

               if (d == 5) {
                z = a % c;
               }
            
               int x = (int) z;

               if (f == 1) {
                System.out.print(x);
               }
            
               if (f == 0) {
                System.out.print(z);
               } 
             
                

        }


    }
}   

        }


    }
}
