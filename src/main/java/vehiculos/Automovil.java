package vehiculos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paula
 */
public class Automovil extends Vehiculo {
    private int puestos;
    private static int cantidadAutomoviles = 0;
    
    public Automovil(String placa, String nombre, int precio, float peso, Fabricante fabricante, int puestos) {
    super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
    this.puestos= puestos;
    cantidadAutomoviles++;
}

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public static int getCantidadAutomoviles() {
        return cantidadAutomoviles;
    }

    public static void setCantidadAutomoviles(int cantidadAutomoviles) {
        Automovil.cantidadAutomoviles = cantidadAutomoviles;
    }
}