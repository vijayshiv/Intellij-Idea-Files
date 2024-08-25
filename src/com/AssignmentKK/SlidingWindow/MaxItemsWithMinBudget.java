package com.AssignmentKK.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class MaxItemsWithMinBudget {
    public static void main(String[] args) {
        List<Integer> items = List.of(1, 1, 3, 4, 4, 3);
        int budget = 7;

        List<Integer> result = getMaxLengthWithMinBudget(budget, items);

        System.out.println("Maximum number of items: " + result.get(0));
        System.out.println("Total cost with free items: " + result.get(1));
    }

    public static List<Integer> getMaxLengthWithMinBudget(int budget, List<Integer> items) {
        int start = 0;
        int currentSum = 0;
        int maxLength = 0;
        int minCost = 0;

        for (int end = 0; end < items.size(); end++) {
            int itemCost = items.get(end);

            // Include this item in the total cost if it's not free
            if (itemCost != 3) {
                currentSum += itemCost;
            }

            // Slide the window if the current sum exceeds the budget
            while (currentSum > budget) {
                int startItemCost = items.get(start);
                if (startItemCost != 3) {
                    currentSum -= startItemCost;
                }
                start++;
            }

            int currentLength = end - start + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                minCost = 0;
                for (int i = start; i <= end; i++) {
                    minCost += items.get(i);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(maxLength);
        result.add(minCost);
        return result;
    }
}
