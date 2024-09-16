/*
 * Copyright (c) 2014 Michiel Noback
 * All rights reserved
 * www.bioinf.nl, www.cellingo.net
 */
package section2_syntax.part3_flow_control;

/**
 *
 * @author michiel
 */
public class AllSubstringsPrinter {
    /**
     * main method serves development purposes only.
     *
     * @param args the args
     */
    public static void main(String[] args) {
        final AllSubstringsPrinter asp = new AllSubstringsPrinter();
        asp.printAllSubstrings("GATCG", true, false); //should print left truncated, left aligned
    }

    /**
     * Given a String object, it should print all possible substrings of it where
     * in each iteration the rightmost character is left out.
     *
     * @param word the string to substring
     */
    public void printSubstringsLeftAlignedLeftTruncated(String word) {
        for (int i = 0; i < word.length(); i++) {
            String subString = word.substring(i, word.length());
            System.out.println(subString);
        }
    }

    /**
     * Prints all possible substrings according to arguments. You can make use of {@link #createSpacer(int length) createSpacer} method.
     *
     * @param word          the string to substring
     * @param leftTruncated flag to indicate whether the substrings should be truncated from the left (or the right)
     * @param leftAligned   flag to indicate whether the substrings should be printed left-aligned (or right-aligned)
     */
    public void printAllSubstrings(String word, boolean leftTruncated, boolean leftAligned) {
        if (leftAligned) {
            if (leftTruncated) {
                for (int i = 0; i < word.length(); i++) {
                    String subString = word.substring(i, word.length());
                    System.out.println(subString);
                }
            } else {
                for (int i = 0; i < word.length(); i++) {
                    String subString = word.substring(0, word.length() - i);
                    System.out.println(subString);
                }
            }
        } else{
            if (leftTruncated) {
                for (int i = 0; i < word.length(); i++) {
                    String subString = word.substring(i, word.length());
                    String spacer = createSpacer(i);
                    System.out.println(spacer + subString);
                }
            } else {
                for (int i = 0; i < word.length(); i++) {
                    String subString = word.substring(0, word.length() - i);
                    System.out.println(subString);
                    String spacer = createSpacer(i);
                    System.out.println(spacer + subString);
                }
            }
        }
    }

    private String createSpacer(int length) {
        StringBuilder spacer = new StringBuilder();
        for (int i = 0; i < length; i++) {
            spacer.append(' ');
        }
        return spacer.toString();
    }
}