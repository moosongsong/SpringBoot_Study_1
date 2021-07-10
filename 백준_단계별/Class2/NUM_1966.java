import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class NUM_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        int numOfTest = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < numOfTest; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int numOfFile = Integer.parseInt(stringTokenizer.nextToken());
            int orderOfFile = Integer.parseInt(stringTokenizer.nextToken());
            String temp = bufferedReader.readLine().trim();
            String[] ary = temp.split(" ");
            stringBuilder.append(solve(numOfFile, orderOfFile, ary)).append('\n');
        }
        System.out.println(stringBuilder);
    }

    public static int solve(int n, int m, String[] ary) {
        LinkedList<Node> list = new LinkedList<>();
        int m_weight=Integer.parseInt(ary[m]);
        for (int i = 0; i < n; i++) {
            list.add(new Node(i, Integer.parseInt(ary[i])));
        }
        System.out.println("dfdfdf");

        int result = 0;
        while (true){
            if (isThereBiggerOne(m_weight, list)){
                list.addLast(list.pop());
            }else{
                Node temp = list.pop();
                result++;
                if (temp.index == m){
                    break;
                }
            }
        }
        return result;
    }

    public static boolean isThereBiggerOne(int m_weight, LinkedList<Node> list){
        for (Node node : list) {
            if (node.order > m_weight) {
                return true;
            }
        }
        return false;
    }

    static class Node {
        private int index;
        private int order;

        Node(int index, int order) {
            this.index = index;
            this.order = order;
        }
    }
}
