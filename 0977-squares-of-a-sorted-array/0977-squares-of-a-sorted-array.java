import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int num : nums) {
            if (num < 0) {
                a.add(num * num);
            } else {
                b.add(num * num);
            }
        }

        Collections.reverse(a);

        int[] ans = new int[nums.length];

        int i = 0, j = 0, k = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                ans[k++] = a.get(i++);
            } else {
                ans[k++] = b.get(j++);
            }
        }

        while (i < a.size()) {
            ans[k++] = a.get(i++);
        }

        while (j < b.size()) {
            ans[k++] = b.get(j++);
        }

        return ans;
    }
}