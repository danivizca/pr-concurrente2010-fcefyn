package paquete;


/* Clase que implementa Cracker. */
public class Cracker_30995308 implements Cracker {
	private int max=9999;
	private int min=0000;
	private int clave =0; /* Atributo privado que representa a la clave en curso. */
	
	
	/* Obtenci�n de la clave secuencial. */
	public String getNextKey(boolean ultima_clave_se_paso) {
		String cadena = null;

		if(ultima_clave_se_paso){
			
			max=clave-1;
			clave=((max+min)/2);
		
		}else{
				
			min=clave+1;
			clave=((max+min)/2);
		}

		cadena = String.valueOf(clave);
		System.out.println(cadena);
		return cadena;
	}


	/* Obtenci�n del nombre del alumno. */
	public String getStudentName() { 
		return "Mac�as, Cristian";
	}
	
	public int getCurrentKey(){
		return clave;
	}
}