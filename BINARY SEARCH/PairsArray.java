public class PairsArray {

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10, 12 };
        getPairs(nums);

    }

    private static void getPairs(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];
            for (int j = i + 1; j < nums.length; j++) {

                System.out.print("(" + current + " ," + nums[j] + ")");

            }
            System.out.println();
        }

    }

}