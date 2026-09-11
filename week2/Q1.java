public class Q1 {
    public static void findMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Max: " + max + " | Min: " + min);
    }

    public static void main(String[] args) {
        int[] nums = {12, 45, 2, 67, 33};
        findMaxMin(nums);
    }
}
