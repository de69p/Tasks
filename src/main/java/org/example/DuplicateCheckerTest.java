package org.example;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateCheckerTest {
    @Test
    public void testContainsDuplicate(){
        DuplicateChecker duplicateChecker = new DuplicateChecker();
        Assert.assertTrue(duplicateChecker.containsDuplicate(new int[]{1,2,3,1}));
        Assert.assertFalse(duplicateChecker.containsDuplicate(new int[] {1, 2, 3, 4}));
        Assert.assertTrue(duplicateChecker.containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
