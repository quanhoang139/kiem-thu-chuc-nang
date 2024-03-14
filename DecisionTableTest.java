import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecisionTableTest {

    @Test
    public void testcase1() {
        assertEquals(-1, Main.calculateReward(-1, 13, true));
    }

    @Test
    public void testcase2() {
        assertEquals(-1, Main.calculateReward(-1, 7, true));
    }

    @Test
    public void testcase3() {
        assertEquals(-1, Main.calculateReward(-1, 11, true));
    }

    @Test
    public void testcase4() {
        assertEquals(-1, Main.calculateReward(5, 5, true));
    }

    @Test
    public void testcase5() {
        assertEquals(3500, Main.calculateReward(5, 8, true));
    }

    @Test
    public void testcase6() {
        assertEquals(4500, Main.calculateReward(5, 11, true));
    }

    @Test
    public void testcase7() {
        assertEquals(-1, Main.calculateReward(30, 13, true));
    }

    @Test
    public void testcase8() {
        assertEquals(15000, Main.calculateReward(30, 8, true));
    }

    @Test
    public void testcase9() {
        assertEquals(21000, Main.calculateReward(30, 11, true));
    }

    @Test
    public void testcase10() {
        assertEquals(-1, Main.calculateReward(-1, 13, false));
    }

    @Test
    public void testcase11() {
        assertEquals(-1, Main.calculateReward(-1, 7, false));
    }

    @Test
    public void testcase12() {
        assertEquals(-1, Main.calculateReward(-1, 11, false));
    }

    @Test
    public void testcase13() {
        assertEquals(-1, Main.calculateReward(5, 5, false));
    }

    @Test
    public void testcase14() {
        assertEquals(3000, Main.calculateReward(5, 8, false));
    }

    @Test
    public void testcase15() {
        assertEquals(4000, Main.calculateReward(5, 11, false));
    }

    @Test
    public void testcase16() {
        assertEquals(-1, Main.calculateReward(30, 13, false));
    }

    @Test
    public void testcase17() {
        assertEquals(12000, Main.calculateReward(30, 8, false));
    }

    @Test
    public void testcase18() {
        assertEquals(18000, Main.calculateReward(30, 11, false));
    }

}
