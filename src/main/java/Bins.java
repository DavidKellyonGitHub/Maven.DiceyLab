
public class Bins {
int binNum;
int[] contents;

    public Bins(int binNumber){
        this.binNum = binNumber;
        this.contents = new int[]{0};
    }

    public Bins(int lowRoll, int highRoll){

        this.contents = new int[(highRoll-lowRoll)+1];
        for (int i = 0;i<this.contents.length;i++){
            this.contents[i]=0;

        }
    }

    public int getBin(int binNum){
        return contents[binNum];
    }
}
