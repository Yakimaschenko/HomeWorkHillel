import java.util.Arrays;

public class SumElements {

    public static void main(String[] args) {

        int nums[] = {3, 5, 8, 11, 16, 20, 22};
        System.out.println(findSum(nums, 16));
    }

        public static boolean findSum(int[] nums, int sum) {
            return findSum(nums, sum, 0, nums.length - 1);
        }

    public static boolean findSum(int[] arr, int num, int first, int second) {
        int summa = arr[first] + arr[second];
        if (summa == num) return true;
        if (second < first && first == second) return false;
        if (first < arr.length - 1 && second != first)
            return findSum(arr, num, first, second - 1) || findSum(arr, num, first + 1, second);
        else return false;
    }
}
