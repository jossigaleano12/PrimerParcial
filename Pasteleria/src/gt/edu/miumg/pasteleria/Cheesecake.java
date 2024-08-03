package gt.edu.miumg.pasteleria;

public class Cheesecake extends Postre{
    private String tipoQueso;

    public Cheesecake(String nombre, String tamaño, double precio, String tipoQueso) {
        super(nombre, tamaño, precio);
        this.tipoQueso = tipoQueso;
    }
}
