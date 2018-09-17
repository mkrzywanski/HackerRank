package javatasks;

import java.util.*;

public class JavaStack {
    // for codility it works, for hackerrank not
    public static void main(String[] argh) {
        String s = "(({()})))";
        System.out.println(isBalansed(s));

    }

    public static boolean isBalansed(String s) {
        int index = 0;
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Deque<Character> stack = new ArrayDeque<>();
        while (index < s.length()) {
            char c = s.charAt(index);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (!stack.isEmpty()) {
                    char z = stack.pop();
                    char enclosingChar = map.get(z);
                    if (c != enclosingChar) {
                        return false;
                    }
                } else {
                    return false;
                }

            }
            index++;
        }
        return stack.isEmpty();
    }
}
