package GFG.practoce;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
//        int [] nums = {2,7,11,15};
//        int target = 9;
       int[] nums = {3,2,4};
            int   target = 6;
        int [] res = twoSum(nums,target);
        for (int result : res){
            System.out.println(result +" ");
        }

    }
    /*
      using HashMap
      TC :O(N)
      SC : O(N)
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0; i< nums.length;i++){
            int diff = target - nums[i];
            if (map.containsKey(diff)){
                return  new  int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }

     return  new int[]{};
    }
}
