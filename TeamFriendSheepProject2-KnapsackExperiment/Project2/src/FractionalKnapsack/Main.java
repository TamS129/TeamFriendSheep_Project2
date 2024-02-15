package FractionalKnapsack;
import General.Reader;
import General.knapsack;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Reader read = new Reader();
        Greedy greedy = new Greedy();

        int[] input1 = read.load(new File("Project2/src/InputFiles/inputs.csv"));
        knapsack knap1 = new knapsack();
        knap1.load(input1);

        greedy.run(knap1.getTitle(), knap1.getCapacity(), knap1.getWeight(), knap1.getValue());

        int[] input2 = read.load(new File("Project2/src/InputFiles/inputs2.csv"));
        knapsack knap2 = new knapsack();
        knap2.load(input2);

        greedy.run(knap2.getTitle(), knap2.getCapacity(), knap2.getWeight(), knap2.getValue());

        int[] input3 = read.load(new File("Project2/src/InputFiles/inputs3.csv"));
        knapsack knap3 = new knapsack();
        knap3.load(input3);

        greedy.run(knap3.getTitle(), knap3.getCapacity(), knap3.getWeight(), knap3.getValue());

        int[] input4 = read.load(new File("Project2/src/InputFiles/inputs5.csv"));
       knapsack knap4 = new knapsack();
        knap4.load(input2);

        greedy.run(knap2.getTitle(), knap2.getCapacity(), knap2.getWeight(), knap2.getValue());
    }
}