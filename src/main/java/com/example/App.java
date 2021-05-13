package com.example;

public class App {

    public static void main(String[] args) {

        Model p1 = new Model();
        Model p2 = new Model();
        Model p3 = new Model();
        Model p4 = new Model();

        System.out.println("p1=" + p1);
        System.out.println("p2=" + p2);
        System.out.println("p3=" + p3);
        System.out.println("p4=" + p4);

        p1.setName("Cambió");
        p1.setLastName("NewLN");

        System.out.println("p1=" + p1);
        System.out.println("p2=" + p2);
        System.out.println("p3=" + p3);
        System.out.println("p4=" + p4);

    }


    static class Model {
        private static String name;
        private String lastName;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return getName() + " " + getLastName();
        }
    }
}
