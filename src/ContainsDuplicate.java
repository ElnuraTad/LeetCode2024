import java.util.Arrays;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    // found the duplicate
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {2, 3, 2, 3};
        boolean expectation = containsDuplicate(nums);
        System.out.println(expectation); // Output: [, 1]
    }
}
