package FractionalKnapsack;
/**
 * Made by Robin/Tamara
 */

import General.Reader;
import General.knapsack;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Reader read = new Reader();
        Greedy greedy = new Greedy();
        BruteForce bruteForce = new BruteForce();

        /**
         * Our group had a weird encounter where some computers could read the input files from one reference path, and some
         * computers read from the other. If your computer does not read the input file, then comment out the current reference
         * path and uncomment out the other reference path.
         */


        int[] input1 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs.csv"));
//        int[] input1 = read.load(new File("Project2/src/InputFiles/inputs.csv"));
        knapsack knap1 = new knapsack();
        knap1.load(input1);

        int[] input2 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs2.csv"));
//        int[] input2 = read.load(new File("Project2/src/InputFiles/inputs2.csv"));
        knapsack knap2 = new knapsack();
        knap2.load(input2);

        int[] input3 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs3.csv"));
//        int[] input3 = read.load(new File("Project2/src/InputFiles/inputs3.csv"));
        knapsack knap3 = new knapsack();
        knap3.load(input3);

        int[] input4 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/input4.csv"));
//        int[] input4 = read.load(new File("Project2/src/InputFiles/input4.csv"));
        knapsack knap4 = new knapsack();
        knap4.load(input4);

        int[] input5 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs5.csv"));
//        int[] input5 = read.load(new File("Project2/src/InputFiles/inputs5.csv"));
        knapsack knap5 = new knapsack();
        knap5.load(input5);

        int[] input6 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/input6.csv"));
//        int[] input6 = read.load(new File("Project2/src/InputFiles/input6.csv"));
        knapsack knap6 = new knapsack();
        knap6.load(input6);

        //Greedy Implementation
        System.out.println("----- Fractional Greedy Results -----");
        long startGreedy1 = System.nanoTime();
        greedy.run(knap1.getTitle(), knap1.getCapacity(), knap1.getWeight(), knap1.getValue());
        long endGreedy1  = System.nanoTime();
        long runtimeGreedy1 = (endGreedy1 - startGreedy1) / 1000;
        System.out.println("Fractional Greedy runtime for Input 1 = " + runtimeGreedy1 + " microseconds.");

        long startGreedy2 = System.nanoTime();
        greedy.run(knap2.getTitle(), knap2.getCapacity(), knap2.getWeight(), knap2.getValue());
        long endGreedy2  = System.nanoTime();
        long runtimeGreedy2 = (endGreedy2 - startGreedy2) / 1000;
        System.out.println("Fractional Greedy runtime for Input 2 = " + runtimeGreedy2 + "microseconds.");


        long startGreedy3 = System.nanoTime();
        greedy.run(knap3.getTitle(), knap3.getCapacity(), knap3.getWeight(), knap3.getValue());
        long endGreedy3  = System.nanoTime();
        long runtimeGreedy3 = (endGreedy3 - startGreedy3) / 1000;
        System.out.println("Fractional Greedy runtime for Input 3 = " + runtimeGreedy3 + " microseconds.");

        long startGreedy4 = System.nanoTime();
        greedy.run(knap4.getTitle(), knap4.getCapacity(), knap4.getWeight(), knap4.getValue());
        long endGreedy4  = System.nanoTime();
        long runtimeGreedy4 = (endGreedy4 - startGreedy4) / 1000;
        System.out.println("Fractional Greedy runtime for Input 4 = " + runtimeGreedy4 + " microseconds.");


        long startGreedy5 = System.nanoTime();
        greedy.run(knap5.getTitle(), knap5.getCapacity(), knap5.getWeight(), knap5.getValue());
        long endGreedy5  = System.nanoTime();
        long runtimeGreedy5 = (endGreedy5 - startGreedy5) / 1000;
        System.out.println("Fractional Greedy runtime for Input 5 = " + runtimeGreedy5 + " microseconds.");

        long startGreedy6 = System.nanoTime();
        greedy.run(knap6.getTitle(), knap6.getCapacity(), knap6.getWeight(), knap6.getValue());
        long endGreedy6  = System.nanoTime();
        long runtimeGreedy6 = (endGreedy6 - startGreedy6) / 1000;
        System.out.println("Fractional Greedy runtime for Input 6 = " + runtimeGreedy6 + " microseconds.");

        System.out.println("\n----- Fractional Bruteforce Results -----");

        long start1 = System.nanoTime();
        double result1 = bruteForce.BruteForceFraction(knap1.getValue(), knap1.getWeight(), knap1.getCapacity());
        long end1  = System.nanoTime();
        long runtime1 = (end1 - start1) / 1000;
        System.out.println("Max benefit of input1: " + result1);
        System.out.println("Runtime for BruteForce input1: " + runtime1 + " microseconds");
        System.out.println();

        long start2 = System.nanoTime();
        double result2 = bruteForce.BruteForceFraction(knap2.getValue(), knap2.getWeight(), knap2.getCapacity());
        long end2  = System.nanoTime();
        long runtime2 = (end2 - start2) / 1000;
        System.out.println("Max benefit: " + result2);
        System.out.println("Runtime for BruteForce input2: " + runtime2 + " microseconds");
        System.out.println();

        long start3 = System.nanoTime();
        double result3 = bruteForce.BruteForceFraction(knap3.getValue(), knap3.getWeight(), knap3.getCapacity());
        long end3  = System.nanoTime();
        long runtime3 = (end3 - start3) / 1000;
        System.out.println("Max benefit: " + result3);
        System.out.println("Runtime for BruteForce input3: " + runtime3 + " microseconds");
        System.out.println();

        long start4 = System.nanoTime();
        double result4 = bruteForce.BruteForceFraction(knap4.getValue(), knap4.getWeight(), knap4.getCapacity());
        long end4  = System.nanoTime();
        long runtime4 = (end4 - start4) / 1000;
        System.out.println("Max benefit: " + result4);
        System.out.println("Runtime for BruteForce input4: " + runtime4 + " microseconds");
        System.out.println();

        long start5 = System.nanoTime();
        double result5 = bruteForce.BruteForceFraction(knap5.getValue(), knap5.getWeight(), knap5.getCapacity());
        long end5  = System.nanoTime();
        long runtime5 = (end5 - start5) / 1000;
        System.out.println("Max benefit: " + result5);
        System.out.println("Runtime for BruteForce input5: " + runtime5 + " microseconds");
        System.out.println();

        long start6 = System.nanoTime();
        double result6 = bruteForce.BruteForceFraction(knap6.getValue(), knap6.getWeight(), knap6.getCapacity());
        long end6  = System.nanoTime();
        long runtime6 = (end6 - start6) / 1000;
        System.out.println("Max benefit: " + result6);
        System.out.println("Runtime for BruteForce input6: " + runtime6 + " microseconds");
        System.out.println();

        System.out.println();



    }
}