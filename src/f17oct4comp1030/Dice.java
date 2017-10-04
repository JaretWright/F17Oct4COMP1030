package f17oct4comp1030;

import java.security.SecureRandom;

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
    
    
    /**
     * This method will simulate rolling the die
     */
    public void rollDie()
    {
        //the secure random class can create pseudo random numbers
        SecureRandom rng = new SecureRandom();
        faceValue = rng.nextInt(numberOfSides)+1;
    }
    
    public int getFaceValue()
    {
        return faceValue;  //this is a publically accessible method that returns the
                           //private instance variable "faceValue"
    }
}

