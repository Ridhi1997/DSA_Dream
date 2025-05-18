package HashTable.Medium;

import java.util.HashSet;

/*
  Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] nums = {100,4,200,1,3,2}; // o/p-->4
        System.out.println(longestConsecutive(nums));

        System.out.println(longestConsecutive1(nums));

    }

    /*
      Approach 1 : BruteForce
      TC : O(N)3
      SC : O(1)
     */
    public  static int longestConsecutive(int[] nums) {
       int n = nums.length;
       int longestCount =0;

       for (int num : nums){
           int currentNum = num;
           int currentCount =1;
           while (arrayContains(nums,currentNum+1)){  // helper method
               currentNum += 1;
               currentCount += 1;
           }
           longestCount = Math.max(currentCount,longestCount);
       }
       return  longestCount;
    }

    public static boolean arrayContains(int[] arr, int num){
        for (int i=0; i<arr.length;i++){
            if (arr[i] == num)
                return  true;
        }
        return  false;
    }

    /*
       Approach 2: Using HashSet
       TC : O(N)
       SC : O(1)

     */
    public  static int longestConsecutive1(int[] nums) {
        HashSet<Integer> num_set = new HashSet<>();
         for (int num : nums){
             num_set.add(num);
         }
         int longestCount =0;

         for (int num : num_set){
             if (!num_set.contains(num-1)){
                 int currentNum = num;
                 int currentCount =1;

                 while (num_set.contains(currentNum+1)){
                     currentNum += 1;
                     currentCount += 1;
                 }
                 longestCount = Math.max(currentCount,longestCount);
             }
         }
         return  longestCount;

    }

    }
