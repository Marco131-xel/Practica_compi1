package figuras;
import java.awt.Color;
import java.awt.Polygon;

public class Poligono extends Polygon {
    Color color;
    
    public Poligono(int[] ptx, int [] pty, int cant_lad, Color color){
        super(ptx, pty, cant_lad);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
