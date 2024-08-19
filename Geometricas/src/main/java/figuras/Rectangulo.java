package figuras;
import java.awt.Color;

public class Rectangulo {
    String nombre;
    int posx;
    int posy;
    int ancho;
    int alto;
    Color color;

    public Rectangulo(String nombre, int posx, int posy, int ancho, int alto, Color color) {
        this.nombre = nombre;
        this.posx = posx;
        this.posy = posy;
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
