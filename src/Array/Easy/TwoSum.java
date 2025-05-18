package Array.Easy;

import java.util.HashMap;

/*
Q)Two Sum
 Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
     int [] res =   twoSum(nums,target);
     for (int res1 : res){
         System.out.println(res1);
     }

    }

    /*
      idea 1: Brute Force
      Tc -> O(N2)
      SC --> O(1)
     */
  /*  public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int [] res = new  int[2];
        for (int i=0; i<n;i++){
            for (int j =i+1; j<n;j++){
                if(nums[i]+nums[j] == target)
                {
                     res[0] = i;
                     res[1] = j;
                     return  res;
                }
            }
        }
        return res;

    }*/

    /*
      idea 2: Optimized by using HashMap
     */
    public static int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int [] res = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<n;i++){
            int difference = target-nums[i];
            if (map.containsKey(difference)){
                res[0] = i;
                res[1] = map.get(difference);
            }else {
                map.put(nums[i],i);
            }
        }
       return  res;
    }
}
