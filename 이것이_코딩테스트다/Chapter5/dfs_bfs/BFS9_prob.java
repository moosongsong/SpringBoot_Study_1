package dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS9_prob {
    Queue<Integer> queue = new LinkedList<>();
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    boolean [] visited = new boolean[9];

    public void solution(){
        initialize();
        bfs(1);
    }

    public void bfs(int v){
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()){
            int temp = queue.poll();
            System.out.print(temp+" ");
            for(int node:graph.get(temp)){
                if (!visited[node]){
                    queue.add(node);
                    visited[node]=true;
                }
            }
        }
    }

    public void initialize(){
        for (int i = 0; i < 9; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);
    }
}
