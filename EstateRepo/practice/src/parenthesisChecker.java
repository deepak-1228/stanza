import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class parenthesisChecker {
    static boolean ispar(String x)
    {
        Queue<String> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
//        stack s = new stack();
        for(int i=0;i<x.length();i++) {
            if(x.charAt(i)=='['||x.charAt(i)=='{'||x.charAt(i)=='(') {
                stack.push(x.charAt(i));
            }
            if(x.charAt(i)==']') {
                if (stack.empty() || stack.peek()!='[')
                    return false;
                else
                    stack.pop();
            }
            if(x.charAt(i)=='}') {
                if (stack.empty() || stack.peek()!='{')
                    return false;
                else
                    stack.pop();
            }
            if(x.charAt(i)==')') {
                if (stack.empty() || stack.peek()!='(')
                    return false;
                else
                    stack.pop();
            }
        }
        if(stack.size()>0)
            return false;
        else
            return true;
        // add your code here
    }
}
