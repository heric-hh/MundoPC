package mundopc;

public class Orden {
    private final int ID_ORDEN;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int cantidadComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.ID_ORDEN = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[ Orden.MAX_COMPUTADORAS ];
    }

    public void agregarComputadora( Computadora computadora ) {
        if ( this.cantidadComputadoras < Orden.MAX_COMPUTADORAS ) {
            this.computadoras[ this.cantidadComputadoras++ ] = computadora;
        }
        else {
            System.out.println( "Se ha superado el limite de compras en la orden" );
        }
    }

    public void mostrarOrden() {
        System.out.println( "ID ORDEN: " + this.ID_ORDEN );
        System.out.println( "Productos de la orden: " );
        for ( int i = 0; i < this.cantidadComputadoras; i++ ) {
            System.out.println( this.computadoras[ i ] );
        }
    }
}
