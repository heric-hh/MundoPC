package mundopc;

public class Teclado extends DispositivoEntrada {
    private final int ID_TECLADO;
    private static int contadorTeclados;

    public Teclado( String tipoEntrada, String marca ) {
        super( tipoEntrada, marca );
        this.ID_TECLADO = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
