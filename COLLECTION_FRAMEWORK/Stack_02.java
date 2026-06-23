package COLLECTION_FRAMEWORK;

import java.util.Stack;

public class Stack_02 {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.pop();
        System.out.println(st);
    }
}
