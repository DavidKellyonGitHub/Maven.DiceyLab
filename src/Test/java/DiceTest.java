import org.junit.Assert;
import org.junit.Test;

public class DiceTest{

    @Test
    public void DiceTest2(){

        Dice dice = new Dice(2);
        boolean expected = true;
        boolean actual = 12 >= dice.tossAndSum()&& 2 <= dice.tossAndSum();

        Assert.assertEquals(expected,actual );
    }

    @Test
    public void DiceTest3(){
        Dice dice = new Dice(3);
        boolean expected = true;
        boolean actual = 36 >= dice.tossAndSum() && 3<= dice.tossAndSum();

        Assert.assertEquals(expected,actual);
    }

}