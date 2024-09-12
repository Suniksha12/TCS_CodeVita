/*Error : Time Limit exceeded */

import java.util.*;

public class WeaponBoxes {
    public static boolean isTriangular(int num) {
        int n = (int) (Math.sqrt(2 * num));
        return (n * (n + 1)) / 2 == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] weightsInput = sc.nextLine().split(" ");
        int[] weights = new int[weightsInput.length];
        for (int i = 0; i < weightsInput.length; i++) {
            weights[i] = Integer.parseInt(weightsInput[i]);
        }
        int N = sc.nextInt();
        int K = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int weight : weights) {
            pq.add(weight);
        }
        int unshiftedCount = 0;
        int lastUnshiftedBox = -1;
        int totalCost = 0;
        Set<Integer> shiftedBoxes = new HashSet<>();
        while (unshiftedCount < K) {
            List<Integer> selectedBoxes = new ArrayList<>();
            for (int i = 0; i < N && !pq.isEmpty(); i++) {
                selectedBoxes.add(pq.poll());
            }
            while (selectedBoxes.size() > 1) {
                int box1 = selectedBoxes.remove(0);
                int box2 = selectedBoxes.remove(0);
                if (box1 < box2) {
                    pq.add(box1);
                    shiftedBoxes.add(box1);
                    selectedBoxes.add(0, box2);
                } else {
                    pq.add(box2);
                    shiftedBoxes.add(box2);
                    selectedBoxes.add(0, box1);
                }
            }
            int remainingBox = selectedBoxes.get(0);
            if (remainingBox == lastUnshiftedBox) {
                unshiftedCount++;
            } else {
                unshiftedCount = 1;
                lastUnshiftedBox = remainingBox;
            }
            pq.add(remainingBox);
        }
        for (int box : shiftedBoxes) {
            if (!isTriangular(box)) {
                totalCost += box;
            }
        }
        System.out.println(totalCost);
        sc.close();
    }
}
