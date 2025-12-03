import java.util.Scanner;
public class programa{
	static Scanner teclado = new Scanner(System.in);
	static Envio[] envios = new Envio[50];
	static Integer iEnvios = 0;
public static void main(String[] args){
	
	System.out.println("version 2");
	
	Boolean repetirMenu = true;
	do{
		
		verMenu();
	//Menu
	
	
	switch(verMenu()){
		case "1":
				registrarEnvio();
				break;
		case "2":
				
				break;
		case "X":
		case "x":
				repetirMenu = false;
				break;
		default:
				System.out.println("Opción desconocida");
	}
	
			
	}while(repetirMenu);
	teclado.close();
	System.out.println("Fin del programa. Espero verte pronto.");
}	
	public static String verMenu(){
		System.out.println("Aplicacion de Pakoteria");
	System.out.println("1.Registrar envio ");
	System.out.println("2.Ver informe de envio ");
	System.out.println("X.Salir ");
	System.out.print("Opcion: ");
	return teclado.nextLine();
	}
	
	public static void registrarEnvio(){
		while(true){
		try{
					System.out.println("\nRegistro de envio");
					System.out.print("\tNumero: ");
					String numero = teclado.nextLine();
					System.out.print("\tPrecio: ");
					Float precio = Float.valueOf(teclado.nextLine());
					
					Envio envio = new Envio();
					envio.numero = numero;
					envio.precio = precio;
					envios[iEnvios++] = envio;
					
					
					System.out.println("Registro OK");
					}
					catch(Exception excepcion){
					System.out.println("Registro KO");
					}	
				}
	
//public static Integer
	
	
}

}