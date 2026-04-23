import java.util.Scanner;
public class validaciones{
    public String validarservicio(Scanner sc){
        Scanner Sc = new Scanner(System.in);
        int option;
        String servicio="";
        boolean valid = true;
        while (valid== true) {
            System.out.println("Seleccione el servicio que desea:");
            System.out.println("1.Retiro");
            System.out.println("2.Deposito");
            System.out.println("3.Asesoramiento");
            option = Sc.nextInt();
            switch (option) {
                case 1:
                    servicio = "Retiro";
                    valid = false;
                    break;
                case 2:
                    servicio = "Deposito";
                    valid = false;
                    break;
                case 3:
                    servicio = "Asesoramiento";
                    valid = false;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
        return servicio;
    }
    public int validarhora(Scanner sc){
        Scanner Sc = new Scanner(System.in);
        int hora=0;
        boolean valid = true;
        while (valid==true) {
            System.out.println("Ingrese la hora de su turno (0-23):");
            hora = Sc.nextInt();
            if (hora >= 0 && hora <= 23) {
                valid = false;
            } else {
                System.out.println("Hora inválida. Por favor, ingrese una hora entre 0 y 23.");
            }
        }
        return hora;
    }
    public int validarminutos(Scanner sc){
        Scanner Sc = new Scanner(System.in);
        int minutos=0;
        boolean valid = true;
        while (valid==true) {
            System.out.println("Ingrese los minutos de su turno (0-59):");
            minutos = Sc.nextInt();
            if (minutos >= 0 && minutos <= 59) {
                valid = false;
            } else {
                System.out.println("Minutos inválidos. Por favor, ingrese un valor entre 0 y 59.");
            }
        }
        return minutos;
    }
}