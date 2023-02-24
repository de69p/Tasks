package org.example;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumCheckerTest {
    @Test
    public void testTwoSum(){
        TwoSumChecker twoSumChecker = new TwoSumChecker();
        Assert.assertArrayEquals(new int[] {0, 1}, twoSumChecker.twoSum(new int[] {2, 7, 11, 15}, 9));
        Assert.assertArrayEquals(new int[] {1, 2}, twoSumChecker.twoSum(new int[] {3, 2, 4}, 6));
        Assert.assertArrayEquals(new int[] {0, 1}, twoSumChecker.twoSum(new int[] {3, 3}, 6));
    }
}
