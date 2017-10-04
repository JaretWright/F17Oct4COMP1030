package f17oct4comp1030;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class Warmup {
    public static void main(String[] args)
    {
        //prompt the user to enter their name
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = keyboard.nextLine();
        
        //prompt the user to enter the year they were born
        System.out.print("Please enter the year you were born: ");
        int yearBorn = keyboard.nextInt();
        
        //display their name and age
        System.out.printf("%s, you are %d years old%n", userName,getAge(yearBorn));
    }
    
    //create a method that will receive the birthyear and
    //calculate their age
    public static int getAge(int birthYear)
    {
        return LocalDate.now().getYear()-birthYear;
    }
}
