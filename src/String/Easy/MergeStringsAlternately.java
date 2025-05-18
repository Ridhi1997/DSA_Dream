package String.Easy;
/*
Q)1768. Merge Strings Alternately
Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 */
public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeAlternately(word1,word2));

    }

    /*
       idea : Using two pointer
       TC ->O(Max(N1,N2)
       SC -> O(N1+N2)
     */
    public static String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int p1 = 0, p2 = 0;

        StringBuilder result = new StringBuilder();
        while (p1 < n1 || p2 < n2) {
            if (p1 < n1) {
                result.append(word1.charAt(p1));
                p1++;
            }
            if (p2 < n2) {
                result.append(word2.charAt(p2));
                p2++;
            }

        }
        return result.toString();
    }
}
