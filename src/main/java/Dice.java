import java.util.Random;


public class Dice {
    int numDice;

    public Dice(int numberOfDice){
        this.numDice = numberOfDice;
    }

    public int tossAndSum(){
        Random randomizer = new Random();
        int results = randomizer.nextInt( this.numDice*6)+1;
        return results;
    }
}