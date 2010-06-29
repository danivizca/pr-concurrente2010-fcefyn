package principal;

import Pisetta.Monitor_34441188;
import mauricio.*;

public class Main {
	/* Ingresar las matr�culas aqu�. */
	public static final int MATRICULA_MAURICIO = 200404067;
	public static final int MATRICULA_ORTIZ = 33320188;
	public static final int MATRICULA_SOLER = 33843410;
	public static final int MATRICULA_LUIS_RODRIGUEZ = 32187957;
	public static final int MATRICULA_SAMBAN = 34189197;
	public static final int MATRICULA_PISETTA = 34441188;
	
	/* Fin de matr�culas. */
	
	public static void main(String[] args) {
		int alumno=MATRICULA_PISETTA;
		boolean dos_inspectores = false;
		int i, capacidad=200, nroPasajeros=1000;
		Vehiculo veh = new ColectivoSinControl(capacidad/2,capacidad/2);
		
		switch(alumno){
		
			/* Ingresar el bloque de c�digo de inicializaci�n para cada alumno. */
		
			case MATRICULA_MAURICIO: 
				Vehiculo mon;
				if (dos_inspectores==false){
					mon = new Monitor_200404067(veh);
				}else{
					mon = null; /* �Tambi�n implementen este caso! */
				}
				
				for(i=0; i<nroPasajeros; i++){
					Persona p = new Persona(i+1);
					/* Notar que la persona solicita al monitor el ingreso al veh�culo. */
					/* Notar que el veh�culo no soporta concurrencia, si no es gracias al monitor. */
					p.entrarAlVehiculo(mon);
				}

				break;
			case MATRICULA_PISETTA: 
				Vehiculo vehiculo;
				if (dos_inspectores==false){
					vehiculo = new Monitor_34441188(veh,true);
				}else{
					vehiculo = null; /* en este caso no se si se refiere a q no exista vehiculo
					 					o que no exista monitor para el vehiculo 
					 					para este segundo caso pondria vehiculo=veh;
					 					o para 1 solo inspector, para eso seria
					 					 vehiculo = new Monitor_34441188(veh,false);*/
				}
				
				for(i=0; i<nroPasajeros; i++){
					Persona p = new Persona(i+1);
					if (vehiculo!=null)
					p.entrarAlVehiculo(vehiculo);
					
				}

				break;			
			default:
				System.out.println("Ingrese su nro. de alumno e implemente su secci�n de c�digo.");
		}

	}
}