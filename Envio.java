public class Envio{
	String numero;
	Float precio;
	
	public Envio(String numero, Float precio){
			 this.numero = numero;
			 this.precio = precio;		
	System.out.println("Construyendo objeto Envio...");
	}

	public String verComoString(){
		String texto = this.numero + "\t\t" + this.precio + "€";
		return texto;
	}
}

