
package estudiante;


import java.io.*;
import java.util.*;

public class Estudiante {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Uso: java estudiante <ruta>");
            return;
        }

        String ruta = args[0];
        File archivo = new File(ruta);

        if (!archivo.exists()) {
            System.out.println("El archivo no existe.");
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            TreeSet<Estudiante> estudiantes = (TreeSet<Estudiante>) ois.readObject();
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }
}
