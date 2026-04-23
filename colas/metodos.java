import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class metodos {
    public Queue<obj> llenarcola(Queue<obj> cola,Queue<obj> turnos) {
        Scanner sc = new Scanner(System.in);
        String name;
        String servivio;
        String fecha;
        int id=1;
        boolean condition = true;
        boolean estado=false;
        validaciones v = new validaciones();
        while (condition==true) {
        System.out.println("Ingrese el nombre del cliente:");
        name = sc.nextLine();
        System.out.println("Ingrese el servicio que desea:");
        String servicio = v.validarservicio(sc);
        servivio = servicio;
        System.out.println("Ingrese la hora de su turno:");
        int hora = v.validarhora(sc);
        int minutos=v.validarminutos(sc);
        fecha = hora+":"+minutos;
        estado = false;
        obj p = new obj(name, servivio, fecha, estado, id);
        id++;
        cola.offer(p);
        System.out.println("¿Desea agregar otro cliente? 1: SI, 2: NO");
        int choice = sc.nextInt();
        sc.nextLine(); 
        if (choice == 2) {
            condition = false;
        }
        }
        turnos.addAll(cola);
        return cola;
    }
    public Queue<obj> atendercliente(Queue<obj> cola) {
        if (!cola.isEmpty()) {
            obj p = cola.poll();
            p.setEstado(true);
            System.out.println("Atendiendo al cliente: " + p.getName());
        } else {
            System.out.println("No hay clientes en espera.");
        }
        return cola;
    }
    public Queue<obj> siguientecliente(Queue<obj> cola) {
        if (!cola.isEmpty()) {
            obj p = cola.peek();
            System.out.println("El siguiente cliente en espera es: " + p.getName());
        } else {
            System.out.println("No hay clientes en espera.");
        }
        return cola;
    }
    public Queue<obj> verclientes(Queue<obj> cola) {
        if (!cola.isEmpty()) {
            System.out.println("Clientes en espera:");
            for (obj p : cola) {
                System.out.println("Nombre: " + p.getName() + ", Servicio: " + p.getServivio() + ", Hora: " + p.getFecha());
            }
        } else {
            System.out.println("No hay clientes en espera.");
        }
        return cola;
    }
    public Queue<obj> turnosrealizados(Queue<obj> turnos) {
        if (!turnos.isEmpty()) {
            System.out.println("Turnos realizados:");
            for (obj p : turnos) {
                    System.out.println("Nombre: " + p.getName() + ", Servicio: " + p.getServivio() + ", Hora: " + p.getFecha());
                }
            }else {
            System.out.println("No hay clientes en espera.");
        }
        return turnos;
    }
}
