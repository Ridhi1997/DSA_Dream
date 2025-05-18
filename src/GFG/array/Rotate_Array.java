package GFG.array;
//To rotate counter-clockwise
public class Rotate_Array {
    public static void main(String[] args) {
     int [] arr = {1, 2, 3, 4, 5};
     int d = 2;
     rotateArr(arr,d);
     for (int res : arr){
         System.out.print(res+" ");
     }
    }
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        int k = d%n;
        if (k == 0) return;
        reverse(arr,0,k-1); //// Reverse first part
        reverse(arr,k,n-1); // Reverse second part
        reverse(arr,0,n-1);   // Reverse the whole array


    }

    public static  void  reverse(int [] arr, int start,int end){

         while (start <= end){
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
    }
}
