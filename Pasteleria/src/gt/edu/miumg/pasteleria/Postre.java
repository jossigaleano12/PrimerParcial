package gt.edu.miumg.pasteleria;

public abstract class Postre {
    private String nombre;
    private String tamaño;
    private double precio;

    public Postre(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

}
