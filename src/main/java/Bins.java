
public class Bins {
int binNum;
int[] binRange;

    public Bins(int binNumber){
        this.binNum = binNumber;
    }

    public Bins(int lowRoll, int highRoll){
        this.binRange = new int[]{lowRoll,highRoll};
    }

    
}
