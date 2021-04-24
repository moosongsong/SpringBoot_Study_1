package dfs_bfs;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DFS2_Queue {
    public void solution() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        queue.offer(4);
        Integer i = queue.remove();
        System.out.println(i);
        Integer a = queue.poll();
        System.out.println(a);

        Deque<Integer> deque = new LinkedList<>();
        deque.add(9);
        deque.add(10);
        deque.addFirst(8);
        deque.addLast(11);
        Integer b = deque.poll();
        System.out.println(b);
        Integer c = deque.poll();
        System.out.println(c);
        Integer d = deque.pollLast();
        System.out.println(d);

    }
}
