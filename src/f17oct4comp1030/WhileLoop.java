package f17oct4comp1030;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class WhileLoop {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Noel's boring password: ");
        String pw = keyboard.nextLine();
        
        //loop while the password does not equal "today"
        //and prompt the user to enter another password
        while ( pw.equals("today"))
        {
            System.out.print("Oops, sorry that is not a valid password.  Try again: ");
            pw = keyboard.nextLine();
        }
        
        System.out.printf("The password was valid%n");
    }
}
