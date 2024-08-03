package gt.edu.miumg.pasteleria;

public class Masa implements Ingrediente{
    private String tipo;
    private int cantidad;

    public Masa(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String obtenerNombre() {
        return "Masa";
    }

    public int obtenerCantidad() {
        return cantidad;
    }
}
