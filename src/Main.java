import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArbolDocumentos arbol = new ArbolDocumentos("Documentos");
        String carpetaDescargas = "descargas";
        //Utilidades.crearCarpetaSiNoExiste(carpetaDescargas);

        System.out.println("🔎 Obteniendo documentos desde la API...");
        List<Documento> documentos = ApiCliente.obtenerDocumentos();

        for (Documento doc : documentos) {
            try {
                Utilidades.descargarArchivo(doc, carpetaDescargas);
                //arbol.agregarDocumento(doc);
            } catch (Exception e) {
                System.out.println(" Error al descargar: " + doc.nombre);
            }
        }

        System.out.println("\n📂 Árbol de documentos:");
        arbol.imprimir(arbol.raiz, "");
        //new VisorGUI(arbol);

    }
}
