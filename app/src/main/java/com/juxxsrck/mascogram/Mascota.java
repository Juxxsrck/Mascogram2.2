package com.juxxsrck.mascogram;

public class Mascota {
    private String nombre;
    private String raiting;
    private int foto;

    public Mascota(int foto, String nombre, String raiting){
        this.foto = foto;
        this.nombre = nombre;
        this.raiting = raiting;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaiting() {
        return raiting;
    }

    public void setRaiting(String raiting) {
        this.raiting = raiting;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}


