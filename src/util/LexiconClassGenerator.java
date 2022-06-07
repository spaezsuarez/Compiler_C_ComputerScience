package util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LexiconClassGenerator {

    private static String basePath = "src/properties";

    public static void main(String[] args) throws Exception {
        String pathFirstAnalizer = String.format("%s/Lexico.flex", basePath);
        String secondFirstAnalizer = String.format("%s/LexicoCup.flex", basePath);
        String[] caminoS = {"-parser", "Sintaxis", String.format("%s/Sintaxis.cup", basePath)};
        generateCode(pathFirstAnalizer, secondFirstAnalizer, caminoS);
    }

    public static void generateCode(String camino, String camino1, String[] caminoS) throws IOException, Exception {
        File arc;
        arc = new File(camino);
        JFlex.Main.generate(arc);
        arc = new File(camino1);
        JFlex.Main.generate(arc);
        java_cup.Main.main(caminoS);
        
        Path caminoSym = Paths.get("src/properties/sym.java");
        if (Files.exists(caminoSym)) {
            Files.delete(caminoSym);
        }
        Files.move(
                Paths.get("sym.java"), 
                Paths.get("src/properties/sym.java")
        );
        Path caminoSint = Paths.get("src/properties/Sintaxis.java");
        if (Files.exists(caminoSint)) {
            Files.delete(caminoSint);
        }
        Files.move(
                Paths.get("Sintaxis.java"), 
                Paths.get("src/properties/Sintaxis.java")
        );
    }
}
