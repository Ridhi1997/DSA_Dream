package Array.Easy;
/*
Q 26) RemoveDuplicates
 Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
     int [] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    /*
      Approach 1: Two indexes approach
      TC : O(N)
      Sc: O(N)
     */
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int insertedIndex =1;

        for (int i=1; i<n;i++){
            if (nums[i] != nums[i-1]){
                nums[insertedIndex] = nums[i];
               insertedIndex++;
            }
        }
        return insertedIndex;
    }
}
