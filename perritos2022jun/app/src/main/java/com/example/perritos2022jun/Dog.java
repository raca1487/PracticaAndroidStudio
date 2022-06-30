package com.example.perritos2022jun;

public class Dog {

    private int imagen;
    private String nombre;
    private int visitas;

    public Dog(int imagen, String nombre, int visitas) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.visitas = visitas;
    }

    public int getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVisitas() {
        return visitas;
    }
}
