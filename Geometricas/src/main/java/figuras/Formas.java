package figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

public class Formas extends JPanel {

    private List<Circulo> circulos = new ArrayList<>();
    private List<Cuadrado> cuadrados = new ArrayList<>();
    private List<Linea> lineas = new ArrayList<>();
    private List<Rectangulo> rectangulos = new ArrayList<>();
    private List<Poligono> poligonos = new ArrayList<>();

    private double zoomLevel = 1.0;
    private Point lastPoint = null;
    private Point viewOffset = new Point(0, 0);

    public Formas() {
        // Configurar el panel para manejar eventos del mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                lastPoint = e.getPoint(); // Guardar la posición inicial del mouse
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (lastPoint != null) {
                    // Calcular el desplazamiento
                    Point currentPoint = e.getPoint();
                    int dx = currentPoint.x - lastPoint.x;
                    int dy = currentPoint.y - lastPoint.y;
                    viewOffset.translate(dx, dy); // Actualizar el desplazamiento
                    lastPoint = currentPoint; // Actualizar la última posición del mouse
                    repaint(); // Redibujar el panel
                }
            }
        });
    }

    public void setZoomLevel(double zoomLevel) {
        this.zoomLevel = zoomLevel;
        repaint();
    }

    public double getZoomLevel() {
        return zoomLevel;
    }

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
        Graphics2D g2d = (Graphics2D) g;

        // Aplicar el zoom
        g2d.scale(zoomLevel, zoomLevel);
        // Aplicar el desplazamiento
        g2d.translate(viewOffset.x, viewOffset.y);

        for (Circulo circulo : circulos) {
            g2d.setColor(circulo.getColor());
            g2d.fillOval(circulo.getPosx(), circulo.getPosy(), circulo.getRadio(), circulo.getRadio());
            // Dibujar el nombre encima del círculo
            g2d.setColor(Color.BLACK);
            FontMetrics fm = g2d.getFontMetrics();
            int textX = circulo.getPosx() + (circulo.getRadio() - fm.stringWidth(circulo.getNombre())) / 2;
            int textY = circulo.getPosy() - fm.getHeight() / 2;
            g2d.drawString(circulo.getNombre(), textX, textY);
        }
        for (Cuadrado cuadrado : cuadrados) {
            g2d.setColor(cuadrado.getColor());
            g2d.fillRect(cuadrado.getPosx(), cuadrado.getPosy(), cuadrado.getLado(), cuadrado.getLado());
            // Dibujar el nombre encima del cuadrado
            g2d.setColor(Color.BLACK);
            FontMetrics fm = g2d.getFontMetrics();
            int textX = cuadrado.getPosx() + (cuadrado.getLado() - fm.stringWidth(cuadrado.getNombre())) / 2;
            int textY = cuadrado.getPosy() - fm.getHeight() / 2;
            g2d.drawString(cuadrado.getNombre(), textX, textY);
        }
        for (Linea linea : lineas) {
            g2d.setColor(linea.getColor());
            g2d.drawLine(linea.getPosx1(), linea.getPosy1(), linea.getPosx2(), linea.getPosy2());
            // Dibujar el nombre cerca de la línea
            g2d.setColor(Color.BLACK);
            FontMetrics fm = g2d.getFontMetrics();
            int textX = (linea.getPosx1() + linea.getPosx2()) / 2 - fm.stringWidth(linea.getNombre()) / 2;
            int textY = (linea.getPosy1() + linea.getPosy2()) / 2 - fm.getHeight() / 2;
            g2d.drawString(linea.getNombre(), textX, textY);
        }
        for (Rectangulo rectangulo : rectangulos) {
            g2d.setColor(rectangulo.getColor());
            g2d.fillRect(rectangulo.getPosx(), rectangulo.getPosy(), rectangulo.getAncho(), rectangulo.getAlto());
            // Dibujar el nombre encima del rectángulo
            g2d.setColor(Color.BLACK);
            FontMetrics fm = g2d.getFontMetrics();
            int textX = rectangulo.getPosx() + (rectangulo.getAncho() - fm.stringWidth(rectangulo.getNombre())) / 2;
            int textY = rectangulo.getPosy() - fm.getHeight() / 2;
            g2d.drawString(rectangulo.getNombre(), textX, textY);
        }
        for (Poligono poligono : poligonos) {
            g2d.setColor(poligono.getColor());
            g2d.fillPolygon(poligono);
            // Dibujar el nombre en el centro del polígono
            g2d.setColor(Color.BLACK);
            FontMetrics fm = g2d.getFontMetrics();
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
            g2d.drawString(poligono.getNombre(), textX, textY);
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
