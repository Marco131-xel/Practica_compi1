package figuras;

public class Circulo {

    String nombre;
    int posx, posy, radio;
    String color;

    public Circulo(String nombre, int posx, int posy, int radio, String color) {
        this.nombre = nombre;
        this.posx = posx;
        this.posy = posy;
        this.radio = radio;
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

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
