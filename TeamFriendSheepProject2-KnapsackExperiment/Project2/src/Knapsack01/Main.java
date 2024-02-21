package Knapsack01;


import General.FKnapsack;
import General.Reader;
import General.knapsack;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //Reader
        Reader read = new Reader();
        // Method Greedy Knapsack 0/1
        Greedy greedy = new Greedy();
        int[] input0 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs.csv"));
        FKnapsack knap = new FKnapsack();
        knap.FKnapsack(input0);
        int profit = greedy.run(knap.getCapacity(), knap.getWeightList(), knap.getValueList());
        System.out.println(profit);
        System.out.println("Nguyen Test Completed -------------------------------");

        int[] input1 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs.csv"));
        knapsack knap1 = new knapsack();
        knap1.load(input1);


        int[] input2 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs2.csv"));
        knapsack knap2 = new knapsack();
        knap2.load(input2);

        int[] input3 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs3.csv"));
        knapsack knap3 = new knapsack();
        knap3.load(input3);

        int[] input4 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/input4.csv"));
        knapsack knap4 = new knapsack();
        knap4.load(input4);

        int[] input5 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs5.csv"));
        knapsack knap5 = new knapsack();
        knap5.load(input5);

        int[] input6 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/input6.csv"));
        knapsack knap6 = new knapsack();
        knap6.load(input6);

        System.out.println();
        int result1 = Dynamic.knapsackDyProg(knap1.getWeight(), knap1.getValue(), knap1.getCapacity(), knap1.getWeight().length);

        System.out.println();
        int result2 = Dynamic.knapsackDyProg(knap2.getWeight(), knap2.getValue(), knap2.getCapacity(), knap2.getWeight().length);
        int result3 = Dynamic.knapsackDyProg(knap3.getWeight(), knap3.getValue(), knap3.getCapacity(), knap3.getWeight().length);
        int result4 = Dynamic.knapsackDyProg(knap4.getWeight(), knap4.getValue(), knap4.getCapacity(), knap4.getWeight().length);
        int result5 = Dynamic.knapsackDyProg(knap5.getWeight(), knap5.getValue(), knap5.getCapacity(), knap5.getWeight().length);
        int result6 = Dynamic.knapsackDyProg(knap6.getWeight(), knap6.getValue(), knap6.getCapacity(), knap6.getWeight().length);

        System.out.println();
        long start1 = System.nanoTime();
        System.out.println("Max benefit for Dynamic Programming Input 1: " + result1);
        long end1 = System.nanoTime();
        long runtime1 = (end1 - start1) / 1000;
        System.out.println("Runtime for Dynamic programming Input 1: " + runtime1 + " microseconds");

        System.out.println();
        long start2 = System.nanoTime();
        System.out.println("Max benefit for Dynamic Programming Input 2: " + result2);
        long end2 = System.nanoTime();
        long runtime2 = (end2 - start2) / 1000;
        System.out.println("Runtime for Dynamic programming Input 2: " + runtime2 + " microseconds");

        System.out.println();
        long start3 = System.nanoTime();
        System.out.println("Max benefit for Dynamic Programming Input 3: " + result3);
        long end3 = System.nanoTime();
        long runtime3 = (end3 - start3) / 1000;
        System.out.println("Runtime for Dynamic programming Input 3: " + runtime3 + " microseconds");

        System.out.println();
        long start4 = System.nanoTime();
        System.out.println("Max benefit for Dynamic Programming Input 4: " + result4);
        long end4 = System.nanoTime();
        long runtime4 = (end4 - start4) / 1000;
        System.out.println("Runtime for Dynamic programming Input 4: " + runtime4 + " microseconds");

        System.out.println();
        long start5 = System.nanoTime();
        System.out.println("Max benefit for Dynamic Programming Input 5: " + result5);
        long end5 = System.nanoTime();
        long runtime5 = (end5 - start5) / 1000;
        System.out.println("Runtime for Dynamic programming Input 5: " + runtime5 + " microseconds");

        System.out.println();
        long start6 = System.nanoTime();
        System.out.println("Max benefit for Dynamic Programming Input 6: " + result6);
        long end6 = System.nanoTime();
        long runtime6 = (end6 - start6) / 1000;
        System.out.println("Runtime for Dynamic programming Input 6: " + runtime6 + " microseconds");




    }
}
