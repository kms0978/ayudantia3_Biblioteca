package org.example;

public class Biblioteca {
    private String nombreBiblioteca;
    private String direccion;
    private String [] listadoDeLibros;


    // Constructor
    public Biblioteca(String nombreBiblioteca, String direccion, String[] listadoDeLibros) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.direccion = direccion;
        this.listadoDeLibros = listadoDeLibros;
    }

    // Getters
    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }
    public String getDireccion() {
        return direccion;
    }
    public String[] getListadoDeLibros() {
        return listadoDeLibros;
    }

    // Setters
    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setListadoDeLibros(String[] listadoDeLibros) {
        this.listadoDeLibros = listadoDeLibros;
    }
}
