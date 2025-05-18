package BinarySearch.Easy;

/*
Q)441. Arranging Coins
You have n coins and you want to build a staircase with these coins.
The staircase consists of k rows where the ith row has exactly i coins.
The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.

Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.

  Stair ->  1
            2 3
            4 5 6
            7 8 _  _

            Output -> 3
 */
public class ArrangingCoins {
    public static void main(String[] args) {
      //  int n =5; // o/p-->2
        int n =8;

        System.out.println(arrangeCoins(n));
    }
    /*
      idea 1: using Binary Search
      TC -> O(log N)
      SC --> O(1)
     */

    public static int arrangeCoins(int n) {
        int low =0,high =n ;
        long mid,current ;

        while (low <= high){
            mid = low+(high-low)/2;
            current = mid*(mid+1)/2;

            if (current == n){
                return (int) mid;
            }
            if (n < current){
                high = (int)mid-1; // goto left
            }else {
                low = (int)mid+1;
            }
        }
      return high;

    }
}
