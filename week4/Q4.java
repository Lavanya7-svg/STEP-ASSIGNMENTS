import java.util.*;

public class Q4 {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // base case

        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            if (prefixCount.containsKey(sum - k)) {
                count += prefixCount.get(sum - k);
            }
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.out.println(subarraySum(nums, 2)); // Output: 2
    }
}
