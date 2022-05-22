package util;

import java.io.File;
import java.io.IOException;


public class LexiconClassGenerator {
    
    public static void main(String[] args) throws Exception {
        String caminoJFLEX= "src/properties/Lexico.flex";
        generarLex(caminoJFLEX);
    }
    
    public static void generarLex(String pathFlexFile) throws IOException, Exception {
        File arc; 
        arc = new File(pathFlexFile);
        JFlex.Main.generate(arc);
    }
}
