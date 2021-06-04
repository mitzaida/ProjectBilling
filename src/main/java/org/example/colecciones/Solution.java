package org.example.colecciones;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.DoubleToIntFunction;

public class Solution {

    public static void main(String[] args) {
        String s = "abcdini asdf jklñ asdf jklñ asdf jklñ abcdfin";
        int indexes[] = new int[100];
        String sources[] = new String[100];
        String targets[] = new String[100];

        for (int i=0; i<indexes.length; i++) {
            indexes[i]=i;
        }


        for (int i=0; i<sources.length; i++) {
            sources[i]=" ";
        }


        for (int i=0; i<targets.length; i++) {
            targets[i]=" ";
        }

        targets[0]=" cam0 ";
        targets[1]=" cam1 ";
        targets[2]=" cam2 ";
        targets[3]=" cam3 ";
        targets[4]=" cam4 ";
        targets[5]=" cam5 ";
        targets[6]=" cam6 ";
        targets[7]=" cam7 ";
        targets[8]=" cam8 ";
        targets[12]=" cam12 ";
        targets[17]=" cam17 ";
        targets[22]=" cam22 ";
        targets[32]=" cam32 ";

        //System.out.println("\n ");


//        sources[0]="abcdinicio";
//        sources[1]="asdf";
//        sources[2]="jklñ";
//        sources[3]="asdf";
//        sources[4]="jklñ";
//        sources[4]="abcdfin";

        //StringBuilder sbDos;

        findReplaceString(s, indexes, sources, targets);



        System.out.println("\n Terminó...");

    }



    public static String findReplaceString(String s, int[] indexes, String[] sources, String[] targets) {

        if (s == null) {return ""; }

        int[] check = new int[s.length()];

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        Arrays.fill(check, 0);

        for (int i = 0; i < indexes.length; i++) {

            if (s.indexOf(sources[i], indexes[i]) == indexes[i]) {

                for (int j = indexes[i]; j < indexes[i] + sources[i].length(); j++) {

                    check[j] = -1;

                    map.put(indexes[i], targets[i]);
                    System.out.println("MAPA PUT con indexes [í]. Valor de i = " + i +
                                       "\n                 Valor de map en i = " + map.get(j));
                    System.out.println("Valor de indexes[i] = "+ indexes[i] );
                    System.out.println("Valor de targets[i] = "+ targets[i] );

                }
            }

        }

        System.out.println("\n MAPA FINAL fuera del FOR: " + map);


        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < check.length; i++) {
            if (check[i] == -1) {
                if (map.containsKey(i))

                    sb.append(map.get(i));
                //sb.replace(int star, int end, String srt)
                    sb.replace(i,i, map.get(i));

                    System.out.println("\n  map en posición: " + i + " map.get(i): " +
                                        map.get(i) + "  SB =  " + sb +"\n");


            } else {
                sb.append(s.charAt(i));
            }
        }

        System.out.println("\n Valores de map : "+sb +"\n");

        System.out.println("\n Valores de sb : "+sb  +"\n");

        return sb.toString();

    }
}

