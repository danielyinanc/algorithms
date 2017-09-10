package com.rainmakeross.algorithms.problems.stacks;

import java.util.Stack;

public class BalancedExpression {
    public static void main(String[] args) {
        String X = "{}}";
        String Y = "{{[[()]]}}";

        System.out.println(balancedOrNot(X));
        System.out.println(balancedOrNot(Y));

    }

    private static boolean balancedOrNot(String str) {
        Stack<Character> characterStack = new Stack<>();
        for(Character c:str.toCharArray()) {
            if (c =='{' || c=='[' || c=='(') {
                characterStack.push(c);
            }

            if (c =='}' || c==']' || c==')') {
                if(characterStack.isEmpty()) {
                    return false;
                } else {
                    Character cComp = characterStack.pop();
                    if (c =='}' && cComp != '{') {
                        break;
                    }
                    if (c ==']' && cComp != '[') {
                        break;
                    }
                    if (c ==')' && cComp != '(') {
                        break;
                    }
                }
            }
        }

        return characterStack.isEmpty();
    }
}
