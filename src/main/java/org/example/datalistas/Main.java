package org.example.datalistas;

public class Main {
        public static void main(String [] args) {
            String message = "Hello2world!";
            //String newMessage = message.substring(0,3); //+
            // message.substring(12,6);
            //System.out.println(newMessage);


            String newMessage = message.substring(6,12) + message.substring(0,5);
            System.out.println(newMessage);

//            try {
//                System.out.println("A");
//                badMethod();
//                System.out.println("B");
//            }  catch (Exeption ex) {
//                System.out.println("C");
//            }  finally   {
//                System.out.println("D");
//            }
        }

        //public static void badMethod() { }

//    class Main2 {
//        public static int count = 0;
//
//        public static main(String[] args)  {
//            if (count < 3) {
//                count ++ ;
//                main(null) ;
//            } else {
//                return;
//            }
//            System.out.println("Hello World!") ;
//        }
//    }



}
