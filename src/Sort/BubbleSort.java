package Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {64, 34, 25, 12, 22, 11, 90};
        int [] res = sort(arr);
        for (int i=0; i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

    public  static  int[] sort(int [] arr){
        int n = arr.length;

        for (int i=0; i<n-1;i++){
            for (int j=0; j<n-i-1;i++){
               if (arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }

            }
        }
        return  arr;
    }
}
