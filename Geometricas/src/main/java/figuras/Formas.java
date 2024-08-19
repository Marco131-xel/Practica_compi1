package figuras;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Formas extends JPanel {

    private List<Circulo> circulos = new ArrayList<>();
    private List<Cuadrado> cuadrados = new ArrayList<>();
    private List<Linea> lineas = new ArrayList<>();
    private List<Rectangulo> rectangulos = new ArrayList<>();
    private List<Poligono> poligonos = new ArrayList<>();

    // METODO PARA CONVERTIR COLORES
    public Color obtenerColor(String color) {
        switch (color.toLowerCase()) {
            case "rojo":
                return Color.red;
            case "amarillo":
                return Color.yellow;
            case "azul":
                return Color.blue;
            case "verde":
                return Color.green;
            case "celeste":
                return Color.cyan;
            case "rosado":
                return Color.magenta;
            case "gris":
                return Color.gray;
            case "naranja":
                return Color.orange;
            case "negro":
                return Color.black;
            default:
                return Color.black;
        }
    }

    public void crearCirculo(Circulo circulo) {
        circulos.add(circulo);
        repaint();
    }

    public void crearCuadrado(Cuadrado cuadrado) {
        cuadrados.add(cuadrado);
        repaint();
    }

    public void crearLinea(Linea linea) {
        lineas.add(linea);
        repaint();
    }

    public void crearRectangulo(Rectangulo rectangulo) {
        rectangulos.add(rectangulo);
        repaint();
    }

    public void crearPoligono(String nombre, int posx, int posy, int ancho, int alto, int cant_lados, Color color) {
        int[] px = new int[cant_lados];
        int[] py = new int[cant_lados];

        for (int i = 0; i < cant_lados; i++) {
            px[i] = posx + (int) (ancho * Math.cos(2 * Math.PI * i / cant_lados));
            py[i] = posy + (int) (alto * Math.sin(2 * Math.PI * i / cant_lados));
        }

        Poligono poligono = new Poligono(px, py, cant_lados, color);
        poligonos.add(poligono);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Circulo circulo : circulos) {
            g.setColor(circulo.getColor());
            g.fillOval(circulo.getPosx(), circulo.getPosy(), circulo.getRadio(), circulo.getRadio());
        }
        for (Cuadrado cuadrado : cuadrados) {
            g.setColor(cuadrado.getColor());
            g.fillRect(cuadrado.getPosx(), cuadrado.posy, cuadrado.getLado(), cuadrado.getLado());
        }

        for (Linea linea : lineas) {
            g.setColor(linea.getColor());
            g.drawLine(linea.posx1, linea.posx2, linea.posy1, linea.posy2);
        }
        for (Rectangulo rectangulo : rectangulos) {
            g.setColor(rectangulo.getColor());
            g.fillRect(rectangulo.posx, rectangulo.posy, rectangulo.ancho, rectangulo.alto);
        }

        for (Poligono poligono : poligonos) {
            g.setColor(poligono.getColor());
            g.fillPolygon(poligono);
        }
    }
}
