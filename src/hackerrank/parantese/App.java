package hackerrank.parantese;

import datastructure.stack.Stack;

public class App {
    public static void main(String[] args) {
        String question = "()))))))))))))))))))))))()()))()))))))))()))))))()))()))))(()))))))))))))()))))))(()))))))))()()))))))))))))()))))(())()))))))(()))))()))))))()))()())))())))))))))))()))())(()()())()()())))))()))))())()))()))))))))))))))()())))()))))()))))))()))())()))())))(()))()))))))))())))())))(())()))))()((()))))))((((()())())())(())))))())())))))))())))))()(()))))()))))())))))()())())()))()))))))))()))))))))))()))))())))))(((()))))()))((())))())))))))())))()()())())))))())))())())))))(())())))))))())))()()))))))))))))(())())())))((()))))))(())))()())))()))))(())))(())))))))))))))(())))(())()))))(()))())())))))))()())(()(())())))))))))))))))))))))))((()())))())))())))((()())))()))())()))))())()())))))))))))(()))))))))))))))()))))))()))))))))))))))))(()(()))(()))()))))))()))()()))))))))))()))())()))))())))()()()))()))))(())))))))))))))()()))))(())))()))))))()))()())()))())()())())))()()(()())))))()())))))))())))())))(())))())))))))()))))))))()((()(())))))))))(())))())))())))))))))()())))()))))))))(";
        var result = getMin(question);
        System.out.println(result);
    }

    public static int getMin(String s) {
        // Write your code here
        Stack stack = new Stack(1024);
        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(') {
                stack.push('(');
            } else if(s.charAt(i) == ')') {
                if(stack.isEmpty())
                    answer++;
                else
                    stack.pop();
            }

            answer+=0;//stack.size();
        }

        return answer;
    }
}
