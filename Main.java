import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    //Just testing the code in this main method

    public static void main(String[] args) {

        for(int i = 0; i<10;++i){
            int x = CS2004.UI(0,1);
            System.out.println(x);
        }

        ScalesSolution s = new ScalesSolution("10101");
        s.println();

        // sets the value/length for scasol
        s = new ScalesSolution("xxxxxxxxxxx");
        s.println();


       // ArrayList<Double> weights = new ArrayList<>();
       // weights.add(1.0);
        // weights.add(2.0);
        // weights.add(3.0);
        // weights.add(4.0);
        // weights.add(10.0);


        //double fitness = s.ScalesFitness(weights);
        //System.out.println(fitness);

        // The different weights are represented by the 1000 first prime numbers
       ArrayList<Double> primes = new ArrayList<>(CS2004.ReadNumberFile("1000 Primes.txt"));

       double primeFitness = s.ScalesFitness(primes);

       System.out.println(primeFitness);

    }
}
