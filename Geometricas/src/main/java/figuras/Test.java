package figuras;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test extends JPanel {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Formas Básicas");
        //Circulo circulo = new Circulo("C2", 300, 400, 75, "rojo");
        Formas objeto = new Formas();

        // Agregar los círculos según la entrada procesada
        //objeto.crearCirculo(circulo);
//        objeto.crearCirculo("C2", 300, 400, 75, "rojo");

        ventana.add(objeto);
        ventana.setSize(700, 700);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
