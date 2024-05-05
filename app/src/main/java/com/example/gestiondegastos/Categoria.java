package com.example.gestiondegastos;

public class Categoria {
    private String nombre;

    private double monto;


    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setMonto(double monto){
        this.monto=monto;
    }

    public Double getMonto(){
        return monto;
    }

}


