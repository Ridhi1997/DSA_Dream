package GFG.array;

public class ThirdLargest {

        public static void main(String[] args) {
            int arr[] = {12, 35, 1, 10, 34, 1}; //o/p-->34
//        int arr[] = {10,10,10};//op->-1
            System.out.println(getSecondLargest(arr));
        }

        public  static int getSecondLargest(int[] arr) {
            int  n = arr.length;
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;
            int third = Integer.MIN_VALUE;

            for (int i=0; i<n;i++){
                if (arr[i]> first){
                    second = first;
                    first = arr[i];
                } else if (arr[i] > second && arr[i]!= first) {
                    third = second;
                    second = arr[i];
                } else if (arr[i]>third && arr[i] != second) {
                    third = arr[i];

                }
            }

            if (third == Integer.MIN_VALUE)
            {
                return  -1;
            }
            return  third;
        }
    }


