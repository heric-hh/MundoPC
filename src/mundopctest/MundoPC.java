package mundopctest;

import mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHp = new Monitor("HP", 13);
        Teclado tecladoHp = new Teclado("Bluetooth", "HP");
        Raton ratonHp = new Raton("Bluetooth", "HP");

        Computadora computadoraHp = new Computadora("Computadora HP", monitorHp, tecladoHp, ratonHp);

        Monitor monitorMSI = new Monitor("MSI", 34);
        Teclado tecladoMSI = new Teclado("Bluetooth", "MSI");
        Raton ratonMSI = new Raton("Bluetooth", "MSI");

        Computadora computadoraMSI = new Computadora("Computadora MSI", monitorMSI, tecladoMSI, ratonMSI);

        Orden orden1 = new Orden();
        orden1.agregarComputadora( computadoraHp );
        orden1.agregarComputadora( computadoraMSI );
        orden1.mostrarOrden();

    }
}
