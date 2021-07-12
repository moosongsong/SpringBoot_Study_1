import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class NUM_1966_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer;
        int numOfTestCase = Integer.parseInt(bufferedReader.readLine());
        TestCase[] tests = new TestCase[numOfTestCase];
        for (int i = 0; i < tests.length; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            tests[i] = new TestCase(stringTokenizer.nextToken(), stringTokenizer.nextToken());
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            tests[i].makeQueue(stringTokenizer);
        }

        for (TestCase test : tests) {
            int count = 0;
            while (true) {
                Paper paper = test.pop();
                if (test.isThereBiggerThanMe(paper)) {
                    test.push(paper);
                } else {
                    count++;
                    if (paper.index == test.target) {
                        break;
                    }
                }
            }
            stringBuilder.append(count).append('\n');
        }
        System.out.println(stringBuilder);
    }
}

class Paper {
    int index;
    int priority;

    Paper(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}

class TestCase {
    int size;
    int target;
    LinkedList<Paper> queue;

    TestCase(String size, String target) {
        this.size = Integer.parseInt(size);
        this.target = Integer.parseInt(target);
        queue = new LinkedList<>();
    }

    void makeQueue(StringTokenizer stringTokenizer) {
        for (int i = 0; i < size; i++) {
            queue.add(new Paper(i, Integer.parseInt(stringTokenizer.nextToken())));
        }
    }

    boolean isThereBiggerThanMe(Paper paper) {
        boolean flag = false;
        for (Paper value : queue) {
            if (paper.priority < value.priority) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    Paper pop() {
        Paper re = queue.get(0);
        queue.remove(0);
        return re;
    }

    void push(Paper paper) {
        queue.addLast(paper);
    }
}