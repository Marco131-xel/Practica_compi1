package figuras;
import java.awt.Color;

public class Cuadrado {
    String nombre;
    int posx; 
    int posy; 
    int lado; 
    Color color;

    public Cuadrado(String nombre, int posx, int posy, int lado, Color color) {
        this.nombre = nombre;
        this.posx = posx;
        this.posy = posy;
        this.lado = lado;
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

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
