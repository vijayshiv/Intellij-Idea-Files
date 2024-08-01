package com.LinkedList;

import java.util.Stack;

public class MaxStackValue {
    public static void main(String[] args) {
        MaxStack st = new MaxStack();
        st.push(10);
        st.push(30);
        st.push(20);
        st.push(100);
        st.push(23);
        System.out.println(st.maxVal());
        st.pop();
        st.pop();
        System.out.println(st.maxVal());
    }
}

class MaxStack {
    Stack<Integer> s;
    Stack<Integer> m;

    public MaxStack() {
        s = new Stack<>();
        m = new Stack<>();
    }

    public void push(int val) {
        s.push(val);
        if (m.isEmpty() || val >= m.peek()) {
            m.push(val);
        }
    }

    public int pop() {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int poppedValue = s.pop();
        if (poppedValue == m.peek()) {
            m.pop();
        }
        return poppedValue;
    }

    public int maxVal() {
        if (m.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return m.peek();
    }
}
