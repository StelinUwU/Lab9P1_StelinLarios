/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_stelinlarios;

import java.util.ArrayList;

/**
 *
 * @author stelinlarios
 */
public class Game {

    public ArrayList<String> celulasVivas;
    public int rondasAJugar;
    public int[][] tableroGeneracionActual = new int[10][10];
    public int[][] tableroSiguienteGeneracion = new int[10][10];

    public Game() {
    }

    public void setTableroGeneracionActual(int[][] tableroGeneracionActual) {
        this.tableroGeneracionActual = tableroGeneracionActual;
    }

    public void setCelulasVivas(ArrayList<String> celulasVivas) {
        this.celulasVivas = celulasVivas;
    }

    public void setRondasAJugar(int rondasAJugar) {
        this.rondasAJugar = rondasAJugar;
    }

    public void setTableroSiguienteGeneracion(int[][] tableroSiguienteGeneracion) {
        this.tableroSiguienteGeneracion = tableroSiguienteGeneracion;
    }

    public void jugar(int rondasAJugar) {
        System.out.println("----Comenzando juego----");
        System.out.println(celulasVivas);
        Print(celulasVivas);

        int rondasJugadas = 1;

        while (rondasJugadas <= rondasAJugar) {
            System.out.println("Ronda:" + rondasJugadas);
            System.out.println("Coordenadas de celdas vivas:");
            System.out.println(celulasVivas);
            Print(celulasVivas);
            rondasJugadas++;
        }

    }

    public void nextGen() {
        
        
        
    }

    public void Print(ArrayList<String> coords) {
        int[][] tableroAux = new int[10][10];

        for (int i = 0; i < tableroAux.length; i++) {
            for (int j = 0; j < tableroAux[0].length; j++) {
                tableroAux[i][j] = 0;
            }
        }

        for (int i = 0; i < coords.size(); i++) {
            int fila = coords.get(i).charAt(0) - 48;
            int columna = coords.get(i).charAt(2) - 48;
            tableroAux[fila][columna] = 1;
        }

        for (int i = 0; i < tableroAux.length; i++) {
            for (int j = 0; j < tableroAux[i].length; j++) {
                System.out.print("[" + tableroAux[i][j] + "]");
            }
            System.out.println(' ');
        }

    }

}
