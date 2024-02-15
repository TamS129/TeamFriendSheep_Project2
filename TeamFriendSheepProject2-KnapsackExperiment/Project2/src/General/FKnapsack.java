package General;

public class FKnapsack {

        private int itemNum;
        private int value;
        private int weight;
        private double ratio;
        private int capacity;
        private int[] original;

        private int[] weightList;
        private int[] valueList;


    public void FKnapsack(int[] input){
        itemNum = input[0];
        capacity = input[1];
        int startIndex = 2;
        int endIndex = input.length;

        // Calculating midpoint using startIndex and endIndex
        int midpoint = (startIndex + endIndex) / 2;

        // Initializing arrays
        original = new int[input.length];
        valueList = new int[midpoint - startIndex];
        weightList = new int[endIndex - midpoint];

        // Copying values from input to the respective arrays
        System.arraycopy(input, 0, original, 0, input.length);

        // Creating arrays for value and weight
        int[] valueArray = new int[midpoint - startIndex];
        int[] weightArray = new int[endIndex - midpoint];

        // Copying values from input to the respective arrays
        System.arraycopy(input, startIndex, valueArray, 0, midpoint - startIndex);
        System.arraycopy(input, midpoint, weightArray, 0, endIndex - midpoint);

        // Assigning the arrays to the class variables
        this.valueList = valueArray;
        this.weightList = weightArray;

    }

    public FKnapsack(){
        this.itemNum = itemNum;
        this.value = value;
        this.weight = weight;
        this.ratio = ratio;
        this.capacity = capacity;
        this.original = original;
        this.weightList = weightList;
        this.valueList = valueList;
    }
    public FKnapsack(int itemNum, int weight, int value){
        this.itemNum = itemNum + 1;
        this.weight = weight;
        this.value = value;
        this.ratio = (double) value / weight;
    }
        public FKnapsack(int itemNum, int weight, int value, double ratio ){
            this.itemNum = itemNum + 1;
            this.weight = weight;
            this.value = value;
            this.ratio = (double) value / weight;

        }
        public int getItemNum(){
            return this.itemNum;
        }

        public double getRatio(){
            return this.ratio;
        }

    public void setRatio(double ratio){
        this.ratio = ratio;
    }

    public void setValue(int value){
        this.value = value;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

        public double getValue(){
            return this.value;
        }

        public int getWeight(){
            return this.weight;
        }

        public int getCapacity(){
        return this.capacity;
        }

        public int[] getWeightList(){
            return this.weightList ;
        }

        public int[] getValueList(){
        return this.valueList ;
    }


    }


