package codigo;

import java.io.File;

public class Principal {
    public static void main(String[] args) {
        String ruta = "C:/Users/Alexander/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/Lexer.flex";
        generarLexer(ruta);
    }
    
    public static void generarLexer(String ruta) {
    File archivoLexer = new File("C:/Users/Alexander/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/Lexer.java");
    if (archivoLexer.exists()) {
        archivoLexer.delete();
    }

    File archivoFlex = new File(ruta);
    jflex.Main.generate(archivoFlex);
}
}
