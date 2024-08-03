package gt.edu.miumg.pasteleria;

public class Coberturas implements Ingrediente{
    private String tipo;
    private int cantidad;

    public Coberturas(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Coberturas";
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
