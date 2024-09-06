package year2023.week5.labs.task1;

public class MilitaryService implements NationalService {
    private int daysLeft;

    public MilitaryService(int daysLeft){
        this.daysLeft = daysLeft;
    }
    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }
    @Override
    public void work() {
        if(this.daysLeft > 0){
            this.daysLeft--;
        }
    }
}
