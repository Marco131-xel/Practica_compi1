    package Analizadores;

public class Generador {
    public static void main(String[] args) {
        generar();
    }
    
    public static void generar(){
        try{
            String ruta = "src/main/java/Analizadores/";
            
            String Flex[] = {ruta + "lexico.jflex", "-d", ruta};
            jflex.Main.generate(Flex);
            
            System.out.println("##########################################################################");
            String Cup[] = { "-destdir", ruta, "-parser", "parser", ruta + "sintactico.cup" };
            java_cup.Main.main(Cup);
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
