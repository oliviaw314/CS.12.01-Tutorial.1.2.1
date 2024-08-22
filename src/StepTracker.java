import java.util.ArrayList;

public class StepTracker {
    private int min;
    private ArrayList<Integer> stepsPerDay;
    private int totalSteps;

    public int getDays() {
        return stepsPerDay.toArray().length;
    }

    public int getStepsForActiveDay() {
        return min;
    }

    public int getTotalSteps() {
        totalSteps = 0;
        for (int steps : stepsPerDay) {
            totalSteps+=steps;
        }
        return totalSteps;
    }

    public int getActiveDays() {
        return activeDays();
    }

    public StepTracker (int min) {
        this.min = min;
        stepsPerDay = new ArrayList<>();
    }

    public void addDailySteps(int steps) {
        stepsPerDay.add(steps);
    }

    public int activeDays() {
        int activeDays = 0;
        for (int steps : stepsPerDay) {
            if (steps>=min) {
                activeDays++;
            }
        }
        return activeDays;
    }

    public int averageSteps() {
        if (stepsPerDay.isEmpty()) {
            return 0;
        }
        return getTotalSteps()/stepsPerDay.toArray().length;
    }
}
