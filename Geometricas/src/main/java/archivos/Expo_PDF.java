package archivos;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Expo_PDF {

    public static void exportarPanelComoPDF(JPanel panel) {
        // Crear el JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo como PDF");
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("PDF Document", "pdf"));

        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();

            // Asegurarse de que el archivo tenga la extensión .pdf
            if (!archivo.getAbsolutePath().endsWith(".pdf")) {
                archivo = new File(archivo.getAbsolutePath() + ".pdf");
            }

            try {
                // Crear un BufferedImage del JPanel
                int width = panel.getWidth();
                int height = panel.getHeight();
                BufferedImage imagen = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                Graphics2D g2d = imagen.createGraphics();
                panel.paint(g2d);
                g2d.dispose();

                // Guardar la imagen como PNG temporalmente
                File tempFile = new File("temp_image.png");
                ImageIO.write(imagen, "PNG", tempFile);

                // Crear el documento PDF con tamaño en orientación horizontal
                Document document = new Document(PageSize.A4.rotate());
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(archivo));
                document.open();

                // Ajustar el tamaño de la imagen para que se ajuste a la página
                Image pdfImage = Image.getInstance(tempFile.getAbsolutePath());
                pdfImage.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());

                // Centrar la imagen en la página
                float imageWidth = pdfImage.getScaledWidth();
                float imageHeight = pdfImage.getScaledHeight();
                pdfImage.setAbsolutePosition(
                    (PageSize.A4.getWidth() - imageWidth) / 2,
                    (PageSize.A4.getHeight() - imageHeight) / 2
                );
                
                document.add(pdfImage);

                // Cerrar el documento
                document.close();
                tempFile.delete(); // Eliminar el archivo temporal

                JOptionPane.showMessageDialog(null, "PDF exportado a " + archivo.getAbsolutePath());
            } catch (DocumentException | IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al exportar el PDF.");
            }
        }
    }
}
