import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Simulation {
    int[] finalBins;

    public Simulation(int numDice, int rolls){
        Dice simuDice = new Dice(numDice);
        Bins simuBin = new Bins(numDice,numDice*6);
        for (int i = 0;i<rolls;i++){
            simuBin.incrementBin(simuDice.tossAndSum());
        }
        this.finalBins = simuBin.getContents();
    }

    public int[] runSimulation(){
        return this.finalBins;
    }

    public void printResults(){
        System.out.println(Arrays.toString(this.finalBins));
    }


}
