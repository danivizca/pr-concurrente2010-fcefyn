package paquete;

import java.util.HashMap;
import java.util.Iterator;

/* Clase que contiene varios corredores, y la informaci�n asociada a la posici�n de cada uno. */
public class Pista {
	
	private HashMap<Corredor, Integer> corredores; /* Colecci�n de corredores agregados a la pista. */
	
	/* Nueva pista. */
	public Pista(){
		corredores = new HashMap<Corredor, Integer>();
	}
	
	/* Cambio de posici�n de un corredor en particular. */
	public String setPosition(Corredor c, String position){
		
		//Algoritmo para decidir si es penalizado o avanza.
		Integer valor = Integer.parseInt(position, 16);
		if (corredores.get(c)+1 != valor)
			valor = 0;	// Penalizado. Por vivo!
		
		corredores.put(c, valor);	// Actualizaci�n de la posici�n
		System.out.println("Corredor: "+c.getID()+ "Posicion: "+valor);
		return Integer.toString(valor.intValue(), 16);
	}
	
	/* Agregado de corredores. */
	public void addCorredor(Corredor corredor){
		corredores.put(corredor, 0);
		corredor.setPista(this);
	}
	
	/* Puesta en marcha de cada uno de los corredores. */
	public void iniciarCarrera(){
		Iterator<Corredor> it = corredores.keySet().iterator();
		Corredor actual;
		while(it.hasNext()){
			actual = (Corredor)it.next();
			actual.correr();
		}
	}
}
