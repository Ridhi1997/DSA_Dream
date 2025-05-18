package BinarySearch.Easy;

public class Sqrt_X {
    public static void main(String[] args) {
     int x = 4;//o/p->
//        System.out.println(mySqrt(x));
        System.out.println(mySqrt_1(x));
    }

    /*
      idea 1: Using Brute force
     */
    public static int mySqrt(int x) {
        int ans =0;
     for(int i=0; i*i<=x;i++){
         ans = i;
         i++;
     }
      return  ans;
    }
    public static int mySqrt_1(int x) {
        int low = 0, high = x-1;
        int ans =0;

        while (low <= high){
            int mid = low+(high-low)/2;
            if (mid * mid == x){
                return  mid;
            }
            if (mid*mid > x){
                high= mid-1;
            }else {
                ans = mid;
                low = mid+1;
            }
        }
        return ans;
    }
}
