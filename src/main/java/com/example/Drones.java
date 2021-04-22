package com.example;

public class Drones {


    public static void main(String[] args) {

        String[][] laberinto = {
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"},
                {"0", "0", "0", "0", "0"}
        };

        int posIniY = 2;
        int posIniX = 1;
        int posFinY = 4;
        int posFinX = 4;

        recorrerRuta(laberinto, posIniY, posIniX, posFinY, posFinX);

    }

    private static void recorrerRuta(String[][] laberinto, int posIniY, int posIniX, int posFinY, int posFinX) {

        int labY = laberinto.length;
        int labX = laberinto[0].length;

        if (posIniY >= labY || posIniY < 0) {
            throw new RuntimeException();
        } else if (posIniX < 0 || posIniX >= labX) {
            throw new RuntimeException();
        } else if (posFinX < 0 || posFinX >= labX) {
            throw new RuntimeException();
        } else if (posFinY < 0 || posFinY >= labY) {
            throw new RuntimeException();
        }
        mostrarLaberinto(laberinto);
        moverCood(laberinto, posIniY, posIniX, posFinY, posFinX);

    }

    static boolean flag = false;

    private static void moverCood(String[][] laberinto, int actualY, int actualX, int posFinY, int posFinX) {
        if (flag) {
            return;
        }

        int labY = laberinto.length;
        int labX = laberinto[0].length;

        if (actualY < 0 || actualY >= labY) {
            flag = false;
            return;
        } else if (actualX < 0 || actualX >= labX) {
            flag = false;
            return;
        }

        if (!laberinto[actualY][actualX].equalsIgnoreCase("0")) {
            flag = false;
            return;
        }

        laberinto[actualY][actualX] = "X";

        if (actualY == posFinY && actualX == posFinX) {
            flag = true;
            mostrarLaberinto(laberinto);
            return;
        }

        mostrarLaberinto(laberinto);

        moverCood(laberinto, actualY, actualX + 1, posFinY, posFinX);
        moverCood(laberinto, actualY + 1, actualX, posFinY, posFinX);
        moverCood(laberinto, actualY, actualX - 1, posFinY, posFinX);
        moverCood(laberinto, actualY - 1, actualX, posFinY, posFinX);
    }

    private static void mostrarLaberinto(String[][] laberinto) {
        System.out.println("================================");
        for (int y = 0; y < laberinto.length; y++) {

            for (int x = 0; x < laberinto[0].length; x++) {
                System.out.print(" " + laberinto[y][x]);
            }
            System.out.println();
        }
    }
}
