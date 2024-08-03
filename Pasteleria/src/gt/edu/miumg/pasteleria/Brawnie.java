package gt.edu.miumg.pasteleria;

public class Brawnie extends Postre{
    private String tipoChocolate;

    public Brawnie(String nombre, String tamaño, double precio, String tipoChocolate) {
        super(nombre, tamaño, precio);
        this.tipoChocolate = tipoChocolate;
    }
}
