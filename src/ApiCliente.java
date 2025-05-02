import java.util.ArrayList;
import java.util.List;

public class ApiCliente {
    public static List<Documento> obtenerDocumentos() {
        List<Documento> docs = new ArrayList<>();
        docs.add(new Documento("PlanillaUTP", "xlsx", "https://utp.ac.pa/sites/default/files/transparencia-de-salarios-marzo-2025.xlsx"));
        docs.add(new Documento("PlanillaUTP", "pdf", "https://utp.ac.pa/sites/default/files/transparencia-de-salarios-marzo-2025.pdf"));
        docs.add(new Documento("PlanillaUTP", "csv", "https://utp.ac.pa/sites/default/files/transparencia-de-salarios-marzo-2025.csv"));
        return docs;
    }
}
