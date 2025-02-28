package lab1;

import java.util.ArrayList;
import java.util.List;

public class SubsetProblem {
    public static List<Integer> subsetSum(int[] set, int k) {
        return subset(set, 0, k, new ArrayList<>());
    }

    private static List<Integer> subset(int[] set, int i, int k, List<Integer> subset) {
        if (k == 0) return new ArrayList<>(subset);
        if (i == set.length || k < 0) return null;
        subset.add(set[i]);
        List<Integer> include = subset(set, i + 1, k - set[i], subset);
        if (include != null) return include;
        subset.remove(subset.size() - 1);
        return subset(set, i + 1, k, subset);
    }
}

