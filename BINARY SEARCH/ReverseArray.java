public class ReverseArray {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.print("Original Array : ");

        display(nums);
        System.out.println();
        reverse(nums);
        System.out.println();
        
        System.out.print("Reverse Array : ");
        display(nums);
    }

    private static void display(int[] nums) {
        
        for (int i : nums) {
            System.out.print(i + " ");
        }

    }

    private static void reverse(int[] nums) {

        int start = 0, end = nums.length - 1;
        while (start != end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

    }
}
