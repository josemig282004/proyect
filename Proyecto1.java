/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.nio.file.Paths;

/**
 *
 * @author USUARIO
 */
public class Proyecto1 {
    public static void main(String[] args) {
       if (args.length !=2) {
            System.out.println("Uso: java -jar proyecto1.jar <ruta_archivo> <ruta_carpeta>");
            return;
        }

        String rutaArchivo = args[0];
        String rutaCarpeta = args[1];

        try {
            // Leer contenido del archivo
            String contenido = new String(Files.readAllBytes(Paths.get (rutaArchivo)));
            
            // Convertir a mayúsculas
            String contenidoMayusculas = contenido.toUpperCase();
            
            // Crear ruta de destino
            Path rutaDestino = Paths.get(rutaCarpeta, "archivo_convertido.txt");
            
            // Escribir contenido en la nueva ruta
            Files.write(rutaDestino, contenidoMayusculas.getBytes());
            
            System.out.println("Archivo procesado y guardado en: " + rutaDestino);
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }
}
       
          