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
        
        System.out.printf("The value of die1 is %d and the value of die 2 is %d%n",
                            die1.getFaceValue(), die2.getFaceValue());
    }
}
