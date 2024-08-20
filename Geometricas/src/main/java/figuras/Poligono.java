package figuras;

import java.awt.Color;
import java.awt.Polygon;

public class Poligono extends Polygon {

    Color color;
    String nombre;

    public Poligono(int[] ptx, int[] pty, int cant_lad, Color color, String nombre) {
        super(ptx, pty, cant_lad);
        this.color = color;
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
