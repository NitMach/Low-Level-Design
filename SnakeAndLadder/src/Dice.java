import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min = 1;
    int max = 6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int tSum = 0;
        int dUsed = 0;

        while(dUsed < diceCount){
            tSum += ThreadLocalRandom.current().nextInt(min,max+1);
            dUsed+=1;
        }
        return tSum;
    }
}
