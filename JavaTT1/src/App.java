
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int[] nroFactura = new int[3];
        int opc;
        int[] totProd = new int[3];
        for (int i = 0; i < 3; i++) {
            nroFactura[i] = i;
            JOptionPane.showMessageDialog(null, "Factura Nro: " + nroFactura[i]);
            opc = 1;
            while (opc != 0) {
                totProd[i] = totProd[i]
                        + Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto: "));
                opc = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar otro producto? 1-Si 0-No"));
            }
        }
        for (int i = 0; i < 3; i++) {
            JOptionPane.showMessageDialog(null, "Factura Nro: " + nroFactura[i] + " Total: " + totProd[i]);
        }
    }
}
