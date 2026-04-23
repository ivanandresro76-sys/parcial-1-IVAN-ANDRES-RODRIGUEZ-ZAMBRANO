import java.util.Scanner;
import java.util.Stack;
public class Menu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        metodos m = new metodos();
        Stack<obj> Pila = new Stack<>();
        Stack<obj> historial = new Stack<>();
        boolean salir=true;
        while (salir==true) {
            int opcion;
            System.out.println("1. visitar pagina");
            System.out.println("2. retroceder pagina");
            System.out.println("3. mostrar historial de paginas");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    m.llenarpila(Pila, historial);
                    break;
                case 2:
                    m.eliminar(Pila, historial);
                    break;
                case 3:
                    m.mostrar(Pila, historial);
                    break;
                case 4:
                    salir=false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
