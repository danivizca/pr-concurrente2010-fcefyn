package paq;

/* Interfaz Pasajero.
 */
public interface Pasajero extends Runnable{
	/* M�todo que pone en marcha un hilo que intenta entrar por puerta A o B (aleatoriamente) al 
	 * veh�culo dado como par�metro. 
	 * 
	 */
	public void entrarAlVehiculo(Vehiculo v);
}

