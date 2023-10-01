package mundopc;

public class Monitor {
    private final int ID_MONITOR;
    private String marca;
    private double tamanio;

    private static int contadorMonitores;

    private Monitor() {
        this.ID_MONITOR = ++Monitor.contadorMonitores;
    }

    public Monitor( String marca, double tamanio ) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getID_MONITOR() {
        return ID_MONITOR;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "MONITOR: { idMonitor: " + this.getID_MONITOR() + " - marca: " + this.marca + " - tamaño: " + this.tamanio + " }";
    }

}
