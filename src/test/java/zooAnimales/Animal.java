package zooAnimales;

import gestion.Zona;

public class Animal {

    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {

    }

    public Animal(String nombre, int edad, String habitat, String genero) {

        totalAnimales++;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        this.zona = null;

    }

    public String movimiento() {

        return "desplazarse";
    }


    public static String totalPorTipo() {

        String cadena = "Mamiferos: "+ Mamifero.cantidadMamiferos() +
                "\nAves: " + Ave.cantidadAvez() +
                "\nReptiles: "+ Reptil.cantidadReptiles()+
                "\nPeces: "+ Pez.cantidadPeces() + "\nAnfibios: "
                + Anfibio.cantidadAnfibios();

        return cadena;
    }


    public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        Animal.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public String toString() {

        if(zona == null) {
            return "Mi nombre es "+ this.nombre +", tengo una edad de " + this.edad + ", habito en "+ this.habitat + " y mi genero es " + this.genero;
        }
        return "Mi nombre es "+ this.nombre +", tengo una edad de " + this.edad + ", habito en "+ this.habitat + " y mi genero es " + this.genero + ", la zona en la que me ubico es "+ zona.getNombre() +", en el " + zona.getZoo();

        }
}