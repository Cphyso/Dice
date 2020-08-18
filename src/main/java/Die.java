/**
 * Author: Sifiso Mhlongo
 * 
 * 
 * */

import java.util.ArrayList;
import java.util.Random;

public class Die {

    int [] probabilities ={1,1,1,1,1,1};
    //int sides = 6;
    int value;
    int weight;

    public void setProbabilities(int[] diceProbabilities) {
        this.probabilities = diceProbabilities;
        probabilities[5] = weight;
    }

    public void roll() {
        setProbabilities(probabilities);
        int upperBound = 0;
        for(int i = 0; i <= 5;i++){
            upperBound = upperBound + probabilities[i];
        }
        Random random = new Random();
        value = random.nextInt(upperBound);

            if(value>6){
                System.out.println("6");
            }else{
                System.out.println(value);
            }
    }
}