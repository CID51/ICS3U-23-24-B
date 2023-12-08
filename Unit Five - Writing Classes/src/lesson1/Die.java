package lesson1;

public class Die {
    private int topSide;
    private int numSides;

    
    // mutator method -> changes the state of the object
    public void roll(){
    topSide = (int)(Math.random() * numSides) + 1;
    }


    
    public int getTopSide(){
        return topSide;
    }

    public void setTopSide(int topSide){
        topSide = topSide;
    }
}

