package bonus.modulo3;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {

    public static List<List<Integer>> findCombinations(int[] S, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(S, n, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] S, int n, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < S.length; i++) {
            current.add(S[i]);
            backtrack(S, n, i + 1, current, result);
            current.remove(current.size() - 1);  // Remove o último elemento (backtracking)
        }
    }

    public static void main(String[] args) {
        int[] S1 = {1, 2, 3};
        int n1 = 2;
        System.out.println("Subconjuntos de tamanho " + n1 + ": " + findCombinations(S1, n1));

        int[] S2 = {1, 2, 3, 4};
        int n2 = 1;
        System.out.println("Subconjuntos de tamanho " + n2 + ": " + findCombinations(S2, n2));
    }
}
