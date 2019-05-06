import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void getDrink(){
        assertEquals(95, waterBottle.getDrink());
    }

    @Test
    public void testEmpty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void testRefill(){
        waterBottle.reFill();
        assertEquals(100, waterBottle.getVolume());
    }

}
