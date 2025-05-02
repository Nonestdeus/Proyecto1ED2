public class ArbolDocumentos {
    public TreeNode raiz;

    public ArbolDocumentos(String nombreRaiz) {
        this.raiz = new TreeNode(nombreRaiz);
    }

    public void agregarDocumento(Documento doc) {
        // Paso 1: Buscar o crear carpeta según tipo
        TreeNode carpetaTipo = raiz.buscarHijoPorValor(doc.tipo);
        if (carpetaTipo == null) {
            carpetaTipo = new TreeNode(doc.tipo);
            raiz.agregarHijo(carpetaTipo);
        }

        // Paso 2: Agregar documento como hijo de la carpeta
        TreeNode nodoDoc = new TreeNode(doc.nombre + "." + doc.tipo);
        nodoDoc.doc = doc;
        carpetaTipo.agregarHijo(nodoDoc);
    }

    public void imprimir(TreeNode nodo, String prefijo) {
        System.out.println(prefijo + "- " + nodo);
        for (TreeNode hijo : nodo.hijos) {
            imprimir(hijo, prefijo + "  ");
        }
    }
}
