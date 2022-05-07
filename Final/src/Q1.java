import java.util.Stack;

public class Q1 {
    /**
     * Question1: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid.
     *
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     *
     * Open brackets must be closed in the correct order.
     *
     * Input: s = "()[]{}"
     * Output: true
     * Input: s = "(]"
     * Output: false
     */
    public boolean isValid(String s) {
        //TODO: Write your code here
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // c is stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {//c is ) ] }
                if (!stack.isEmpty() && leftOf(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        // whether match all stack pranthnesses
        return stack.isEmpty();
    }

    char leftOf(char c) {
        if (c == '}') return '{';
        if (c == ')') return '(';
        return '[';
    }

}
