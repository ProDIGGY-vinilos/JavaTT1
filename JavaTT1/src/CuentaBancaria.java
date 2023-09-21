
public class CuentaBancaria {
    private String nombre;
    private String apellido;
    private int dni;
    private float saldo;

    public CuentaBancaria() {

    }

    public CuentaBancaria(String nombre, String apellido, int dni, float saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float monto) {
        this.saldo += monto;
    }

    public void extraer(float monto) {
        this.saldo -= monto;
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("DNI: " + this.dni);
        System.out.println("Saldo: " + this.saldo);
    }
}
