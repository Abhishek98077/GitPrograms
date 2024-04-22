package src;

import java.util.HashMap;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store each element's value and index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the HashMap
            if (map.containsKey(complement)) {
                // Return the indices of the current element and its complement
                return new int[]{map.get(complement), i};
            }

            // Put the current element and its index into the HashMap
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}

