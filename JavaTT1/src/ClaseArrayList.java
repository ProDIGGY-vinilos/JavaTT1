import java.util.ArrayList;

public class ClaseArrayList {
    ArrayList<String> lista = new ArrayList<String>();

    public void agregarNombres() {
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Maria");
        lista.add("Jose");
    }

    public void imprimirNombres() {
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }
}
