/*Error : White spaces yet passed the test cases */

import java.util.*;

public class VIPCafe {
    public static int findWhenServed(int[] priorities, int k) {
        int n = priorities.length;
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            queue.offer(new int[] { i, priorities[i] });
            priorityQueue.offer(priorities[i]);
        }
        int servedCount = 0;
        while (!queue.isEmpty()) {
            int[] currentOrder = queue.poll();
            int index = currentOrder[0];
            int priority = currentOrder[1];
            if (priority == priorityQueue.peek()) {
                priorityQueue.poll();
                servedCount++;
                if (index == k) {
                    return servedCount;
                }
            } else {
                queue.offer(currentOrder);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] priorities = new int[N];
        for (int i = 0; i < N; i++) {
            priorities[i] = sc.nextInt();
        }
        int K = sc.nextInt() - 1;
        int result = findWhenServed(priorities, K);
        System.out.println(result);
    }
}
