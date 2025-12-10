/*nica*/
import java.util.Scanner;

public class programa {
    static Scanner teclado = new Scanner(System.in);
    static Envio[] envios = new Envio[50];
    static Integer iEnvios = 0;

    public static void main(String[] args) {

        System.out.println("version 2");

        Boolean repetirMenu = true;
        do {

            String opcion = verMenu(); // 

            switch (opcion) {
                case "1":
                    registrarEnvio();
                    break;
                case "2":
                    verInforme();
                    break;
                case "X":
                case "x":
                    repetirMenu = false;
                    break;
                default:
                    System.out.println("Opción desconocida");
            }

        } while (repetirMenu);

        teclado.close();
        System.out.println("Fin del programa. Espero verte pronto.");
    }

    public static void verInforme() {
		Float suma = 0f;
		
        System.out.println("\tInforme de Envios");
        for (int i = 0; i < iEnvios; i++) {
			 System.out.println("\tTotal" + (i + 1 ) + "."   + envios[i].verComoString());
			suma += envios[i].precio;
           // System.out.println("\tTotal" + suma   + envios[i].numero + + envios[i].precio + "€");
			
			
        }
    }

    public static String verMenu() {
        System.out.println("Aplicacion de Pakoteria");
        System.out.println("1.Registrar envio ");
        System.out.println("2.Ver informe de envio ");
        System.out.println("X.Salir ");
        System.out.print("Opcion: ");
        return teclado.nextLine();
    }

    public static void registrarEnvio() {
        while (true) {
            try {
                System.out.println("\nRegistro de envio");
                System.out.print("\tNumero: ");
                String numero = teclado.nextLine();
                if (numero.isEmpty())
                    break;

                System.out.print("\tPrecio: ");
                Float precio = Float.valueOf(teclado.nextLine());

                Envio envio = new Envio(numero,precio);
               
				envios[iEnvios++] = envio;

                System.out.println("Registro OK");
            } catch (Exception excepcion) {
                System.out.println("Registro KO");
            }
        }
    }
}


//