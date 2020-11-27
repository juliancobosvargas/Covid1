package com.example.covid1;

public class Milugar {
    private String titulo = "";
    private String descri = "";
    private Double latitu = 0.0;
    private Double longit = 0.0;
    private int imagen = R.drawable.icocovid;

    public Milugar(String titulo, String descri, Double latitu, Double longit, int imagen) {
        this.titulo = titulo;
        this.descri = descri;
        this.latitu = latitu;
        this.longit = longit;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescri() {
        return descri;
    }

    public Double getLatitu() {
        return latitu;
    }

    public Double getLongit() {
        return longit;
    }

    public int getImagen() {
        return imagen;
    }
}
