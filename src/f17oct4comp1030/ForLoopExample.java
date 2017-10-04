package f17oct4comp1030;

import java.util.Scanner;

/**
 *
 * @author JWright
 */
public class ForLoopExample {
    public static void main(String[] args)
    {
        /*      Dice die1 = new Dice(6);
        Dice die2 = new Dice(6);
     
        int counter = 0;
        
        do
        {
            die1.rollDie();
            die2.rollDie();
            System.out.printf("The value of die1 is %d and the value of die 2 is %d%n",
                            die1.getFaceValue(), die2.getFaceValue());  
                            
            counter++;
        } while (!(die1.getFaceValue() == 1 && die2.getFaceValue() == 1));
        
        System.out.printf("It took %d attempts to roll snake eyes%n", counter);
        */
        forExampleWithSnakeEyes();
    }
    
    //we will see how many times snake eyes comes up in 100,000 rolls
    public static void forExampleWithSnakeEyes()
    {
        
        //ask user for # of iterations
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many iterations of the experiment should we do? ");
        int repeats = keyboard.nextInt();
        
        System.out.print("What value should we test for? ");
        int numToCheck = keyboard.nextInt();
        
        Dice die1 = new Dice(6);
        Dice die2 = new Dice(6);
        
        int counter = 0;
        
           //initial state = 1     check condition      How to change each time through loop
        for (int i=1;              i<=repeats;           i++)
        {
            //roll the dice
            die1.rollDie();
            die2.rollDie();
            
            //test for snake eyes - if true, increment the counter
            if (die1.getFaceValue()+die2.getFaceValue() == numToCheck)
                counter++;
        }
        
        System.out.printf("With %d rolls, %d came up %d times%n",repeats, numToCheck, counter);
        System.out.printf("That is %.1f%%", (double) counter/repeats*100);
        
    }
}
