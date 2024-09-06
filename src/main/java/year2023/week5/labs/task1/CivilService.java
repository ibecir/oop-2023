package year2023.week5.labs.task1;

public class CivilService implements NationalService {
    private int daysLeft;
    public CivilService(){
        this.daysLeft = 362;
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