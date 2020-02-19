import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;

public class Bins {
    private int[] contents;

    public Bins(int lowRoll, int highRoll) {
        this.contents = new int[highRoll];
        for (int i = 0; i < this.contents.length; i++) {
            this.contents[i] = 0;

        }
    }

    public int getBin(int binNum) {
        return this.contents[binNum-1];
    }

    public void incrementBin(int diceRoll) {
        this.contents[diceRoll-1]++;
        }

    public int[] getContents() {
        return contents;
    }

    public void setContents(int[] contents) {
        this.contents = contents;
    }
}


