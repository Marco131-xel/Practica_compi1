package figuras;


public class Token {
    String nombre; // identificador
    int posx; // posicion x
    int posy; // posicion y
    int radio; // circulo
    int lado; // cuadrado
    int ancho; // rectangulo, poligono
    int alto; // recatangulo, poligono
    
    int cant_lados; // poligono
    int posx1; // linea
    int posx2; // linea 
    int posy1; // linea
    int posy2; // linea
    
    String color; // colores

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

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
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

    public int getCant_lados() {
        return cant_lados;
    }

    public void setCant_lados(int cant_lados) {
        this.cant_lados = cant_lados;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Token{" + "nombre=" + nombre + ", posx=" + posx + 
                ", posy=" + posy + ", radio=" + radio + ", lado=" + lado + 
                ", ancho=" + ancho + ", alto=" + alto + ", cant_lados=" + cant_lados + 
                ", posx1=" + posx1 + ", posx2=" + posx2 + ", posy1=" + posy1 +
                ", posy2=" + posy2 + ", color=" + color + '}';
    }
    
    
    
    
}
