/*Error : this program was giving wrong answer */

import java.util.*;

public class GoodStringDistance {
    public static char findClosestChar(char[] goodString, char nameChar, char prevGoodChar) {
        char closestChar = goodString[0];
        int minDistance = Math.abs(nameChar - closestChar);
        for (char goodChar : goodString) {
            int distance = Math.abs(nameChar - goodChar);
            if (distance < minDistance ||
                    (distance == minDistance
                            && Math.abs(prevGoodChar - goodChar) < Math.abs(prevGoodChar - closestChar))) {
                closestChar = goodChar;
                minDistance = distance;
            }
        }
        return closestChar;
    }

    public static int calculateTotalDistance(String goodString, String name) {
        char[] goodArr = goodString.toCharArray();
        int totalDistance = 0;
        char prevGoodChar = goodArr[0];
        for (char nameChar : name.toCharArray()) {
            if (goodString.indexOf(nameChar) != -1) {
                prevGoodChar = nameChar;
                continue;
            }
            char closestGoodChar = findClosestChar(goodArr, nameChar, prevGoodChar);
            totalDistance += Math.abs(nameChar - closestGoodChar);
            prevGoodChar = closestGoodChar;
        }
        return totalDistance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String goodString = sc.nextLine();
        String name = sc.nextLine();
        int totalDistance = calculateTotalDistance(goodString, name);
        System.out.println(totalDistance);
    }
}
