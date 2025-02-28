package lab2;

import java.util.*;

public class SubsetGenerator {
    public static List<Set<Integer>> generateSubsets(List<Integer> numbers) {
        List<Set<Integer>> subsets = new ArrayList<>();
        subsets.add(new HashSet<>());

        for (Integer num : numbers) {
            List<Set<Integer>> tempSubsets = new ArrayList<>();
            for (Set<Integer> subset : subsets) {
                Set<Integer> newSubset = new HashSet<>(subset);
                newSubset.add(num);
                tempSubsets.add(newSubset);
            }
            subsets.addAll(tempSubsets);
        }
        return subsets;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(3, 7, 8);
        List<Set<Integer>> allSubsets = generateSubsets(inputList);

        System.out.println("Generated Subsets:");
        for (Set<Integer> subset : allSubsets) {
            System.out.println(subset);
        }
    }
}
