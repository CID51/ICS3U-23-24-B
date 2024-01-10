public class StepTracker {
    private int mininumSteps;
    private int activeDays;
    private int numDays;
    private int totalSteps;

    public StepTracker(int mininumSteps){
        this.mininumSteps = mininumSteps;
        activeDays = 0;
        numDays = 0;
        totalSteps = 0;
    }

    public int activeDays(){
        return activeDays;
    }

    public double averageSteps(){
        return totalSteps / (double) numDays;
    }

    public void addDailySteps (int steps){
        totalSteps += steps;
        if (steps >= mininumSteps)
            activeDays++;
        numDays++;
    }
    
}
