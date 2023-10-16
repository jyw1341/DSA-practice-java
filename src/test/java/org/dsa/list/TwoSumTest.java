package org.dsa.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {


    @Test
    public void testBruteForceSearch() {
        int[] nums = {1, 2, 5, 7, 13, 15};
        int target = 28;

        boolean result = TwoSum.bruteForceSearch(nums, target);

        assertTrue(result);
    }

    @Test
    public void testBruteForceSearchNoResult() {
        int[] nums = {1, 2, 5, 7, 13, 15};
        int target = 29;

        boolean result = TwoSum.bruteForceSearch(nums, target);

        assertFalse(result);
    }

    @Test
    public void testSortAndTwoPointerSearch() {
        int[] nums = {1, 2, 5, 7, 13, 15};
        int target = 28;

        boolean result = TwoSum.sortAndTwoPointerSearch(nums, target);

        assertTrue(result);
    }

    @Test
    public void testSortAndTwoPointerSearchNoResult() {
        int[] nums = {1, 2, 5, 7, 13, 15};
        int target = 29;

        boolean result = TwoSum.sortAndTwoPointerSearch(nums, target);

        assertFalse(result);
    }

}