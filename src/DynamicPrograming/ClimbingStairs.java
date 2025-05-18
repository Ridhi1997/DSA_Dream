package DynamicPrograming;

public class ClimbingStairs {
    public static void main(String[] args) {
       int n =5;
      //  System.out.println(climbStairs(n,0));
        System.out.println(climbStairs(n));
    }
    /*
       idea 1: using brute force
       TC -> O(2n)
       SC -> O(N)
     */
//    public static int climbStairs(int n, int start) {
//        if ( start > n) return  0;
//        if ( start == n) return  1;
//        return  climbStairs(n,start+1)+climbStairs(n,start+2);
//
//    }
    /*
      idea 2 : dp
      TC -> O(N)
      SC -> O(N)
     */
//    public static int climbStairs(int n) {
//        if (n ==1) return  1;
//        int dp[] = new  int[n+1];
//        dp [1] =1;
//        dp [2] =2;
//        for (int i=3; i<=n;i++){
//            dp[i] = dp[i-1]+dp[i-2];
//        }
//        return  dp[n];
//    }
    /*
     idea: Dynamic Programming (Space Optimized)
     TC : O(N)
     SC : O(1)
     */
    public static int climbStairs(int n) {
        int one =1, two =1;
        for(int i=0;i<n-1;i++){
            int temp =one;
            one = one+two;
            two = temp;
        }
        return  one;
    }


    }
