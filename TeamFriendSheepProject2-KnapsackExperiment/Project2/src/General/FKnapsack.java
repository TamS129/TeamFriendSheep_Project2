package General;

public class FKnapsack {

        private int itemNum;
        private int value;
        private int weight;
        private double ratio;

        public FKnapsack(int itemNum, int weight, int value, double ratio ){
            this.itemNum = itemNum;
            this.weight = weight;
            this.value = value;
            this.ratio = ratio;
        }
        public int getItemNum(){
            return this.itemNum;
        }

        public double getRatio(){
            return this.ratio;
        }

        public double getValue(){
            return this.value;
        }

        public int getWeight(){
            return weight;
        }


    }


