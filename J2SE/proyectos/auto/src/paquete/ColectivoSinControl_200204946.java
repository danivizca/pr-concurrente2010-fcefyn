/* 
�Entran m�s usuarios de los permitidos en alg�n caso? �Por qu�?
	En caso de no sincronizar el ingreso en el colectivo sin control o no sincronizar los inspectores.
	Sincronize el ingreso en el vehiculo sin control para que se cumpla el ingreso maximo por puerta.

�Cu�l es la ventaja de la implementaci�n del Veh�culo con 2 inspectores respecto del que tiene 1 s�lo?
  	Con 2 inspectores se puede ingresar por A y por B simultaneamente.
  	El tiempo en llenar el vehiculo se reduce a la mitad.
*/

package paquete;

public class ColectivoSinControl_200204946 extends Vehiculo {
	
	//Constructor
	public ColectivoSinControl_200204946(int IngMaxA, int IngMaxB){
		super(IngMaxA, IngMaxB);
	}
	
	//Metodo Sincronizado Ingreso Pasajero por A
	public synchronized void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		if(this.getIngresosPorPuertaA() < this.getIngresosPermitidosPorPuertaA()){
			this.incrementarIngresosPorPuertaA();
        }
	}
	
	//Metodo Sincronizado Ingreso Pasajero por B
	public synchronized void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		if(this.getIngresosPorPuertaB() < this.getIngresosPermitidosPorPuertaB()){
			this.incrementarIngresosPorPuertaB();
		}
	}
	
	//Devolver APELLIDO y Nombre
	public String getAPELLIDONombreDelAlumno() {
		String nombre = "SUREDA Jos�";
		return nombre;
	}
}