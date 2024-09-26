import java.util.Arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int count = 0;
        int index = 0;
        for(int i =1; i < nums.length; i++){
            count = nums[index] == nums[i] ? count +1 : count -1;
            if(count < 0){
                count = 0;
                index = i;
            }
        }
        return nums[index];
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {2, 1, 2};
        int result1 = majorityElement(nums);
        System.out.println(result1); // Output: [0, 1]

    }
}
