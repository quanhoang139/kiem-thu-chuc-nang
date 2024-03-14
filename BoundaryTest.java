import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoundaryTest {

    @Test
    public void testcase1() {
        assertEquals(12500, Main.calculateReward(25, 9, true));
    }

    @Test
    public void testcase2() {
        assertEquals(12500, Main.calculateReward(25, 6, true));
    }

    @Test
    public void testcase3() {
        assertEquals(12500, Main.calculateReward(25, 7, true));
    }

    @Test
    public void testcase4() {
        assertEquals(17500, Main.calculateReward(25, 11, true));
    }

    @Test
    public void testcase5() {
        assertEquals(17500, Main.calculateReward(25, 12, true));
    }

    @Test
    public void testcase6() {
        assertEquals(700, Main.calculateReward(1, 9, true));
    }

    @Test
    public void testcase7() {
        assertEquals(1400, Main.calculateReward(2, 9, true));
    }

    @Test
    public void testcase8() {
        assertEquals(24500, Main.calculateReward(49, 9, true));
    }

    @Test
    public void testcase9() {
        assertEquals(25000, Main.calculateReward(50, 9, true));
    }

    @Test
    public void testcase10() {
        assertEquals(10000, Main.calculateReward(25, 9, false));
    }

    @Test
    public void testcase11() {
        assertEquals(10000, Main.calculateReward(25, 6, false));
    }

    @Test
    public void testcase12() {
        assertEquals(10000, Main.calculateReward(25, 7, false));
    }

    @Test
    public void testcase13() {
        assertEquals(15000, Main.calculateReward(25, 11, false));
    }

    @Test
    public void testcase14() {
        assertEquals(15000, Main.calculateReward(25, 12, false));
    }

    @Test
    public void testcase15() {
        assertEquals(600, Main.calculateReward(1, 9, false));
    }

    @Test
    public void testcase16() {
        assertEquals(1200, Main.calculateReward(2, 9, false));
    }

    @Test
    public void testcase17() {
        assertEquals(19600, Main.calculateReward(49, 9, false));
    }

    @Test
    public void testcase18() {
        assertEquals(20000, Main.calculateReward(50, 9, false));
    }

}