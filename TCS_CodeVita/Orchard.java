/*Error : this program was giving wrong answer */

import java.util.Scanner;

public class Orchard {
    public static int countValidCombinations(String row) {
        int count = 0;
        int len = row.length();
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 2; j < len; j++) {
                if (row.charAt(i) != row.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isValidInput(String row) {
        for (char c : row.toCharArray()) {
            if (c != 'M' && c != 'L') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ashokRow = sc.nextLine();
        String anandRow = sc.nextLine();
        if (!isValidInput(ashokRow) || !isValidInput(anandRow)) {
            System.out.println("Invalid input");
            return;
        }
        int ashokPossibilities = countValidCombinations(ashokRow);
        int anandPossibilities = countValidCombinations(anandRow);
        if (ashokPossibilities > anandPossibilities) {
            System.out.println("Ashok");
        } else if (anandPossibilities > ashokPossibilities) {
            System.out.println("Anand");
        } else {
            System.out.println("Draw");
        }

        sc.close();
    }
}
