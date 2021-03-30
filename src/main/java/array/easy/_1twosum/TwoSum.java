package array.easy._1twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        List<Integer> numbers = new ArrayList<>();
        Arrays.stream(nums).forEach(numbers::add);
        
        for (int i = 0; i < numbers.size(); i++) {
            int secondOperand = target - numbers.get(i);
            int firstIndex = numbers.indexOf(numbers.get(i));
            int secondIndex = numbers.lastIndexOf(secondOperand);
            if (numbers.contains(secondOperand) && firstIndex != secondIndex) {
                //result = new int[]{firstIndex, secondIndex};
                result[0] = firstIndex;
                result[1] = secondIndex;
                return result;
            }
        }
        return result;
    }
}
