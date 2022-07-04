import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length; i++){ //Check every number
            for(int j = i + 1; j < numbers.length; j++){ //check other numbers, if matches, will return
                if(numbers[i] + numbers[j] == target){
                    return new int[] {i,j}; //initiliaze the array with the i and J
                }
            }
        }

    return new int[] {};
    }
}
