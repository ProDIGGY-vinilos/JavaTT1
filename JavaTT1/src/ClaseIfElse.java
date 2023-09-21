import java.util.Scanner;

public class ClaseIfElse {
    public void ifElse() {
        System.out.println("Ingrese un numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

    }
}
