package main;
<<<<<<< .mine
=======
import mauricio.*;
>>>>>>> .r254

import LuisRodriguez.MiMain;



public class Main {
	public static final int N_CHANNELS = 2;

	
	/* Ingresar las matr�culas aqu�. */
	public static final int MATRICULA_MAURICIO = 200404067;
	public static final int MATRICULA_LUIS_RODRIGUEZ=32187957;
	
	/* Fin de matr�culas. */
	
	public static void main(String[] args) {
		
		int alumno=MATRICULA_LUIS_RODRIGUEZ;
		
		switch(alumno){
			/* Ingresar el bloque de c�digo de inicializaci�n para cada alumno. */
			case MATRICULA_MAURICIO: 
<<<<<<< .mine
				Generator generator = new Generator(N_CHANNELS,1);
				generator.run();
=======
				Generator generator = new Generator(N_CHANNELS, 1);
				new OneFile200404067(generator);
>>>>>>> .r254
				new Otra(generator);
				break;
				
			case MATRICULA_LUIS_RODRIGUEZ:
				MiMain mm=new MiMain(); //inicializacion de la pantalla y otros objetos
				
				break;	
				
				
				
			default:
				System.out.println("Ingrese su nro. de alumno e implemente su secci�n de c�digo.");
		}
		
	}
	

}
