package Company.Decathlon;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {1,2,7,9,5,10};
        int target = 9;

        int [] res = targetSum(arr,target);
        for (int result : res){
            System.out.print(result +" ");
        }
        System.out.println();
        int [] res1 = targetSum1(arr,target);
        for (int result : res1){
            System.out.print(result +" ");
        }
    }

    //idea 1: Brute Force, Tc -> O(N)2, sc-> o(1)
    public  static  int[] targetSum(int [] arr,int target){
        int n = arr.length;
        for (int i=0; i<n;i++){
            for (int j =1; j<n;j++){
                if (arr[i]+arr[j] == target){
                    return  new  int[]{i,j};
                }
            }
        }
        return  new int[]{-1,-1};
    }

    //idea 2: Optimized approach using HashMap, Tc -> O(N), sc-> o(1)

    public  static  int[] targetSum1(int [] arr,int target){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i=0; i<n;i++){
            int diff = target-arr[i];
            if (map.containsKey(diff)){
                return  new  int[]{map.get(diff),i};
            }
            map.put(arr[i],i);
        }
        return  new  int[]{-1,-1};

    }

    }
