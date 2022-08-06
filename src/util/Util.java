package util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Objects;

public class Util {

    private static String path = "src/dist/";
    private static String basePath = "src/scripts/";

    public static void createFile(String contentFile) {

        File file = new File(path.concat("Program.cpp"));
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw;
            fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contentFile);
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
    }

    public static void executeFile(String fileName) {
        try {
            String osName = System.getProperty("os.name");
            fileName = fileName.concat(((Objects.equals(osName, "Linux"))?".sh":".bat"));
            String[] command = {basePath.concat(fileName)};
            Runtime.getRuntime().exec(command);
            System.out.println("Ejecutando " + fileName);
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

}
