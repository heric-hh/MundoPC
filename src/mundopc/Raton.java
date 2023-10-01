package mundopc;

public class Raton extends DispositivoEntrada{
    private final int ID_RATON;
    private static int contadorRatones;

    public Raton( String tipoEntrada, String marca ) {
        super( tipoEntrada, marca );
        this.ID_RATON = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
