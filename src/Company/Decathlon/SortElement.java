package Company.Decathlon;

public class SortElement {
    public static void main(String[] args) {
        int[] arr = {5,8,9,2,4,6,3,7};
        int[] res = sort(arr);

        for (int result : res){
            System.out.print(result+" ");
        }
    }

    // using Bubble sort  , TC -->O(N)2, Sc --> O(1)
    public  static  int[] sort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i;j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return  arr;
    }
}
