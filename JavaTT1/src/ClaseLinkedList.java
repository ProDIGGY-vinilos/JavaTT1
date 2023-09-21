import java.util.LinkedList;

public class ClaseLinkedList {

    LinkedList<String> lista = new LinkedList<>();

    public void agregarNombres() {
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Jose");
        lista.add("Jose");
        lista.add("Jose");
        lista.add("Maria");
        lista.add("Jose");
        lista.add("Juan");
        eliminar();
    }

    public void eliminar() {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    lista.remove(j);
                    j = j - 1;
                }
            }
        }
    }

    public void imprimirNombres() {
        for (String nombre : lista) {
            System.out.println(nombre);
        }
    }

}
