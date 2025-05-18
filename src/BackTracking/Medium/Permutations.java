package BackTracking.Medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
     int [] nums = {1,2,3};
        System.out.println(permute(nums));
    }
    public  static List<List<Integer>> permute(int[] nums) {
        int n =nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        permutations(ans,current,nums);
        return ans;

    }
    public  static  void  permutations(List<List<Integer>> ans,List<Integer>current,int[] nums){
        int n = nums.length;

        if (current.size() == n){
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int num : nums){
            if (!current.contains(num)){
                current.add(num);
                permutations(ans,current,nums);
                current.remove(current.size()-1);
            }
        }
    }
}
