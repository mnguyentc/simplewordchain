/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import simplewordchain.simplewordchain;

/**
 *
 * @author mnguyentc
 */
public class framework {

    public static void main(String[] args) {
        simplewordchain ai = new simplewordchain();
        try {
            System.out.println("First word: " + args[0]);
            String firstWord = args[0];

            System.out.print("Group of words: ");

            List<String> list = new ArrayList<String>(Arrays.asList(args));
            list.removeAll(Arrays.asList(firstWord));
            args = list.toArray(new String[list.size()]);
            System.out.println(Arrays.toString(args).replace("[", "").replace("]", ""));
            System.out.println("\n");
            if (args.length < 2 || args.length > 1000) {
                // exit app
                System.exit(0);
            }

            String lastChar = firstWord.substring(firstWord.length() - 1);
            // TODO code application logic here

            boolean takeTurn = true;
            String input = "";

            while (true) {
                String name = "FIRST";
                String order = "SECOND";

                if (takeTurn == false) {
                    name = "SECOND";
                    order = "FIRST";
                }

                for (String wordChosen : args) {
                    if (wordChosen.substring(0, 1).equals(lastChar)) {
                        input = wordChosen;
                        break;
                    }
                    input = "";
                }
                boolean winner = ai.ai(args, input, lastChar);

                if (!winner) {
                    list.removeAll(Arrays.asList(input));
                    args = list.toArray(new String[list.size()]);
                    System.out.println(name + " (OK): " + input);
                    System.out.print("Words left: ");
                    System.out.println(Arrays.toString(args).replace("[", "").replace("]", ""));
                    System.out.println("\n");
                    lastChar = input.substring(input.length() - 1);
                } else {
                    System.out.println(name + " (NG): " + input);
                    System.out.println("WIN - " + order);
                    break;
                }

                takeTurn = !takeTurn;
            }
        } catch (Exception e) {
            System.out.println("Exception occurred" + e);
        }
    }
}
