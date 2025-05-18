package GFG.array;

public class Move_All_Zeroes_to_End {
    public static void main(String[] args) {
       int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
   public static void pushZerosToEnd(int[] arr) {
        // code here
       int n = arr.length;
       int position = 0;
       for (int i=0; i<n;i++){
           if (arr[i] != 0){
               arr[position] = arr[i];
               position++;
           }
       }
       while (position < n) {
           arr[position] = 0;
           position++;
       }
    }
}
