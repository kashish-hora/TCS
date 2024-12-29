import java.util.ArrayList;
import java.util.List;

public class targetsum {
    // Utility function to print subarray `nums[i, j]`
    static void print(List<Integer> nums, int i, int j) {
        for (int k = i; k <= j; k++) {
            System.out.print(nums.get(k) + " ");
        }
        System.out.println();
    }

    // Function to find subarrays with the given sum in an array
    static void findSubarrays(List<Integer> nums, int target) {
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            int sumSoFar = 0;
            for (int j = i; j < n; j++) {
                sumSoFar += nums.get(j);
                // if the sum so far is equal to the given sum
                if (sumSoFar == target) {
                    print(nums, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4);
        nums.add(-7);
        nums.add(1);
        nums.add(3);
        nums.add(3);
        nums.add(1);
        nums.add(-4);

        int target = 7;
        findSubarrays(nums, target);
    }
}

    

