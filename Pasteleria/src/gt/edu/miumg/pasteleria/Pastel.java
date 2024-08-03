package gt.edu.miumg.pasteleria;

public class Pastel extends Postre {
    private String sabor;

    public Pastel(String nombre, String tamaño, double precio, String sabor) {
        super(nombre, tamaño, precio);
        this.sabor = sabor;
    }
}
