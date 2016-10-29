package com.sgnatiuk.codility.Lesson7;

import java.util.Stack;

public class Brackets {

    public int solution(String S) {

        Stack<Bracket> brackets = new Stack<>();

        char[] signs = S.toCharArray();

        for (int i = 0; i < signs.length; i++) {
            Bracket brkt = Bracket.buildFrom(signs[i]);
            if (brkt == null) {
                continue;
            } else if (brkt.isOpen()) {
                brackets.push(brkt);
            } else if (brackets.size() == 0 || brackets.pop().getClass() != brkt.getClass()) {
                return 0;
            }
        }

        return brackets.size() == 0 ? 1 : 0;
    }

    private static abstract class Bracket {
        protected char bracket;

        public Bracket(char bracket) {
            this.bracket = bracket;
        }

        public abstract boolean isOpen();

        public static Bracket buildFrom(char bracketSign) {
            if (bracketSign == '(' || bracketSign == ')') {
                return new RoundBrkt(bracketSign);
            } else if (bracketSign == '[' || bracketSign == ']') {
                return new SquareBrkt(bracketSign);
            } else if (bracketSign == '{' || bracketSign == '}') {
                return new FigureBrkt(bracketSign);
            }
            return null;
        }
    }

    private static class RoundBrkt extends Bracket {

        private RoundBrkt(char bracket) {
            super(bracket);
        }

        @Override
        public boolean isOpen() {
            return bracket == '(';
        }
    }

    private static class SquareBrkt extends Bracket {

        private SquareBrkt(char bracket) {
            super(bracket);
        }

        @Override
        public boolean isOpen() {
            return bracket == '[';
        }
    }

    private static class FigureBrkt extends Bracket {

        private FigureBrkt(char bracket) {
            super(bracket);
        }

        @Override
        public boolean isOpen() {
            return bracket == '{';
        }
    }
}
