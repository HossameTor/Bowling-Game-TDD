import org.junit.Assert;
import org.junit.Test;

import com.example.Bowling;

public class BowlingTest {
    @Test
    public void gutterGameTest(){
        Bowling bowling = new Bowling();
        for(int i=0; i<20; i++){
            bowling.roll(0);
        }
        Assert.assertEquals(0, bowling.score());
    }
    @Test 
    public void allOnesTest(){
        Bowling bowling = new Bowling();
        for(int i=0; i<20; i++){
            bowling.roll(1);
        }
        Assert.assertEquals(20, bowling.score());
    }
    
    @Test 
    public void spareTest(){
        Bowling bowling = new Bowling();
        bowling.roll(4); bowling.roll(6); bowling.roll(4); bowling.roll(3);
        for(int i=0; i<16; i++){
            bowling.roll(0);
        }
        Assert.assertEquals(21, bowling.score());
    }
}
