import java.util.Scanner;
public class validaciones {
    public String validarUrl(Scanner sc) {
        String url = sc.nextLine();
        String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]+[-a-zA-Z0-9+&@#/%=~_|]";
        boolean salir = true;
        while (salir == true) {
            if (url.matches(regex)) {
                salir = false;
            } else {
                System.out.println("URL invalida. Ingrese una URL valida.");
                url = sc.nextLine();
            }
        }
        return url;
    }

    public String validarfecha(Scanner sc) {
        int año, mes, dia;
        String fecha="";
        boolean salir = true;
            while (salir==true) {
            System.out.println("Ingrese el dia");
            dia = sc.nextInt();
            System.out.println("Ingrese el mes");
            mes = sc.nextInt();
            System.out.println("Ingrese el año");
            año = sc.nextInt();
            if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && año > 0) {
                fecha = dia + "/" + mes + "/" + año;
                salir = false;
            } else {
                System.out.println("Fecha invalida. Ingrese una fecha valida.");
            }
        }
        return fecha;
    }   
}
