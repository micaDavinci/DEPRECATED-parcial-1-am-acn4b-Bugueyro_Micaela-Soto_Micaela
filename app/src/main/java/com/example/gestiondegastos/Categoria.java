package com.example.gestiondegastos;

public class Categoria {
    private String nombre;
    private String tipo;
    private double monto;

    private String fecha;

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setMonto(double monto){
        this.monto=monto;
    }

    public CharSequence getMonto(){
        return monto;
    }

    public void setFecha(String fecha){
        this.fecha=fecha;
    }
}
