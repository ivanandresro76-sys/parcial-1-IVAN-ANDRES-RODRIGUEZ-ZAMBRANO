import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<obj> cola = new LinkedList<>();
        Queue<obj> turnos = new LinkedList<>();
        boolean condition = true;
        metodos m = new metodos();
        while (condition== true) {
            int opcion;
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. ver el siguiente cliente en espera");
            System.out.println("4. ver todos los clientes en espera");
            System.out.println("5. mostrar todos los turnos realizados");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    m.llenarcola(cola,turnos);
                    break;
                case 2:
                    m.atendercliente(cola);
                    break;
                case 3:
                    m.siguientecliente(cola);
                    break;
                case 4:
                    m.verclientes(cola);
                    break;
                case 5:
                    m.turnosrealizados(turnos);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
}
