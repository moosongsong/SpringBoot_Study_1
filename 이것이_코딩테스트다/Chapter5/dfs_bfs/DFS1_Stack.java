package dfs_bfs;

import java.util.Stack;

public class DFS1_Stack {
    public void solution() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Integer i = stack.pop();
        System.out.println(i);
    }
}
