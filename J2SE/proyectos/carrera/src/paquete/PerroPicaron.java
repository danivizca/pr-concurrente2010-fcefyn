package paquete;

import java.util.Random;

/* Clase PerroPicaron. <Es> Perro. */
public class PerroPicaron extends Perro{
	/* 
	 * De d�nde toma los atributos:
	 * - position; y
	 * - pista
	 * este perro?
	 * 
	 */
	
	PerroPicaron(String nombre) {
		super(nombre); /* Constructor de la super-clase (Perro). */
	}
	
	/* M�todo que ser� ejecutado desde un hilo independiente al hacer 'hilo.start()'. */
	/* Este perro picar�n quiere avanzar de a 2, algunas veces. */
	@Override
	public void run() {
		Random rnd = new Random();
		int step;
		try{
			while(true){
				step = ((rnd.nextFloat()>0.999999)?2:1);
				position = Integer.parseInt(pista.setPosition(this, Integer.toHexString(position+step)),16);
			}
		}catch(NumberFormatException e){
			System.out.println("Soy " + this.getID() +". He llegado al final! <<<<<<<<<<<<<<<");
		}
	}
}
