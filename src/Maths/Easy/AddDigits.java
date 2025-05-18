package Maths.Easy;

public class AddDigits {
    public static void main(String[] args) {
       int  num = 38;
        System.out.println(addDigits(num));
        System.out.println(addDigits1(num));
    }
    public static int addDigits(int num) {
        int digit =0;
        while (num > 0){
            digit += num%10;
            num = num/10;

            if (num == 0 && digit > 9){
                num = digit;
                digit = 0;
            }
        }
        return digit;
    }

    //idea 2 : Mathematical: Digital Root
    public static int addDigits1(int num) {
        if(num == 0) return  0;
        if (num % 9 == 0) return  9;
        return  num%9;
    }

}
