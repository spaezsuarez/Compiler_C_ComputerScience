package util;

import java.io.File;
import java.io.IOException;

public class LexiconClassGenerator {

    private static String basePath = "src/properties";

    public static void main(String[] args) throws Exception {
        String pathFirstAnalizer = String.format("%s/Lexico.flex", basePath);
        String secondFirstAnalizer = String.format("%s/LexicoCup.flex", basePath);
        String[] caminoS = {"-parser", "Sintaxis", String.format("%s/Sintaxis.cup", basePath)};
        generateCode(pathFirstAnalizer, secondFirstAnalizer, caminoS);
    }

    public static void generateCode(String camino, String camino1, String[] caminoS) throws IOException, Exception {
        java_cup.Main.main(caminoS);
        File arc;
        arc = new File(camino);
        JFlex.Main.generate(arc);
        arc = new File(camino1);
        JFlex.Main.generate(arc);
    }
}
