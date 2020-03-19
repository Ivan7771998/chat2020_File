import org.junit.Assert;
import org.junit.Test;

public class TestMain {
    @Test
    public void testGetSubArray() {
        Assert.assertArrayEquals(new int[]{76}, TwoMethodForTest
                .getSubArray(new int[]{4, 2, 3, 4, 6, 4, 3, 4, 76}));

        Assert.assertArrayEquals(new int[]{5, 3, 56, 76}, TwoMethodForTest
                .getSubArray(new int[]{4, 5, 3, 56, 76}));

        Assert.assertArrayEquals(new int[]{3, 56, 76}, TwoMethodForTest
                .getSubArray(new int[]{1, 2, 3, 4, 6, 4, 3, 56, 76}));
    }

    @Test(expected = RuntimeException.class)
    public void testGetSubArrayEx() {
        Assert.assertArrayEquals(new int[]{56, 6}, TwoMethodForTest
                .getSubArray(new int[]{0, 0, 0, 0, 0, 0, 3, 56, 6}));
    }

    @Test
    public void haveNumberTest1() {
        Assert.assertTrue(TwoMethodForTest
                .isHaveNumbers(new int[]{1, 0, 0, 4, 0, 0, 3, 56, 6}));
    }

    @Test
    public void haveNumberTest2() {
        Assert.assertTrue(TwoMethodForTest
                .isHaveNumbers(new int[]{1, 1, 2, 4, 0, 3, 3, 56, 6}));
    }

    @Test
    public void haveNumberTest3() {
        Assert.assertFalse(TwoMethodForTest
                .isHaveNumbers(new int[]{1, 0, 0, 7, 0, 0, 3, 56, 6}));
    }

    @Test
    public void haveNumberTest4() {
        Assert.assertFalse(TwoMethodForTest
                .isHaveNumbers(new int[]{0, 0, 0, 4, 0, 0, 3, 56, 6}));
    }
}
