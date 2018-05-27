package main.java;

import java.util.Stack;

public class BalancedBraces {


    static public String isBalanced(String braces) {
        if ((braces.length() & 1) == 1) { return "NO"; } else {
            char[] brackets = braces.toCharArray();
            Stack<Character> s = new Stack<>();
            for (char bracket : brackets) {
                switch (bracket) {
                    case '{':
                        s.push('}');
                        break;
                    case '(':
                        s.push(')');
                        break;
                    case '[':
                        s.push(']');
                        break;
                    default:
                        if (s.empty() || bracket != s.peek()) {
                            System.out.println((char)27 + "[30;43m"+ bracket +(char)27+"[0m");
                            return "NO";
                        }
                        s.pop();
                }
            }

            return s.empty() ? "YES" : "NO";
        }
    }

    public static void main(String[] args) {
        /*
        * ))))
{{{
(((
*/
        String braces = ")))";
        String res = BalancedBraces.isBalanced(braces);
        System.out.println((char)27 + "[30;43m"+ res +(char)27+"[0m");
    }
}
