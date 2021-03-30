package array.easy._1twosum;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    
    
    @Test
    void test() {
    
        int[] inputArray = {3,3};
        int inputTarget = 6;
        int[] expected = {0, 1};
        String result = Arrays.toString(new TwoSum().twoSum(inputArray, inputTarget));
        
        assertEquals(Arrays.toString(expected), Arrays.toString(new TwoSum().twoSum(inputArray, inputTarget)));
    }
    
}