package class01;

import javax.sound.midi.Soundbank;

public class GoldPoint {
    public static void main(String[] args) {
        int range = 20;
        float breakPoint = 0.618f;

        float minDiff = 100;
        int aNumerator = 0;
        int aDenominator = 0;
        for (int numerator = 1; numerator <= range; numerator ++){
            for (int denominator = 1; denominator <= range;denominator ++){
                if (denominator % 2 == 0 & numerator % 2 == 0){
                    continue;
                }

                float val = (float) numerator/denominator;
                float diff = val - breakPoint;
                diff = diff < 0 ? -diff:diff;
                if (diff < minDiff){
                    minDiff = diff;
                    aNumerator = numerator;
                    aDenominator = denominator;
                }
            }

        }
        System.out.println("The numerator is " + aNumerator );
        System.out.println("The denominator is " + aDenominator);
        System.out.println("The number from calculation is + " + (float)aNumerator/aDenominator);

    }
}
