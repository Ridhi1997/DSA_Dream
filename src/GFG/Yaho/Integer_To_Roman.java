package GFG.Yaho;

public class Integer_To_Roman {
    private static final int[] value ={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private static final String[] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<value.length && num >0;i++){
            while(value[i] <= num){
                num -=value[i];
                sb.append(symbol[i]);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        int num = 3749;

        System.out.println(intToRoman(num));

    }
}
