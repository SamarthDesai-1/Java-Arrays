package SORTING;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = { 5, 1, 3, 4, 2 };
        bubblesort(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    private static void bubblesort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

    }
}
