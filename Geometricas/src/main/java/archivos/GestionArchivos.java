package archivos;
import java.io.*;

public class GestionArchivos {
    
    FileInputStream entrada;
    FileOutputStream salida;
    
    public GestionArchivos(){
    }
    
    // METODO PARA ABRIR LOS ARCHIVOS 
    public String AbrirTexto(File archivo){
        String contenido = "";
        try {
            entrada = new FileInputStream(archivo);
            int afk;
            while((afk = entrada.read()) != -1){
                char caracter = (char) afk;
                contenido += caracter;
            }
            System.out.println("Archivo leido correctamente: " + archivo.getName());
        } catch (Exception e) {
            
        }
        return contenido;
    }
    
    // METODO PARA GUARDAR EL ARCHIVO 
    public String GuardarTexto(File archivo, String contenido){
        String respuesta = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);
            respuesta = "Se Guardo con exito el archivo";
        } catch (Exception e){
        }
        return respuesta;
    }
    
}
