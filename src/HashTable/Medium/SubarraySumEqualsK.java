package HashTable.Medium;

import java.util.HashMap;

/*
 Input: nums = [1,1,1], k = 2
Output: 2
 */
public class SubarraySumEqualsK {
    public static void main(String[] args) {
      int nums[] = {1,1,1}, k = 2;
        System.out.println(subarraySum(nums,k));

        System.out.println(subarraySum1(nums,k));
    }

    /*
      Approach : Brute Force
      TC : O(N3)
      SC : O(1)
     */
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                int sum = 0;
                for (int i = start; i < end; i++)
                    sum += nums[i];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    /*
       Approach : Using HashMap
     */
    public static int subarraySum1(int[] nums, int k) {
        int count =0, sum =0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for (int i=0;i<nums.length;i++){
            sum  += nums[i];
            if (map.containsKey(sum-k))
                count += map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return  count;

    }
}
