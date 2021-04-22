package com.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MultipleBrackets {


    public static void main(String[] args) {

        String[] datos = {
                "(hola)",
                "(c(od[e])))",
                "(c(od[e]))",
                "()[) G ()"
        };

        for (String dato : datos) {
            System.out.printf("dato: %s  es valido?: %b \n", dato, isValid(dato));
        }
    }

    private static boolean isValid(String dato) {

        boolean isValid = false;
        int counter = 0;
        String simbValid = "(){}[]";
        char[] letras = dato.toCharArray();
        Stack<Character> pila = new Stack<>();

        Map<Character, Character> oc = new HashMap<>();
        oc.put(')', '(');
        oc.put('}', '{');
        oc.put(']', '[');

        for (char l : letras) {
            if (simbValid.contains(String.valueOf(l))) {

                if (!oc.containsKey(l)) {
                    pila.push(l);
                } else if (pila.isEmpty()) {
                    isValid = false;
                    break;
                } else if (oc.get(l) != (pila.peek())) {
                    isValid = false;
                    break;
                } else {
                    isValid = true;
                    counter++;
                    pila.pop();
                }
            }
        }

        System.out.printf(" parentesis validos antes de algun error: %d ", counter);

        return isValid;
    }
}


//
//    String validB = "(){}[]";
//    Stack<Character> temp = new Stack<>();
//
//    Map<Character, Character> ocBrackets = new HashMap<>();
//        ocBrackets.put(')','(');
//        ocBrackets.put('}','{');
//        ocBrackets.put(']','[');

