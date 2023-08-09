package org.example.clases;

public class Animal {

    protected String nombre;
    private String tipo;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

   private void hacerAlgo() {
        System.out.println("Hace algo");
    }

    public void hacerRuido() {
        System.out.println("GRRRRRRRR");;
    }

    public void caminar() {

    }

}
