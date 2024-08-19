package figuras;
import java.awt.Color;

public class Linea {
    
    String nombre;
    int posx1, posx2;
    int posy1, posy2;
    Color color;

    public Linea(String nombre, int posx1, int posx2, int posy1, int posy2, Color color) {
        this.nombre = nombre;
        this.posx1 = posx1;
        this.posx2 = posx2;
        this.posy1 = posy1;
        this.posy2 = posy2;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosx1() {
        return posx1;
    }

    public void setPosx1(int posx1) {
        this.posx1 = posx1;
    }

    public int getPosx2() {
        return posx2;
    }

    public void setPosx2(int posx2) {
        this.posx2 = posx2;
    }

    public int getPosy1() {
        return posy1;
    }

    public void setPosy1(int posy1) {
        this.posy1 = posy1;
    }

    public int getPosy2() {
        return posy2;
    }

    public void setPosy2(int posy2) {
        this.posy2 = posy2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
