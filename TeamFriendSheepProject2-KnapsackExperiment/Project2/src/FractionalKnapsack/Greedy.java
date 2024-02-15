package FractionalKnapsack;

import General.FKnapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Greedy {
    ArrayList<FKnapsack> totalArrays = new ArrayList<>();
    ArrayList<Integer> itemsAdded = new ArrayList<>();
    public void run(int title, int capacity, int[] weight, int[] value){
        int length = weight.length;
        double profit = 0;


        //Intialize all array values,weights, and ratios into FractionalArray
        for(int index = 0; index < length; index++){

            //Intialize Item number
            int itemNum = index + 1;

            //Intialize Ratios
            double ratioNum = (double) value[index]/weight[index];

            //Put in all arrays into a combined fractional array.
            FKnapsack combine = new FKnapsack(itemNum, weight[index],value[index],ratioNum);
            totalArrays.add(combine);


        }
        firstDisplay(title);
        //Sort array based on Ratios
        Collections.sort(totalArrays, Comparator.comparingDouble(FKnapsack:: getRatio).reversed());



        ArrayList<Integer> itemsPicked = new ArrayList<>();
        int currentCapacity = capacity;
        int index = 0;
        while (currentCapacity > 0 && index < totalArrays.size()) {

            FKnapsack total = totalArrays.get(index);
            if (total.getWeight() <= currentCapacity) {

                profit += total.getValue();
                currentCapacity -= total.getWeight();
                itemsAdded.add(total.getItemNum());


            }
            else {

                double fraction = (double) currentCapacity / total.getWeight();

                profit += fraction * total.getValue();
                currentCapacity = 0; // Knapsack is full

                itemsAdded.add(total.getItemNum());
            }
            index++;
        }
        greedyDisplay();

    }

    public void greedyDisplay() {
        System.out.println();
        System.out.println("Reorganized Greedy Chart based on Ratios");

        // Display headers
        System.out.printf("%-10s", "Items");
        for (FKnapsack item : totalArrays) {
            System.out.printf("Item%-4d | ", item.getItemNum());
        }
        System.out.println();

        // Display weights
        System.out.printf("%-10s", "Weight");
        for (FKnapsack item : totalArrays) {
            System.out.printf("%-8d | ", item.getWeight());
        }
        System.out.println();

        // Display values
        System.out.printf("%-10s", "Value");
        for (FKnapsack item : totalArrays) {
            System.out.printf("%-8.1f | ", item.getValue());
        }
        System.out.println();

        // Display ratios
        System.out.printf("%-10s", "Ratios");
        for (FKnapsack item : totalArrays) {
            System.out.printf("%-8.2f | ", item.getRatio());
        }
        System.out.println();

        for (Integer totalItems : itemsAdded) {
            System.out.println("Item " + totalItems + " added.");
        }

    }

    public void firstDisplay(int title) {
        System.out.println();
        System.out.println("Title " + title + " Fractional Greedy Chart");

        // Display headers
        System.out.printf("%-10s", "Items");
        for (FKnapsack item : totalArrays) {
            System.out.printf("Item%-4d | ", item.getItemNum());
        }
        System.out.println();

        // Display weights
        System.out.printf("%-10s", "Weight");
        for (FKnapsack item : totalArrays) {
            System.out.printf("%-8d | ", item.getWeight());
        }
        System.out.println();

        // Display values
        System.out.printf("%-10s", "Value");
        for (FKnapsack item : totalArrays) {
            System.out.printf("%-8.1f | ", item.getValue());
        }
        System.out.println();

        // Display ratios
        System.out.printf("%-10s", "Ratios");
        for (FKnapsack item : totalArrays) {
            System.out.printf("%-8.2f | ", item.getRatio());
        }
        System.out.println();


    }


}
