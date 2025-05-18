package Array.Easy;

import java.util.Arrays;

/*
Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

 */
public class MergeSortedArray {
    public static void main(String[] args) {
       int [] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
       int m = 3, n = 3;
       merge(nums1,m,nums2,n);

    }

    /*
   Approach 1: Merge and sort (naive approach)
   Tc : O((M+N)Log(M+N))
   SC : O(1)
   */
   /* public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0;i<n;i++){
            nums1[m+i] = nums2[i]; //merge
        }
        Arrays.sort(nums1); //sort
        for (int num : nums1){
            System.out.println(num);

        }

    }*/
    /*Approach 2: Three Pointers (Start From the Beginning)
      TC : O(M+N)
      SC : O(M)
     */

  /*  public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        // Make a copy of the first m elements of nums1.

        int[] nums1Copy = new int[m];  // We are allocating an additional array of lengthm.
        for (int i=0; i<m;i++){
            nums1Copy[i] =nums1[i];
        }

        // Read pointers for nums1Copy and nums2 respectively.
        int p1 =0;
        int p2 =0;

        // Compare elements from nums1Copy and nums2 and write the smallest to nums1.
        for (int p =0; p<m+n;p++){
            // We also need to ensure that p1 and p2 aren't over the boundaries
            // of their respective arrays.
            if (p2 >= n ||(p1<m && nums1Copy[p1] < nums2[p2])){
                nums1[p] = nums1Copy[p1++];
            }else {
                nums1 [p] = nums2[p2++];
            }
        }
        for (int num : nums1){
            System.out.println(num);

        }
    }*/

   /*Approach 3: Three Pointers (Start From the End)
     TC : O(M+N)
     Sc :O(1)
    */

    public static  void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;

        for (int p = m + n-1; p>=0; p--){
            if (p2 < 0){
                break;
            }
            if (p1 >=0 && nums1[p1] > nums2[p2]){
                nums1[p] = nums1[p1--];
            }else {
                nums1[p] = nums2[p2--];
            }
        }


        //print
        for (int num : nums1){
            System.out.println(num);

        }
    }
}
