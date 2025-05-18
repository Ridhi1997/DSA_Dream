package String.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class FindTheDifference {
    public static void main(String[] args) {
     String s = "abcd", t = "abcde"; //o/p-->e
//        String s = "", t="r";  //o/p-->r
        System.out.println(findTheDifference(s,t));
        System.out.println(findTheDifference_1(s,t));
    }

    /*
       Approach 1: Sorting
       TC -> O(N)
       SC --> O(1)
     */
    public static  char findTheDifference(String s, String t) {
       int n= s.length();
       int n1 = t.length();

       char [] word1 = s.toCharArray();
       char [] word2 = t.toCharArray();

       //sort
        Arrays.sort(word1);
        Arrays.sort(word2);

        int i=0;
        while (i <s.length()){
            if (word1[i] != word2[i]){
                return  word2[i];
            }
            i =i+1;
        }

      return  word2[i];

    }
    /*
       Approach 2: Using HashMap
       TC -->O(N)
       SC -->O(1)
     */

    public static  char findTheDifference_1(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (char ch : s.toCharArray()){
            map.put(ch,map.get(ch)-1);
            if (map.get(ch) == 0){
                map.remove(ch);
            }
        }
        return (char) map.keySet().toArray()[0];
    }
}
