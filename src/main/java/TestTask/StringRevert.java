package TestTask;

import java.util.Stack;

public class StringRevert {

    public static String revertString(String str) {

        Stack<Character> stack = new Stack<>();
        for (Character character : str.toCharArray()) {
            stack.add(character);
        }
        StringBuilder sb = new StringBuilder();
        while (stack.size() > 0) {
            sb.append(stack.pop());
        }
        return sb.toString();

    }
}


