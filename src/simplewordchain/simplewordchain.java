/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplewordchain;

import java.util.Arrays;

/**
 *
 * @author mnguyentc
 */
public class simplewordchain {

    public boolean ai(String[] wordList, String wordPlayed, String lastChar) {
        boolean contains = Arrays.asList(wordList).contains(wordPlayed);

        if (contains) {
            if (wordPlayed.substring(0, 1).equals(lastChar)) {
                return false;
            }
        }
        return true;
    }
    
    public static String play(String[] wordList, String lastChar) {
        System.out.println("dsakbsdhsabd");
        for (String wordChosen : wordList) {
            System.out.println("wordChosen: " + wordChosen);
            if (wordChosen.substring(1).equals(lastChar)) {
                return wordChosen;
            }
        }
        return "";
    }
}
