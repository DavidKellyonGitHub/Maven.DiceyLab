import java.util.Random;


public class Dice {
int numDice;

public Dice(int numberOfDice){
    this.numDice = numberOfDice;
}

public int tossAndSum(){
    Random randomizer = new Random();
    return randomizer.nextInt(this.numDice*6);
}

}