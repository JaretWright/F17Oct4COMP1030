package f17oct4comp1030;

/**
 *
 * @author JWright
 */
public class Dice {
    
    //these are private instance variables.  They are configured
    //for each instance of the Dice 
    private int faceValue, numberOfSides;
    
    /**
     * This is the constructor for the Dice class.  It accepts
     * the number of sides as an argument
     */
    public Dice(int numOfSides)
    {
        setNumberOfSides(numOfSides);
        rollDie();
    }
    
    /**
     * This method will validate that the number of sides is at least 4
     * and the maximum is 100
     */
    public void setNumberOfSides(int numOfSides)
    {
        if (numOfSides >= 4 && numOfSides <= 100)
            numberOfSides = numOfSides;
        else
            throw new IllegalArgumentException("Number of sides must be 4-100 inclusive");
    }
}
