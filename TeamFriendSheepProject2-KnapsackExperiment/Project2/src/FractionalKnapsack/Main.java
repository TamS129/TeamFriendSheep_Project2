package FractionalKnapsack;
import General.Reader;
import General.knapsack;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Reader read = new Reader();
        Greedy greedy = new Greedy();
        BruteForce bruteForce = new BruteForce();

        int[] input1 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs.csv"));
        knapsack knap1 = new knapsack();
        knap1.load(input1);

        greedy.run(knap1.getTitle(), knap1.getCapacity(), knap1.getWeight(), knap1.getValue());

        int[] input2 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs2.csv"));
        knapsack knap2 = new knapsack();
        knap2.load(input2);

        greedy.run(knap2.getTitle(), knap2.getCapacity(), knap2.getWeight(), knap2.getValue());

        int[] input3 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs3.csv"));
        knapsack knap3 = new knapsack();
        knap3.load(input3);

        greedy.run(knap3.getTitle(), knap3.getCapacity(), knap3.getWeight(), knap3.getValue());

        int[] input4 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/input4.csv"));
        knapsack knap4 = new knapsack();
        knap4.load(input4);

        greedy.run(knap4.getTitle(), knap4.getCapacity(), knap4.getWeight(), knap4.getValue());

        int[] input5 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/inputs5.csv"));
        knapsack knap5 = new knapsack();
        knap5.load(input5);

        greedy.run(knap5.getTitle(), knap5.getCapacity(), knap5.getWeight(), knap5.getValue());

        int[] input6 = read.load(new File("TeamFriendSheepProject2-KnapsackExperiment/Project2/src/InputFiles/input6.csv"));
        knapsack knap6 = new knapsack();
        knap6.load(input6);

        greedy.run(knap6.getTitle(), knap6.getCapacity(), knap6.getWeight(), knap6.getValue());


        double result1 = bruteForce.BruteForceFraction(knap1.getValue(), knap1.getWeight(), knap1.getCapacity());
        double result2 = bruteForce.BruteForceFraction(knap2.getValue(), knap2.getWeight(), knap2.getCapacity());
        double result3 = bruteForce.BruteForceFraction(knap3.getValue(), knap3.getWeight(), knap3.getCapacity());
        double result4 = bruteForce.BruteForceFraction(knap4.getValue(), knap4.getWeight(), knap4.getCapacity());
        double result5 = bruteForce.BruteForceFraction(knap5.getValue(), knap5.getWeight(), knap5.getCapacity());
        double result6 = bruteForce.BruteForceFraction(knap6.getValue(), knap6.getWeight(), knap6.getCapacity());

        System.out.println();

        long start1 = System.nanoTime();
        System.out.println("Max benefit of input1: " + result1);
        long end1  = System.nanoTime();
        long runtime1 = (end1 - start1) / 1000;
        System.out.println("Runtime for BruteForce input1: " + runtime1 + " microseconds");
        System.out.println();

        long start2 = System.nanoTime();
        System.out.println("Max benefit: " + result2);
        long end2  = System.nanoTime();
        long runtime2 = (end2 - start2) / 1000;
        System.out.println("Runtime for BruteForce input2: " + runtime2 + " microseconds");
        System.out.println();

        long start3 = System.nanoTime();
        System.out.println("Max benefit: " + result3);
        long end3  = System.nanoTime();
        long runtime3 = (end3 - start3) / 1000;
        System.out.println("Runtime for BruteForce input3: " + runtime3 + " microseconds");
        System.out.println();

        long start4 = System.nanoTime();
        System.out.println("Max benefit: " + result4);
        long end4  = System.nanoTime();
        long runtime4 = (end4 - start4) / 1000;
        System.out.println("Runtime for BruteForce input4: " + runtime4 + " microseconds");
        System.out.println();

        long start5 = System.nanoTime();
        System.out.println("Max benefit: " + result5);
        long end5  = System.nanoTime();
        long runtime5 = (end5 - start5) / 1000;
        System.out.println("Runtime for BruteForce input5: " + runtime5 + " microseconds");
        System.out.println();

        long start6 = System.nanoTime();
        System.out.println("Max benefit: " + result6);
        long end6  = System.nanoTime();
        long runtime6 = (end6 - start6) / 1000;
        System.out.println("Runtime for BruteForce input6: " + runtime6 + " microseconds");
        System.out.println();




    }
}