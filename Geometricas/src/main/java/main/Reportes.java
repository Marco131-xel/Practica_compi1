package main;

import figuras.*;
import Analizadores.*;
import java.awt.Color;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class Reportes extends javax.swing.JPanel {

    /**
     * Creates new form Reportes
     */
    public Reportes(Formas formas, parser parser) {
        this.formas = formas;
        this.parser = parser;
        initComponents();
        llenarTabla();
    }

    public Formas formas;
    public parser parser;

    public void llenarTabla() {
        tablaObjetos();
        tablaColores();
        tablaOcurrencias();
    }

    public void tablaObjetos() {
        DefaultTableModel model = (DefaultTableModel) TB_objeto.getModel();
        model.setRowCount(0);

        model.addRow(new Object[]{"Círculos", formas.getCirculos().size()});
        model.addRow(new Object[]{"Cuadrados", formas.getCuadrados().size()});
        model.addRow(new Object[]{"Líneas", formas.getLineas().size()});
        model.addRow(new Object[]{"Rectángulos", formas.getRectangulos().size()});
        model.addRow(new Object[]{"Polígonos", formas.getPoligonos().size()});
    }

    public void tablaColores() {
        DefaultTableModel model2 = (DefaultTableModel) TB_colores.getModel();
        model2.setRowCount(0);

        Map<String, Integer> colorCounts = new HashMap<>();

        // Colores de circulo
        for (Circulo circulo : formas.getCirculos()) {
            String colorName = obtenerColor(circulo.getColor());
            colorCounts.merge(colorName, 1, Integer::sum);
        }
        // Colores de cuadrados
        for (Cuadrado cuadrado : formas.getCuadrados()) {
            String colorName = obtenerColor(cuadrado.getColor());
            colorCounts.merge(colorName, 1, Integer::sum);
        }

        // Colores de lineas
        for (Linea linea : formas.getLineas()) {
            String colorName = obtenerColor(linea.getColor());
            colorCounts.merge(colorName, 1, Integer::sum);
        }

        // Colores de rectangulos
        for (Rectangulo rectangulo : formas.getRectangulos()) {
            String colorName = obtenerColor(rectangulo.getColor());
            colorCounts.merge(colorName, 1, Integer::sum);
        }

        // Colores de poligonos
        for (Poligono poligono : formas.getPoligonos()) {
            String colorName = obtenerColor(poligono.getColor());
            colorCounts.merge(colorName, 1, Integer::sum);
        }

        // Ordenar los colores por cantidad de uso de mayor a menor
        List<Map.Entry<String, Integer>> sortedColors = new ArrayList<>(colorCounts.entrySet());
        sortedColors.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Llenar la tabla 
        for (Map.Entry<String, Integer> entry : sortedColors) {
            model2.addRow(new Object[]{entry.getKey(), entry.getValue()});
        }
    }

    public void tablaOcurrencias() {
        DefaultTableModel model3 = (DefaultTableModel) TB_ocurrencias.getModel();
        model3.setRowCount(0);

        if (parser == null) {
            System.out.println("Parser es nulo. Verifica que se haya inicializado correctamente.");
            return;
        }

        List<Operacion> operaciones = parser.getOperacion();
        if (operaciones == null) {
            System.out.println("No se han registrado operaciones.");
            return;
        }

        // Contar cantidad de veces que se usa un operador
        Map<String, Integer> contaOperador = new HashMap<>();
        for (Operacion operacion : operaciones) {
            contaOperador.merge(operacion.getOperador(), 1, Integer::sum);
        }

        // Llenar tabla con los operadores
        for (Operacion operacion : operaciones) {
            String operador = operacion.getOperador();
            int linea = operacion.getLinea();
            int columna = operacion.getColumna();
            String ocurrencias = operacion.getExpresion();

            model3.addRow(new Object[]{operador, linea, columna, ocurrencias});
        }
        for (Operacion op : parser.getOperacion()) {
            System.out.println(op.getOperador() + " en línea " + op.getLinea() + ", columna " + op.getColumna());
        }

    }

    private String obtenerColor(Color color) {
        if (color.equals(Color.RED)) {
            return "rojo";
        }
        if (color.equals(Color.YELLOW)) {
            return "amarillo";
        }
        if (color.equals(Color.BLUE)) {
            return "azul";
        }
        if (color.equals(Color.GREEN)) {
            return "verde";
        }
        if (color.equals(Color.CYAN)) {
            return "celeste";
        }
        if (color.equals(Color.MAGENTA)) {
            return "rosado";
        }
        if (color.equals(Color.GRAY)) {
            return "gris";
        }
        if (color.equals(Color.ORANGE)) {
            return "naranja";
        }
        if (color.equals(Color.BLACK)) {
            return "negro";
        }
        if (color.equals(Color.WHITE)) {
            return "Blanco";
        }
        return "Desconocido";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_ocurrencias = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB_errores = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TB_colores = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TB_animacion = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        TB_objeto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        TB_ocurrencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Operador", "Linea", "Columna", "Ocurrencia"
            }
        ));
        jScrollPane1.setViewportView(TB_ocurrencias);

        TB_errores.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        TB_errores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Lexema", "Linea", "Columna", "Descripcion"
            }
        ));
        jScrollPane2.setViewportView(TB_errores);
        if (TB_errores.getColumnModel().getColumnCount() > 0) {
            TB_errores.getColumnModel().getColumn(0).setMinWidth(250);
            TB_errores.getColumnModel().getColumn(0).setPreferredWidth(250);
            TB_errores.getColumnModel().getColumn(0).setMaxWidth(250);
            TB_errores.getColumnModel().getColumn(1).setMinWidth(100);
            TB_errores.getColumnModel().getColumn(1).setPreferredWidth(100);
            TB_errores.getColumnModel().getColumn(1).setMaxWidth(100);
            TB_errores.getColumnModel().getColumn(2).setMinWidth(100);
            TB_errores.getColumnModel().getColumn(2).setPreferredWidth(100);
            TB_errores.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        TB_colores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Color", "Cantidad de uso"
            }
        ));
        jScrollPane3.setViewportView(TB_colores);

        TB_animacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Animacion", "Cantidad de uso"
            }
        ));
        jScrollPane4.setViewportView(TB_animacion);

        TB_objeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Objeto", "Cantidad de uso"
            }
        ));
        jScrollPane5.setViewportView(TB_objeto);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ocurrencias de Operadores Matematicos");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Colores");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Figura");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Animacion");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Errores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel3)
                        .addGap(297, 297, 297)
                        .addComponent(jLabel2)
                        .addGap(273, 273, 273)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel5)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB_animacion;
    private javax.swing.JTable TB_colores;
    private javax.swing.JTable TB_errores;
    private javax.swing.JTable TB_objeto;
    private javax.swing.JTable TB_ocurrencias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
