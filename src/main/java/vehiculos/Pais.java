package vehiculos;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author paula
 */
public class Pais {
    private String nombre ;
    protected int cantidadVendidos = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private static ArrayList<Pais> paises = new ArrayList<Pais>();

    public Pais(String nombre){
        this.nombre= nombre;
        paises.add(this);
    }
    
    public static Pais paisMasVendedor(){
        return Collections.max(paises, (p1,p2)->p1.cantidadVendidos-p2.cantidadVendidos);
    }
    
}