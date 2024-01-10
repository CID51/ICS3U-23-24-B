package lesson1;

public class Die {
    private int topSide;
    private int numSides;

    public Die(int numSides){
        this.numSides = numSides;
        roll();
    }

    // two methods with the same name but different argument list is called method overloading
    public Die(){
        this.numSides = 6;
        roll();
    }

    
    // mutator method -> changes the state of the object
    public void roll(){
    topSide = (int)(Math.random() * numSides) + 1;
    }


    
    public int getTopSide(){
        return topSide;
    }




    
    public void setTopSide(int topSide){
        if (topSide > numSides)
            throw new IllegalArgumentException("Cannot have a side larger than " + numSides);
        this.topSide = topSide;
    }

}
