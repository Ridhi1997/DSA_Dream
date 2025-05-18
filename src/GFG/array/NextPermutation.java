package GFG.array;
/*
 TC -> O(N)
 SC --> O(1)
 */
public class NextPermutation {
    public static void main(String[] args) {
        int [] arr = {5, 1, 1};
        nextPermutation(arr);
        for (int res : arr){
            System.out.print(res+" ");;
        }
    }
    public  static void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n-2;

        // Step 1: Find first decreasing element from right
        while (i >=0 && arr[i+1] <= arr[i]){
            i--;
        }
        // Step 2: If found, find next larger element from right and swap
        if (i >=0){
            int j = n-1;
            while (arr[j] <= arr[i])
            {
                j--;
            }
            swap(arr,i,j);

        }
        reverse(arr,i+1,n-1);


    }
  private static  void  reverse(int [] arr,int start, int end){

        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    private static void  swap(int arr[],int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
