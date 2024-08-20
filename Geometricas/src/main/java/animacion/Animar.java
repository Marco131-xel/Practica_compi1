package animacion;


public class Animar {
    String tipoanimacion;
    int destinox;
    int destinoy;
    int orden;

    public Animar(String tipoanimacion, int destinox, int destinoy, int orden) {
        this.tipoanimacion = tipoanimacion;
        this.destinox = destinox;
        this.destinoy = destinoy;
        this.orden = orden;
    }

    public String getTipoanimacion() {
        return tipoanimacion;
    }

    public void setTipoanimacion(String tipoanimacion) {
        this.tipoanimacion = tipoanimacion;
    }


    public int getDestinox() {
        return destinox;
    }

    public void setDestinox(int destinox) {
        this.destinox = destinox;
    }

    public int getDestinoy() {
        return destinoy;
    }

    public void setDestinoy(int destinoy) {
        this.destinoy = destinoy;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
}
