package org.dsa.uteco.fifth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class Problem1Test {

    @Test
    void testSolution() {
        int[] pobi1 = {97, 98};
        int[] crong1 = {197, 198};

        int[] pobi2 = {131, 132};
        int[] crong2 = {211, 212};

        int[] pobi3 = {99, 102};
        int[] crong3 = {211, 212};

        int result1 = solution(pobi1, crong1);
        int result2 = solution(pobi2, crong2);
        int result3 = solution(pobi3, crong3);

        Assertions.assertEquals(result1, 0);
        Assertions.assertEquals(result2, 1);
        Assertions.assertEquals(result3, -1);
    }

    @Test
    void testCalculateScore() {
        int[] pobi = {97, 98};

        int pobiScore = calculateScore(pobi);

        Assertions.assertEquals(pobiScore, 72);
    }

    @Test
    void testCheckInCorrectArray() {
        int[] pobi = {400, 401};
        int[] crong = {1, 2};

        boolean result = checkInCorrectArray(pobi, crong);

        Assertions.assertTrue(result);
    }

    int solution(int[] pobi, int[] crong) {
        int pobiScore = calculateScore(pobi);
        int crongScore = calculateScore(crong);

        if(checkInCorrectArray(pobi, crong))
            return -1;
        if(pobiScore == crongScore)
            return 0;
        if(pobiScore > crongScore)
            return 1;
        return 2;
    }



    boolean checkInCorrectArray(int[] pobi, int[] crong) {
        if (pobi[0] + 1 != pobi[1] || crong[0] + 1 != crong[1])
            return true;

        for (int i = 0; i < pobi.length; i++){
            int sum = pobi[i] + crong[i];
            if(sum > 800 || sum < 2)
                return true;
            if(i/2 == 0 && (pobi[i]%2 != 1 || crong[i]%2 != 1))
                return true;
            if(i/2 == 1 && (pobi[i]%2 != 0 || crong[i]%2 != 0))
                return true;
        }

        return false;
    }

    int calculateScore(int[] pages){
        List<Integer> results = new ArrayList<>();

        for(int page : pages){
            List<Integer> digits =  splitDigits(page);
            int score = calculateMaximumAddOrMultiply(digits);
            results.add(score);
        }

        return Math.max(results.get(0), results.get(1));
    }

    List<Integer> splitDigits(int page) {
        List<Integer> digits = new ArrayList<>();
        while(page != 0){
            int digit = page % 10;
            digits.add(digit);
            page = page / 10;
        }
        return digits;
    }

    int calculateMaximumAddOrMultiply(List<Integer> digits){
        int addResult = 0;
        int multiplyResult = 1;
        for(int digit : digits){
            addResult += digit;

            if(digit == 0) {
                digit = 1;
            }

            multiplyResult *= digit;
        }

        return Math.max(addResult, multiplyResult);
    }

}