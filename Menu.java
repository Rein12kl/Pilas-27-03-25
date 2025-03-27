import java.util.Scanner;

public class Menu {
    public void menu() {
        boolean bandera = true;
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        while (bandera) {

            String Mensaje = "Bienvenidos a frater! \n"
                    + "Seleccione neustro menu \n"
                    + "1: Hamburgueza \n"
                    + "2 perro \n"
                    + "3 Salchipapas \\n"
                    + "4 Salir";

            while (!sc.hasNextInt()) {
                System.out.println("Ingrese valor numerico");
                sc.next();
            }
            opt = sc.nextInt();

            switch (opt) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("Pagina en mantenimiento");
                    break;
            }
        }
    }
}
