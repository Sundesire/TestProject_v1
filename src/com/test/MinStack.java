package com.test;

import java.util.*;

public class MinStack{

    public Stack<Integer> st;
    public Stack<Integer> minStack;

    public MinStack(){
        st = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }


    public void pushStack(int a) {
        int min = a;

        if (!minStack.isEmpty() && min > minStack.peek()) {
            min = minStack.peek();
        }

        st.push(a);
        minStack.push(min);
    }

    public void popStack() {
        if (st.isEmpty()) {
            System.out.println("Стек пустой!");
            return;
        }
        st.pop();
        minStack.pop();

    }

    public Integer peekStack() {
        System.out.println("Верхнее значение в стеке: " + st.peek());
        return st.peek();
        }

    public Integer getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Стек пустой!");
        }
        System.out.println("Минимальное значение в стеке: " + minStack.peek());
        return minStack.peek();
    }

}
