package GFG.Yaho;

public class ReverseInteger {
    public static void main(String[] args) {
     int x = 123;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        long finalNum =0;

        while(x!=0){
            int lastDigit = x%10;
            finalNum += lastDigit;
            finalNum = finalNum*10;
            x =x/10;
        }

        finalNum = finalNum/10;

        if (finalNum > Integer.MAX_VALUE ||finalNum < Integer.MIN_VALUE){
            return  0;
        }
        if (x < 0){
            return (int) (-1*finalNum);
        }
        return  (int)finalNum;


    }
}
