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


public class Fabricante {
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> fabricantes= new ArrayList<Fabricante>();
    protected int cantidadVentas = 0;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Pais getPais(){
        return pais;
    }
    public void setPais(Pais pais){
        this.pais = pais;
    }

    public static ArrayList<Fabricante> getFabricantes(){
        return fabricantes;
    }

    public static Fabricante fabricaMayorVentas(){
        return Collections.max(fabricantes, (f1,f2)->f1.cantidadVentas-f2.cantidadVentas);
    }
}
