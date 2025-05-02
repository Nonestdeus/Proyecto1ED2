import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class VisorGUI extends JFrame {
    private ArbolDocumentos arbolDocumentos;

    public VisorGUI(ArbolDocumentos arbol) {
        super("Visor de Documentos");
        this.arbolDocumentos = arbol;

        DefaultMutableTreeNode raizGUI = construirNodoSwing(arbol.raiz);
        JTree tree = new JTree(raizGUI);

        tree.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    TreePath path = tree.getPathForLocation(e.getX(), e.getY());
                    if (path == null) return;

                    DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) path.getLastPathComponent();
                    Object userObj = nodo.getUserObject();
                    if (userObj instanceof TreeNode) {
                        TreeNode miNodo = (TreeNode) userObj;
                        if (miNodo.doc != null) {
                            abrirArchivo(miNodo.doc.rutaLocal);
                        }
                    }
                }
            }
        });

        JScrollPane scroll = new JScrollPane(tree);
        add(scroll);
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private DefaultMutableTreeNode construirNodoSwing(TreeNode nodo) {
        DefaultMutableTreeNode guiNodo = new DefaultMutableTreeNode(nodo);
        for (TreeNode hijo : nodo.hijos) {
            guiNodo.add(construirNodoSwing(hijo));
        }
        return guiNodo;
    }

    private void abrirArchivo(String ruta) {
        try {
            Desktop.getDesktop().open(new File(ruta));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "No se pudo abrir el archivo: " + ruta);
        }
    }
}
