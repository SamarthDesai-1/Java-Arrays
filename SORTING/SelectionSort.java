package SORTING;

public class SelectionSort {
 
    
    public static void main(String[] args) {
        int[] nums = { 5, 1, 3, 4, 2 };
        selectionsort(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    private static void selectionsort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minPos] > nums[j]) {
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }

}

