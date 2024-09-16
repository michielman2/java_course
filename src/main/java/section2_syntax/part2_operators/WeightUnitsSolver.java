/*
 * Copyright (c) 2015 Michiel Noback [michiel.noback@gmail.com].
 * All rights reserved.
 */

package section2_syntax.part2_operators;

public class WeightUnitsSolver {

    /**
     * Returns the number of Pounds, Ounces and Grams represented by this quantity of grams,
     * encapsulated in a BritishWeightUnits object.
     * @param grams the grams quantity
     * @return a BritishWeightUnits instance
     * @throws IllegalArgumentException when the Grams quantity is 
     */
    public BritishWeightUnits convertFromGrams(int grams) {
        int pounds = (int) grams / 454;
        int ounces = (int) (grams % 454) / 28;
        int gramsRemaining = (int) ((grams % 454) % 28);


        final int gramsTest = Integer.MIN_VALUE;

        if (grams < 0){
            throw new IllegalArgumentException("Grams cannot be negative");
        }


        if (gramsRemaining <= gramsTest) {
            throw new IllegalArgumentException("Error: grams should be above 0. Given: grams=" + gramsRemaining);
        }

        //solve the pounds, ounces and grams, create and return a BritishWeightUnits instance
        //YOUR CODE HERE
        return new BritishWeightUnits(pounds, ounces, gramsRemaining);


    }
}
