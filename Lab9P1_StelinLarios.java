/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_stelinlarios;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author stelinlarios 1-14
 */
public class Lab9P1_StelinLarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] tableroGeneracionActual = new int[10][10];
        int[][] tableroSiguienteGeneracion = new int[10][10];
        ArrayList<String> celulasVivas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int rondasAJugar;
        System.out.println("Ingrese el número de rondas:");
        rondasAJugar = sc.nextInt();
        tableroGeneracionActual = llenarTablero(tableroGeneracionActual, tableroSiguienteGeneracion, celulasVivas);

        Game game = new Game();
        game.setRondasAJugar(rondasAJugar);
        game.setCelulasVivas(celulasVivas);
        game.setTableroSiguienteGeneracion(tableroSiguienteGeneracion);
        game.setTableroGeneracionActual(tableroGeneracionActual);
        game.jugar(rondasAJugar);

    }

    public static int[][] llenarTablero(int[][] tableroGeneracionActual, int[][] tableroSiguienteGeneracion, ArrayList<String> celulasVivas) {
        Random rand = new Random();

        for (int i = 0; i < tableroGeneracionActual.length; i++) {
            for (int j = 0; j < tableroGeneracionActual[0].length; j++) {
                if (i == 0 || j == 0 || i == tableroGeneracionActual.length - 1 || j == tableroGeneracionActual[0].length - 1) {
                    tableroGeneracionActual[i][j] = 0;
                } else {
                    int valor = rand.nextInt(2);
                    tableroGeneracionActual[i][j] = valor;
                    if (valor == 1) {
                        celulasVivas.add(i + ":" + j);
                    }
                }
            }
        }
        return tableroGeneracionActual;
    }

}
