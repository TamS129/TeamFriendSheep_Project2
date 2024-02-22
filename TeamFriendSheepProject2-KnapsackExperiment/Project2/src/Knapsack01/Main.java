package Knapsack01;
/**
 * Made by Robin
 */


import General.FKnapsack;
import General.Reader;
import General.knapsack;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        //Reader
        Reader read = new Reader();
        Greedy greedy = new Greedy();

        /**
         * Our group had a weird encounter where one of the src files can be read from one reference path, and some
         * read from the other. If your computer does not read the input file, then comment out the current reference
         * path and uncomment out the reference path.
         */

        int[] input1 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs.csv"));
        //int[] input1 = read.load(new File("Project2/src/InputFiles/inputs.csv"));
        knapsack knap1 = new knapsack();
        knap1.load(input1);


        int[] input2 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs2.csv"));
        //int[] input2 = read.load(new File("Project2/src/InputFiles/input2.csv"));
        knapsack knap2 = new knapsack();
        knap2.load(input2);

        int[] input3 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs3.csv"));
        //int[] input3 = read.load(new File("Project2/src/InputFiles/input3.csv"));
        knapsack knap3 = new knapsack();
        knap3.load(input3);

        int[] input4 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/input4.csv"));
        //int[] input4 = read.load(new File("Project2/src/InputFiles/input4.csv"));
        knapsack knap4 = new knapsack();
        knap4.load(input4);

        int[] input5 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs5.csv"));
        //int[] input5 = read.load(new File("Project2/src/InputFiles/input5.csv"));
        knapsack knap5 = new knapsack();
        knap5.load(input5);

        int[] input6 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/input6.csv"));
        //int[] input6 = read.load(new File("Project2/src/InputFiles/input6.csv"));
        knapsack knap6 = new knapsack();
        knap6.load(input6);

        System.out.println("******************** Input 1 Max Profit & Run times *************************");


        System.out.println();
        System.out.println("Dynamic programming Max Value and Items Input 1: ");
        long start = System.nanoTime();
        Dynamic.knapsackDyProg(knap1.getWeight(), knap1.getValue(), knap1.getCapacity(), knap1.getWeight().length);
        long end = System.nanoTime();
        long runtime = (end - start) / 1000;
        System.out.println("Runtime for Dynamic programming Input 1: " + runtime + " microseconds");
        System.out.println();


        System.out.println("Greedy Method Items for Input 1: " );
        long startG1 = System.nanoTime();
        int greedy1 = greedy.run(knap1.getCapacity(), knap1.getWeight(), knap1.getValue());
        long endG1 = System.nanoTime();
        long runtimeG1 = (endG1 - startG1) / 1000;
        System.out.println("Greedy Method Profit for input 1: " + greedy1);
        System.out.println("Runtime for Greedy algo Input 1: " + runtimeG1 + " microseconds");
        System.out.println();

        System.out.println("Brute Force Method for Input 1: ");
        long startB1 = System.nanoTime();
        int brute1 = BruteForce.knapsack(knap1.getValue(), knap1.getWeight(), knap1.getCapacity());
        long endB1 = System.nanoTime();
        long runtimeB1 = (endB1 - startB1) / 1000;
        System.out.println("Brute Force Method Profit for input 1: " + brute1);
        System.out.println("Runtime for Brute Force algo Input 1: " + runtimeB1 + " microseconds");
        System.out.println();

        System.out.println("******************** Input 2 Max Profit & Run times *************************");

        System.out.println("Dynamic programming Max Value and Items Input 2: ");
        long star2 = System.nanoTime();
        Dynamic.knapsackDyProg(knap2.getWeight(), knap2.getValue(), knap2.getCapacity(), knap2.getWeight().length);
        long end2 = System.nanoTime();
        long runtime2 = (end2 - star2) / 1000;
        System.out.println("Runtime for Dynamic programming Input 2: " + runtime2 + " microseconds");
        System.out.println();

        System.out.println("Greedy Method Items for Input 2: " );
        long startG2 = System.nanoTime();
        int greedy2 = greedy.run(knap2.getCapacity(), knap2.getWeight(), knap2.getValue());
        long endG2 = System.nanoTime();
        long runtimeG2 = (endG2 - startG2) / 1000;
        System.out.println("Greedy Method Profit for input 2: " + greedy2);
        System.out.println("Runtime for Greedy algo Input 2: " + runtimeG2 + " microseconds");
        System.out.println();

        System.out.println("Brute Force Method for Input 2: ");
        long startB2 = System.nanoTime();
        int brute2 = BruteForce.knapsack(knap2.getValue(), knap2.getWeight(), knap2.getCapacity());
        long endB2 = System.nanoTime();
        long runtimeB2 = (endB2 - startB2) / 1000;
        System.out.println("Brute Force Method Profit for input 2: " + brute2);
        System.out.println("Runtime for Brute Force algo Input 2: " + runtimeB2 + " microseconds");
        System.out.println();

        System.out.println("******************** Input 3 Max Profit & Run times *************************");

        System.out.println("Dynamic programming Max Value and Items Input 3: ");
        long star3 = System.nanoTime();
        Dynamic.knapsackDyProg(knap3.getWeight(), knap3.getValue(), knap3.getCapacity(), knap3.getWeight().length);
        long end3 = System.nanoTime();
        long runtime3 = (end3 - star3) / 1000;
        System.out.println("Runtime for Dynamic programming Input 3: " + runtime3 + " microseconds");
        System.out.println();

        System.out.println("Greedy Method Items for Input 3: " );
        long startG3 = System.nanoTime();
        int greedy3 = greedy.run(knap3.getCapacity(), knap3.getWeight(), knap3.getValue());
        long endG3 = System.nanoTime();
        long runtimeG3 = (endG3 - startG3) / 1000;
        System.out.println("Greedy Method Profit for input 3: " + greedy3);
        System.out.println("Runtime for Greedy algo Input 3: " + runtimeG3 + " microseconds");
        System.out.println();

        System.out.println("Brute Force Method for Input 3: ");
        long startB3 = System.nanoTime();
        int brute3 = BruteForce.knapsack(knap3.getValue(), knap3.getWeight(), knap3.getCapacity());
        long endB3 = System.nanoTime();
        long runtimeB3 = (endB3 - startB3) / 1000;
        System.out.println("Brute Force Method Profit for input 3: " + brute3);
        System.out.println("Runtime for Brute Force algo Input 3: " + runtimeB3 + " microseconds");
        System.out.println();

        System.out.println("******************** Input 4 Max Profit & Run times *************************");

        System.out.println("Dynamic programming Max Value and Items Input 4: ");
        long star4 = System.nanoTime();
        Dynamic.knapsackDyProg(knap4.getWeight(), knap4.getValue(), knap4.getCapacity(), knap4.getWeight().length);
        long end4 = System.nanoTime();
        long runtime4 = (end4 - star4) / 1000;
        System.out.println("Runtime for Dynamic programming Input 4: " + runtime4 + " microseconds");
        System.out.println();

        System.out.println("Greedy Method Items for Input 4: " );
        long startG4 = System.nanoTime();
        int greedy4 = greedy.run(knap4.getCapacity(), knap4.getWeight(), knap4.getValue());
        long endG4 = System.nanoTime();
        long runtimeG4 = (endG4 - startG4) / 1000;
        System.out.println("Greedy Method Profit for input 4: " + greedy4);
        System.out.println("Runtime for Greedy algo Input 4: " + runtimeG4 + " microseconds");
        System.out.println();

        System.out.println("Brute Force Method for Input 4: ");
        long startB4 = System.nanoTime();
        int brute4 = BruteForce.knapsack(knap4.getValue(), knap4.getWeight(), knap4.getCapacity());
        long endB4 = System.nanoTime();
        long runtimeB4 = (endB4 - startB4) / 1000;
        System.out.println("Brute Force Method Profit for input 4: " + brute4);
        System.out.println("Runtime for Brute Force algo Input 4: " + runtimeB4 + " microseconds");
        System.out.println();

        System.out.println("******************** Input 5 Max Profit & Run times *************************");

        System.out.println("Dynamic programming Max Value and Items Input 5: ");
        long star5 = System.nanoTime();
        Dynamic.knapsackDyProg(knap5.getWeight(), knap5.getValue(), knap5.getCapacity(), knap5.getWeight().length);
        long end5 = System.nanoTime();
        long runtime5 = (end5 - star5) / 1000;
        System.out.println("Runtime for Dynamic programming Input 5: " + runtime5 + " microseconds");
        System.out.println();

        System.out.println("Greedy Method Items for Input 5: " );
        long startG5 = System.nanoTime();
        int greedy5 = greedy.run(knap5.getCapacity(), knap5.getWeight(), knap5.getValue());
        long endG5 = System.nanoTime();
        long runtimeG5 = (endG5 - startG5) / 1000;
        System.out.println("Greedy Method Profit for input 5: " + greedy5);
        System.out.println("Runtime for Greedy algo Input 5: " + runtimeG5 + " microseconds");
        System.out.println();

        System.out.println("Brute Force Method for Input 5: ");
        long startB5 = System.nanoTime();
        int brute5 = BruteForce.knapsack(knap5.getValue(), knap5.getWeight(), knap5.getCapacity());
        long endB5 = System.nanoTime();
        long runtimeB5 = (endB5 - startB5) / 1000;
        System.out.println("Brute Force Method Profit for input 5: " + brute5);
        System.out.println("Runtime for Brute Force algo Input 5: " + runtimeB5 + " microseconds");
        System.out.println();

        System.out.println("******************** Input 6 Max Profit & Run times *************************");

        System.out.println("Dynamic programming Max Value and Items Input 6: ");
        long star6 = System.nanoTime();
        Dynamic.knapsackDyProg(knap6.getWeight(), knap6.getValue(), knap6.getCapacity(), knap6.getWeight().length);
        long end6 = System.nanoTime();
        long runtime6 = (end6 - star6) / 1000;
        System.out.println("Runtime for Dynamic programming Input 6: " + runtime6 + " microseconds");
        System.out.println();

        System.out.println("Greedy Method Items for Input 6: " );
        long startG6 = System.nanoTime();
        int greedy6 = greedy.run(knap6.getCapacity(), knap6.getWeight(), knap6.getValue());
        long endG6 = System.nanoTime();
        long runtimeG6 = (endG6 - startG6) / 1000;
        System.out.println("Greedy Method Profit for input 6: " + greedy6);
        System.out.println("Runtime for Greedy algo Input 6: " + runtimeG6 + " microseconds");
        System.out.println();

        System.out.println("Brute Force Method for Input 6: ");
        long startB6 = System.nanoTime();
        int brute6 = BruteForce.knapsack(knap6.getValue(), knap6.getWeight(), knap6.getCapacity());
        long endB6 = System.nanoTime();
        long runtimeB6 = (endB6 - startB6) / 1000;
        System.out.println("Brute Force Method Profit for input 6: " + brute6);
        System.out.println("Runtime for Brute Force algo Input 6: " + runtimeB6 + " microseconds");
        System.out.println();

    }
}
