package algorithms_1910;

public class TwoPointers {
    private static boolean hasPairWithSum(int[] nums, int targetSum) {

        int left = 0;
        int right = nums.length -1;

        while (left <right) {
            int sum = nums[left] + nums[right];

            if (sum == targetSum) return true;
            if (sum < targetSum) left++;
            else right--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10};
        int targetsum = 12;

        boolean hasPair = hasPairWithSum(nums, targetsum);

        if (hasPair) {
            System.out.println("В массиве есть пара чисел с суммой " + targetsum);
        } else {
            System.out.println("В массиве нет пары чисел с суммой " + targetsum);
        }
    }
}
