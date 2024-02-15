package Knapsack01;

import General.FKnapsack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Greedy {

    public int run(int capacity, int[] weight, int[] value) {
        int capacityLeft = capacity;
        int profit = 0;
        List<FKnapsack> list = new ArrayList<>();
        List<FKnapsack> bag = new ArrayList<>();

        // Initialize items with their ratios
        for (int i = 0; i < weight.length; i++) {
            FKnapsack temp = new FKnapsack(i, weight[i], value[i]);
            list.add(temp);
        }



        // Sort items based on ratios
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < list.size() - 1; i++) {
                FKnapsack current = list.get(i);
                FKnapsack next = list.get(i + 1);
                if (current.getRatio() < next.getRatio()) {
                    list.set(i, next);
                    list.set(i + 1, current);
                    swapped = true;
                }
            }
        } while (swapped);

        // Greedy algorithm to fill the knapsack
        for (FKnapsack e : list) {
            if (e.getWeight() <= capacityLeft) {
                profit += e.getValue();
                bag.add(e);
                capacityLeft -= e.getWeight();
            }
        }

        // Print details of selected items

        for (FKnapsack e : bag) {
            System.out.println("Item number " + e.getItemNum());
            System.out.println("Weight: " + e.getWeight());
            System.out.println("Value: " + e.getValue());
            System.out.println("Ratio: " + e.getRatio());
            System.out.println();
        }

        return profit;

    }


}
