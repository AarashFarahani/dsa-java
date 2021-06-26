package leetcode.valid.parentheses;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        var app = new App();
        System.out.println(app.isValid("()"));      // true
        System.out.println(app.isValid("()[]{}"));  // true
        System.out.println(app.isValid("(]"));      // false
        System.out.println(app.isValid("([)]"));    // false
        System.out.println(app.isValid("{[]}"));    // true
        System.out.println(app.isValid(")(){}"));   // false
        System.out.println(app.isValid("(])"));     // false
    }

    public boolean isValid(String s) {
        if(s == null || s.length() <= 1)
            return false;

        HashMap<Character, Character> pair = new HashMap<>();
        pair.put('(', ')');
        pair.put('[', ']');
        pair.put('{', '}');

        List<Character> openBrackets = List.of('(', '[', '{');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (openBrackets.contains(c)) {
                stack.push(c);
                continue;
            } else if (stack.isEmpty())
                return false;
            else {
                Character openedBracket = stack.pop();
                Character closedBracket = pair.get(openedBracket);
                if(closedBracket != c)
                    return false;
            }
        }

        return stack.isEmpty();
    }
}
