package vehiculos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paula
 */
public class Camion extends Vehiculo{

    
    private int ejes;
    private static int cantidadCamiones = 0;

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static int getCantidadCamiones() {
        return cantidadCamiones;
    }

    public static void setCantidadCamiones(int cantidadCamiones) {
        Camion.cantidadCamiones = cantidadCamiones;
    }
    
    public Camion(String placa, String nombre, int precio, float peso, Fabricante fabricante, int ejes) {
    super(placa, 2, 80, nombre, precio, peso, "4X2x", fabricante);
    this.ejes = ejes;
    cantidadCamiones++;
    }
    
}