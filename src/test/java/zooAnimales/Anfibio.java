package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {

    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {
        listado.add(this);
    }


    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);

        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);

    }

    public String movimiento() {

        return "saltar";
    }

    public  static int cantidadAnfibios() {

        return listado.size();
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {

        Anfibio rana = new Anfibio(nombre, edad , "selva", genero, "rojo" , true);

        ranas++;

        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {

        Anfibio salamandra = new Anfibio(nombre, edad , "selva", genero, "negro" , false);

        salamandras++;

        return salamandra;
    }


    public ArrayList<Anfibio> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }



}