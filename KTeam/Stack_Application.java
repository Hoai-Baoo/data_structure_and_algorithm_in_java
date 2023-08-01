package KTeam;

import java.util.Stack;

public class Stack_Application {
    public static void main(String[] args) {
        
        int[] arr = {2, 1, 3, 2, 8, 5, 7};

        display(arr);
        int res[] = solution2(arr);
        display(res);

    }

    static void display(int[] arr) {
        for (int i:arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] solution1(int[] arr) {
        int[] res = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            int pos = -1;
            for (int j=i-1; j>=0; j--) {
                if (arr[i] < arr[j]) {
                    pos = j + 1;
                    break;
                }
            }
            res[i] = pos;
        }
        return res;
    }

    public static int[] solution2(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i=0; i<arr.length; i++) {
            System.out.println(st);
            while (!st.empty() && arr[st.peek()] < arr[i]) 
                st.pop();
            if (!st.empty())
                res[i] = (st.peek() + 1);
            else 
                res[i] = -1;
            st.push(i);
        }
        return res;
    }
}
