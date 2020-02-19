import org.junit.Assert;
import org.junit.Test;
public class BinsTest {

    @Test
    public void BinTestIncrement() {
        int testRoll = 3;
        Bins simuBin = new Bins(2, 12);
        simuBin.incrementBin(testRoll);
        int expected = 1;
        int actual = simuBin.getBin(testRoll);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void BinTestTwoIncrements() {
        int testRoll = 3;
        Bins simuBin = new Bins(2, 12);
        simuBin.incrementBin(testRoll);
        simuBin.incrementBin(testRoll);
        int expected = 2;
        int actual = simuBin.getBin(testRoll);
        Assert.assertEquals(expected, actual);
    }


}