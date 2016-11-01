package com.sgnatiuk.codility.Lesson7;

import java.util.Stack;

public class Nesting {

    public int solution(String S) {

        Stack<Character> brackets = new Stack<>();

        char[] signs = S.toCharArray();

        for (int i = 0; i < signs.length; i++) {
            if (signs[i] == '(') {
                brackets.push(signs[i]);
            } else if (signs[i] == ')' && (brackets.size() == 0 || brackets.pop() != '(')) {
                return 0;
            }else{
                continue;
            }
        }

        return brackets.size() == 0 ? 1 : 0;
    }
}
