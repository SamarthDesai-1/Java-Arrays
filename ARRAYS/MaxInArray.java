public class MaxInArray {

    public static void main(String[] args) {
        int[] nums = { 5, 1, 3, 4, 2 };
        System.out.println(findMAX(nums));
    }

    private static int findMAX(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        return max;
    }
}
