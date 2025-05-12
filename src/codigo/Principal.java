package codigo;

import java.io.File;

public class Principal {

    public static void main(String[] args) {
        String ruta = "src/codigo/Lexer.flex";
        generarLexer(ruta);
    }

    public static void generarLexer(String ruta) {
        File archivoLexer = new File("src/codigo/Lexer.java");
        if (archivoLexer.exists()) {
            archivoLexer.delete();
        }

        File archivoFlex = new File(ruta);
        jflex.Main.generate(archivoFlex);
    }
}
