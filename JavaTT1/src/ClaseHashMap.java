import java.util.HashMap;
import java.util.Scanner;

public class ClaseHashMap {
    HashMap<String, Float> mapa = new HashMap<>();

    public void agregarStock() {
        mapa.put("Papas", 10.0f);
        mapa.put("Tomates", 20.0f);
        mapa.put("Cebollas", 30.0f);
        mapa.put("Zanahorias", 40.0f);
        mapa.put("Papas", 50.0f);
        mapa.put("Tomates", 60.0f);
        mapa.put("Cebollas", 70.0f);
        mapa.put("Zanahorias", 80.0f);
    }

    public void buscarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el producto a buscar: ");
        String producto = sc.nextLine();
        sc.close();
        if (mapa.containsKey(producto)) {
            System.out.println("El producto " + producto + " tiene un stock de " + mapa.get(producto));
        } else {
            System.out.println("El producto " + producto + " no existe");
        }
    }
}
