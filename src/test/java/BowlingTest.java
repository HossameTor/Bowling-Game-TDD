import org.junit.Before;
import org.junit.Test;

import com.example.Bowling;

import junit.framework.Assert;

/**
 * BowlingTest
 */
public class BowlingTest {

    private Bowling bowling;

    private void rollMany(int n, int pins) {
        for (int index = 0; index < n; index++) {
            bowling.roll(pins);
        }
    }

    @Before
    public void setUp() {
        this.bowling = new Bowling();
    }

    @Test
    public void canCalculateGutterGame() {
        rollMany(20, 0);

        Assert.assertEquals(0, bowling.score());
    }

    @Test
    public void canCalculateAllOnes() {

        rollMany(20, 1);
        Assert.assertEquals(20, bowling.score());
    }

    @Test
    public void canCalculateSpare(){
        bowling.roll(4);
        bowling.roll(6);
        bowling.roll(3);
        bowling.roll(4);
        rollMany(16,0);
        Assert.assertEquals(20,bowling.score());
    }

    @Test
    public void canCalculateStrike(){
        bowling.roll(10);
        bowling.roll(4);
        bowling.roll(3);
        rollMany(16,0);
        Assert.assertEquals(24,bowling.score());
    }

    @Test
    public void canCalculatePerfectGame(){
        rollMany(12,10);
        Assert.assertEquals(300,bowling.score());
    }
}