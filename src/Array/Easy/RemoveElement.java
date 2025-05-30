package Array.Easy;
/*
Q)RemoveElement

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveElement {
    public static void main(String[] args) {
   int [] nums = {0,1,2,2,3,0,4,2};
       int val = 2;
        System.out.println(removeElement(nums,val));

    }

    /*
       Approach 1: Two Pointers
       TC -->O(N)
       SC -->O(1)
     */
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count =0;
        for (int i=0;i<n;i++){
            if (nums[i] != val){
                count++;
            }
        }
        return count;
    }
}
