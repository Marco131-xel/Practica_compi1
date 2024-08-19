package main;

import Analizadores.*;
import archivos.*;
import figuras.Formas;
import java.awt.BorderLayout;
import java.io.File;
import java.io.Reader;
import java.io.StringReader;
import javax.swing.*;

public class Interfaz extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    GestionArchivos gestion = new GestionArchivos();

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
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
        BT_abrir = new javax.swing.JButton();
        BT_guardar = new javax.swing.JButton();
        BT_reportes = new javax.swing.JButton();
        BT_compilar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_editor = new javax.swing.JTextPane();
        VENTANA = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BT_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        BT_abrir.setText("Abrir");
        BT_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_abrirActionPerformed(evt);
            }
        });

        BT_guardar.setText("Guardar");

        BT_reportes.setText("Reportes");
        BT_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_reportesActionPerformed(evt);
            }
        });

        BT_compilar.setText("Compilar");
        BT_compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_compilarActionPerformed(evt);
            }
        });

        text_editor.setBackground(new java.awt.Color(51, 51, 51));
        text_editor.setFont(new java.awt.Font("FiraCode Nerd Font", 0, 18)); // NOI18N
        text_editor.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(text_editor);

        VENTANA.setPreferredSize(new java.awt.Dimension(1000, 410));

        javax.swing.GroupLayout VENTANALayout = new javax.swing.GroupLayout(VENTANA);
        VENTANA.setLayout(VENTANALayout);
        VENTANALayout.setHorizontalGroup(
            VENTANALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        VENTANALayout.setVerticalGroup(
            VENTANALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("FiraCode Nerd Font Med", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Figuras");

        jLabel2.setFont(new java.awt.Font("FiraCode Nerd Font Med", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Entrada");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1000");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("500");

        BT_limpiar.setText("Limpiar");
        BT_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VENTANA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BT_compilar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BT_reportes)
                        .addComponent(BT_guardar)
                        .addComponent(BT_abrir))
                    .addComponent(BT_limpiar))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(VENTANA, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BT_abrir)
                        .addGap(45, 45, 45)
                        .addComponent(BT_guardar)
                        .addGap(37, 37, 37)
                        .addComponent(BT_reportes)
                        .addGap(45, 45, 45)
                        .addComponent(BT_compilar)
                        .addGap(47, 47, 47)
                        .addComponent(BT_limpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_abrirActionPerformed
        // TODO add your handling code here:
        if (seleccionado.showDialog(null, "Abrir Archivo") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead()) {
                if (archivo.getName().endsWith("txt")) {
                    String contenido = gestion.AbrirTexto(archivo);
                    text_editor.setText(contenido);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo.txt");
                }
            }
        }
    }//GEN-LAST:event_BT_abrirActionPerformed

    private void BT_compilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_compilarActionPerformed
        // TODO add your handling code here:
        try {
            String codigo = text_editor.getText();
            if (codigo.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay código para analizar.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Reader reader = new StringReader(codigo);
            scanner lexer = new scanner(reader);
            Formas panel = new Formas();
            parser parser = new parser(lexer,panel);
            parser.parse();
            
            VENTANA.removeAll();
            VENTANA.setLayout(new BorderLayout());
            VENTANA.add(panel, BorderLayout.CENTER);    
            VENTANA.revalidate();
            VENTANA.repaint();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en el analisis");
        }
    }//GEN-LAST:event_BT_compilarActionPerformed

    private void BT_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_limpiarActionPerformed
        // TODO add your handling code here:
        // LIMPIAR JTEXTAREA
        text_editor.setText("");
        // LIMPIAR EL JPANEL
        VENTANA.removeAll();
        VENTANA.repaint();
    }//GEN-LAST:event_BT_limpiarActionPerformed

    private void BT_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_reportesActionPerformed
        // TODO add your handling code here:
        JFrame panel = new JFrame("Reportes");
        Reportes reporte = new Reportes();
        panel.add(reporte);
        panel.setSize(1098,899);
        panel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panel.setVisible(true);
        
    }//GEN-LAST:event_BT_reportesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_abrir;
    private javax.swing.JButton BT_compilar;
    private javax.swing.JButton BT_guardar;
    private javax.swing.JButton BT_limpiar;
    private javax.swing.JButton BT_reportes;
    private javax.swing.JPanel VENTANA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane text_editor;
    // End of variables declaration//GEN-END:variables
}
