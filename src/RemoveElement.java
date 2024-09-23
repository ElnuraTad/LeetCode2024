import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {2, 3, 2, 3};
        int val = 3;
        int expectation = removeElement(nums, val);
        System.out.println(Arrays.toString(new int[]{expectation})); // Output: [, 1]
    }
}
