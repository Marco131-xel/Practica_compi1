package figuras;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public  class Formas extends JPanel {

    private List<Circulo> circulos = new ArrayList<>();

    public void crearCirculo(Circulo circulo) {
        circulos.add(circulo);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Circulo circulo : circulos) {
            //g.setColor(circulo.getColor());
            g.fillOval(circulo.getPosx(), circulo.getPosy(), circulo.getRadio(), circulo.getRadio());
        }
    }
}
