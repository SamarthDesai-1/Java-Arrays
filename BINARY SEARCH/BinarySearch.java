public class BinarySearch {

    public static int bs(int[] nums, int key) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == key)
                return mid;
            if (nums[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 12;

        System.out.println(bs(nums, key));
    }
}
