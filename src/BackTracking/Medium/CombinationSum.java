package BackTracking.Medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
       int[] candidates = {2,3,6,7};
       int target = 7;
        System.out.println(combinationSum(candidates,target));
    }
    public  static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combinatSum(candidates,target,0,curr,ans);
        return ans;
    }
    public  static  void combinatSum(int[] candidates, int target,int index,List<Integer> curr,List<List<Integer>> ans){

        if (target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i =index;i<candidates.length;i++){
            if (target >= candidates[i]){
                curr.add(candidates[i]);
                combinatSum(candidates,target-candidates[i],index,curr,ans);
                curr.remove(curr.size()-1);
            }
        }
    }
}
