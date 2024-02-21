package Knapsack01;


import General.FKnapsack;
import General.Reader;
import General.knapsack;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        //Reader
        Reader read = new Reader();

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
        long start = System.nanoTime();
        Dynamic.knapsackDyProg(knap1.getWeight(), knap1.getValue(), knap1.getCapacity(), knap1.getWeight().length);
        long end = System.nanoTime();
        long runtime = (end - start) / 1000;
        System.out.println("Runtime for Dynamic programming Input 1: " + runtime + " microseconds");
        System.out.println();

        long star2 = System.nanoTime();
        Dynamic.knapsackDyProg(knap2.getWeight(), knap2.getValue(), knap2.getCapacity(), knap2.getWeight().length);
        long end2 = System.nanoTime();
        long runtime2 = (end2 - star2) / 1000;
        System.out.println("Runtime for Dynamic programming Input 2: " + runtime2 + " microseconds");
        System.out.println();

        long star3 = System.nanoTime();
        Dynamic.knapsackDyProg(knap3.getWeight(), knap3.getValue(), knap3.getCapacity(), knap3.getWeight().length);
        long end3 = System.nanoTime();
        long runtime3 = (end3 - star3) / 1000;
        System.out.println("Runtime for Dynamic programming Input 3: " + runtime3 + " microseconds");
        System.out.println();

        long star4 = System.nanoTime();
        Dynamic.knapsackDyProg(knap4.getWeight(), knap4.getValue(), knap4.getCapacity(), knap4.getWeight().length);
        long end4 = System.nanoTime();
        long runtime4 = (end4 - star4) / 1000;
        System.out.println("Runtime for Dynamic programming Input 4: " + runtime4 + " microseconds");
        System.out.println();

        long star5 = System.nanoTime();
        Dynamic.knapsackDyProg(knap5.getWeight(), knap5.getValue(), knap5.getCapacity(), knap5.getWeight().length);
        long end5 = System.nanoTime();
        long runtime5 = (end5 - star5) / 1000;
        System.out.println("Runtime for Dynamic programming Input 5: " + runtime5 + " microseconds");
        System.out.println();

        long star6 = System.nanoTime();
        Dynamic.knapsackDyProg(knap6.getWeight(), knap6.getValue(), knap6.getCapacity(), knap6.getWeight().length);
        long end6 = System.nanoTime();
        long runtime6 = (end6 - star6) / 1000;
        System.out.println("Runtime for Dynamic programming Input 6: " + runtime6 + " microseconds");
        System.out.println();



    }
}
