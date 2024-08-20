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

        Poligono poligono = new Poligono(px, py, cant_lados, color, nombre);
        poligonos.add(poligono);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Circulo circulo : circulos) {
            g.setColor(circulo.getColor());
            g.fillOval(circulo.getPosx(), circulo.getPosy(), circulo.getRadio(), circulo.getRadio());
            // Dibujar el nombre encima del círculo
            g.setColor(Color.BLACK); // El color del texto
            FontMetrics fm = g.getFontMetrics();
            int textX = circulo.getPosx() + (circulo.getRadio() - fm.stringWidth(circulo.getNombre())) / 2;
            int textY = circulo.getPosy() - fm.getHeight() / 2;
            g.drawString(circulo.getNombre(), textX, textY);
        }
        for (Cuadrado cuadrado : cuadrados) {
            g.setColor(cuadrado.getColor());
            g.fillRect(cuadrado.getPosx(), cuadrado.posy, cuadrado.getLado(), cuadrado.getLado());
            // Dibujar el nombre encima del cuadrado
            g.setColor(Color.BLACK); // El color del texto
            FontMetrics fm = g.getFontMetrics();
            int textX = cuadrado.getPosx() + (cuadrado.getLado() - fm.stringWidth(cuadrado.getNombre())) / 2;
            int textY = cuadrado.getPosy() - fm.getHeight() / 2;
            g.drawString(cuadrado.getNombre(), textX, textY);
        }

        for (Linea linea : lineas) {
            g.setColor(linea.getColor());
            g.drawLine(linea.posx1, linea.posx2, linea.posy1, linea.posy2);
            // Dibujar el nombre cerca de la línea (en el medio)
            g.setColor(Color.BLACK); // El color del texto
            FontMetrics fm = g.getFontMetrics();
            int textX = (linea.getPosx1() + linea.getPosx2()) / 2 - fm.stringWidth(linea.getNombre()) / 2;
            int textY = (linea.getPosy1() + linea.getPosy2()) / 2 - fm.getHeight() / 2;
            g.drawString(linea.getNombre(), textX, textY);
        }
        for (Rectangulo rectangulo : rectangulos) {
            g.setColor(rectangulo.getColor());
            g.fillRect(rectangulo.posx, rectangulo.posy, rectangulo.ancho, rectangulo.alto);

            // Dibujar el nombre encima del rectángulo
            g.setColor(Color.BLACK); // El color del texto
            FontMetrics fm = g.getFontMetrics();
            int textX = rectangulo.getPosx() + (rectangulo.getAncho() - fm.stringWidth(rectangulo.getNombre())) / 2;
            int textY = rectangulo.getPosy() - fm.getHeight() / 2;
            g.drawString(rectangulo.getNombre(), textX, textY);
        }

        for (Poligono poligono : poligonos) {
            g.setColor(poligono.getColor());
            g.fillPolygon(poligono);
            // Dibujar el nombre en el centro del polígono
            g.setColor(Color.BLACK);
            FontMetrics fm = g.getFontMetrics();
            int centroidX = 0;
            int centroidY = 0;
            for (int i = 0; i < poligono.npoints; i++) {
                centroidX += poligono.xpoints[i];
                centroidY += poligono.ypoints[i];
            }
            centroidX /= poligono.npoints;
            centroidY /= poligono.npoints;

            int textX = centroidX - fm.stringWidth(poligono.getNombre()) / 2;
            int textY = centroidY + fm.getHeight() / 2;
            g.drawString(poligono.getNombre(), textX, textY);
        }
    }

    public List<Circulo> getCirculos() {
        return circulos;
    }

    public List<Cuadrado> getCuadrados() {
        return cuadrados;
    }

    public List<Linea> getLineas() {
        return lineas;
    }

    public List<Rectangulo> getRectangulos() {
        return rectangulos;
    }

    public List<Poligono> getPoligonos() {
        return poligonos;
    }
}
