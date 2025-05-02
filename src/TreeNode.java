import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public String valor; // nombre o tipo
    public Documento doc; // solo si es un documento, null si es carpeta
    public List<TreeNode> hijos;

    public TreeNode(String valor) {
        this.valor = valor;
        this.hijos = new ArrayList<>();
    }

    public void agregarHijo(TreeNode hijo) {
        hijos.add(hijo);
    }

    public TreeNode buscarHijoPorValor(String valor) {
        for (TreeNode hijo : hijos) {
            if (hijo.valor.equalsIgnoreCase(valor)) return hijo;
        }
        return null;
    }

    @Override
    public String toString() {
        return doc != null ? doc.toString() : valor;
    }
}
