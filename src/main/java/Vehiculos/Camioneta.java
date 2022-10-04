package Vehiculos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paula
 */
public class Camioneta extends Vehiculo {

    private boolean volco;
    private static int cantidadCamionetas = 0;
    
    public Camioneta(String placa, int puertas, String nombre, int precio, float peso, Fabricante fabricante, boolean volco) {
    
    super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
    this.volco = volco;
    cantidadCamionetas++;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int getCantidadCamionetas() {
        return cantidadCamionetas;
    }

    public static void setCantidadCamionetas(int cantidadCamionetas) {
        Camioneta.cantidadCamionetas = cantidadCamionetas;
    }

      
}