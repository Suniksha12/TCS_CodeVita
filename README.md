# TCS_CodeVita

Here's a consolidated overview of the problem descriptions you provided:

---

**BestBubble**
- **Problem Description:** Given an array, find the minimum number of swaps required to make it sorted either in ascending or descending order. Use bubble sort's characteristics for comparison.
- **Constraints:** 0 < N < 1000, 0 < Arr[i] < 1000
- **Example 1:**
  - **Input:** `5\n4 5 3 2 1`
  - **Output:** `1`
  - **Explanation:** Sorting in descending order requires fewer swaps (1) compared to ascending order (9).
- **Example 2:**
  - **Input:** `5\n4 5 1 2 3`
  - **Output:** `4`
  - **Explanation:** Minimum swaps for ascending (6) and descending (4) orders are compared.

---

**GoodString**
- **Problem Description:** Convert a name into a "good name" using a "good string" and calculate the total distance based on ASCII values. For each character in the name, select the nearest letter from the good string. If equidistant, choose the letter closest to the previously used good letter.
- **Constraints:** 1 <= len(good string) <= 100, 1 <= len(name) <= 10^4
- **Example 1:**
  - **Input:** `(@HR*i{kcQl\nVyom`
  - **Output:** `10`
  - **Explanation:** Calculate distance based on closest good letters.
- **Example 2:**
  - **Input:** `6*K4AQf]gpi\nNainika`
  - **Output:** `33`
  - **Explanation:** Distance calculated similarly with given good string and name.

---

**Orchard**
- **Problem Description:** Given two rows of trees represented by 'M' (mango) and 'L' (lemon), determine who has more possibilities of selecting three trees with no two adjacent trees being of the same type. If the input is invalid or if it's a draw, return appropriate responses.
- **Constraints:** 1 <= len(str) <= 10^5
- **Example 1:**
  - **Input:** `MMLMLLM\nLMLLLMLM`
  - **Output:** `Anand`
  - **Explanation:** Count and compare possibilities for Ashok and Anand.
- **Example 2:**
  - **Input:** `MLLM\nLMLL`
  - **Output:** `Draw`
  - **Explanation:** Possibilities for both are equal.

---

**VIPCafe**
- **Problem Description:** Determine after how many orders a specific order in the queue will be served given dynamic priority changes. Orders are served based on priority, and the priority of preceding orders is incremented.
- **Constraints:** 2 <= N <= 25, 1 <= Priority <= 100, 1 <= K <= N
- **Example 1:**
  - **Input:** `6\n1 3 5 2 4 6\n4`
  - **Output:** `6`
  - **Explanation:** The position of Raj’s friend’s order in the queue.
- **Example 2:**
  - **Input:** `5\n1 4 3 2 5\n3`
  - **Output:** `3`
  - **Explanation:** Number of orders before Raj’s friend's order is served.

---

**WeaponBoxes**
- **Problem Description:** Calculate the total amount Raj has to pay for labor based on the sum of weights of all boxes shifted, excluding boxes with triangular weights, and halt the process when a box remains unshifted for K consecutive cycles.
- **Constraints:** 1 <= weight of each box <= 10^5, 1 <= number of boxes <= 10^4, 1 <= N,K <= 10^3
- **Example 1:**
  - **Input:** `7 3 6 9 10 2 4 11 5 12 17 1\n3 2`
  - **Output:** `22`
  - **Explanation:** Calculate the sum of non-triangular weights of boxes that are shifted.
- **Example 2:**
  - **Input:** `6 2 8 14 5 1 3\n2 2`
  - **Output:** `15`
  - **Explanation:** Similar calculation based on the number of cycles and non-triangular weights.

---

**ZeroCount**
- **Problem Description:** Given a binary string with K ones and remaining zeros, rearrange the ones to minimize the length of the longest consecutive zeros.
- **Constraints:** (Constraints not explicitly provided, but typical for binary strings and zeros.)
