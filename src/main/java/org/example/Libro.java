package org.example;

public class Libro {
    private String nombre;
    private String autor;
    private String editorial;


    // Constructor
    public Libro(String nombre, String autor, String editorial) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getAutor() {
        return autor;
    }
    public String getEditorial() {
        return editorial;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
