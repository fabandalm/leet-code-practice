package com.falmeida.tech.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackSample {

    public static void main(String[] args) {
        Deque<String> dequeAsStack = new ArrayDeque<String>();

        dequeAsStack.push("one");
        dequeAsStack.push("two");
        dequeAsStack.push("three");

        String one   = dequeAsStack.pop();
        String two   = dequeAsStack.pop();
        String three = dequeAsStack.pop();

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

    }

}
