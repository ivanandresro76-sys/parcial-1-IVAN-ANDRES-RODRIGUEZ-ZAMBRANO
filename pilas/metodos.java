import java.util.Scanner;
import java.util.Stack;

public class metodos {
    public Stack<obj> llenarpila(Stack<obj> Pila, Stack<obj> historial) {
        String titulo = "";
        boolean salir = true;
        validaciones v = new validaciones();
        Scanner sc = new Scanner(System.in);
        while (salir) {
            System.out.println("Ingrese la url");
            String url= v.validarUrl(sc);
            System.out.println("Ingrese el titulo");
            titulo=sc.nextLine();
            System.out.println("Ingrese la fecha de acceso");
            String fechaAceso= v.validarfecha(sc);
            obj p = new obj(url, titulo, fechaAceso);
            Pila.push(p);
            historial.push(p);
            System.out.println("Desea visitar otra pagina? 1: si, 2: no");
            int opcion = sc.nextInt();
            if (opcion == 2) {
                salir = false;
            }
        }
        return Pila;
    }

    public Stack<obj> eliminar(Stack<obj> Pila, Stack<obj> historial) {
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        int opcion;
        while (salir==true) {
        if (!Pila.isEmpty()) {
            Pila.pop();
            System.out.println("la pagina actual es: " + Pila.peek().getUrl()+" "+Pila.peek().getTitulo()+" "+Pila.peek().getFechaAceso());
            System.out.println("Desea retroceder otra pagina? 1: si, 2: no");
            opcion = sc.nextInt();
            if (opcion == 2) {
                salir = false;
            }
        } else {
            System.out.println("La pila esta vacia");
                salir = false;
        }
    }
        return Pila;
    }

    public Stack<obj> mostrar(Stack<obj> Pila, Stack<obj> historial) {
        if (!historial.isEmpty()) {
            for (obj p : historial) {
                System.out.println("las paginas vicitadas son: " + p.getUrl());
                System.out.println("el titulo de la pagina es :"+p.getTitulo());
                System.out.println("la fecha de acceso es :"+p.getFechaAceso());
            }
        } else {
            System.out.println("La pila esta vacia");
        }
        return historial;
    }
}
