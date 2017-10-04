package f17oct4comp1030;

/**
 *
 * @author JWright
 */
public class ForLoopExample {
    public static void main(String[] args)
    {
        Dice die1 = new Dice(6);
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
    }
}
