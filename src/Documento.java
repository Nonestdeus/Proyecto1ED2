public class Documento {
    public String nombre;
    public String tipo;
    public String url;
    public String rutaLocal; // nueva

    public Documento(String nombre, String tipo, String url) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.url = url;
    }

    @Override
    public String toString() {
        return nombre + "." + tipo;
    }
}
