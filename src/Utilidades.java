import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Utilidades {

    public static void descargarArchivo(Documento doc, String carpeta) throws IOException {
        URL url = new URL(doc.url);
        String destino = carpeta + File.separator + doc.nombre + "." + doc.tipo;
        doc.rutaLocal = destino; // guardar ruta

        try (InputStream in = url.openStream()) {
            Files.copy(in, Path.of(destino), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("📥 Archivo descargado (sobrescrito): " + destino);
        }
    }

    public static void crearCarpetaSiNoExiste(String path) {
        File carpeta = new File(path);
        if (!carpeta.exists()) carpeta.mkdirs();
    }
}
