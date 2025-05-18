package Array.Easy;

import java.util.HashMap;

public class TwoSum_D {
    public static void main(String[] args) {
      int [] nums = {2,7,11,15};
      int target = 9;
     int [] result =  twoSum(nums,target);
     for (int res : result){
         System.out.println(res);
     }

     int [] result1 = twoSum1(nums,target);
        for (int rest : result1){
            System.out.println(rest);
        }
    }

    /*
      idea 1: Brute force
      TC : O(N2)
      Sc : O(1)
     */
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i=0; i<n;i++){
            for (int j=i+1; j<n;j++){
                if(nums[j] == target-nums[i]){
                    return  new int[]{i,j};
                }
            }
        }
        return  new int[]{};
    }
    /*
       idea : Using HashMap
       TC : O(N)
       Sc : O(N)
     */
    public static int[] twoSum1(int[] nums, int target) {
        int n = nums.length;
        int [] result = new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<n; i++){
            int diff =target-nums[i];
            if (map.containsKey(diff)){
                result[0] = i;
                result[1] = map.get(diff);
                return  result;
            }else {
                map.put(nums[i],i);
            }
        }
        return  result;
    }
}
