package Stcak.Easy;

import java.util.Stack;

/*
20. Valid Parentheses
 */
public class ValidParentheses {
    public static void main(String[] args) {
    String s = "()[]{}"; // true
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch :s.toCharArray()){
            if (ch=='('){
                stack.push(')');
            } else if (ch=='{') {
                stack.push('}');
            } else if (ch=='[') {
                stack.push(']');
            }else if (stack.isEmpty() || stack.pop() != ch){
                return false;
            }
        }
        return  stack.isEmpty();
    }
}
