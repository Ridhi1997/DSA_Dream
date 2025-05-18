package GFG.array;

public class Reverse_an_Array {
    public static void main(String[] args) {
      int[] arr = {1, 4, 3, 2, 6, 5};
      reverseArray(arr);
      for (int res : arr){
          System.out.print(res+" ");
      }

    }
    public static void reverseArray(int[] arr) {
        // code here
        int n= arr.length;
        int start =0;
        int end = n-1;
        while ( start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
