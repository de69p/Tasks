package org.example;

import java.util.Arrays;

public class DuplicateChecker {
     public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }

}
