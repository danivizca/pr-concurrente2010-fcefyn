package paquete;

public class Nutria extends Animal implements Corredor{

	
	protected Pista pista;
	static protected int gps=0;
	protected String gpss;
	
	Nutria(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void correr() {
		/* A los fines did�cticos se desglosa esta parte. */
		Runnable runab = this; 
		String nombre_hilo = this.getID();
		Thread nutria_hilo = (new Thread(runab,nombre_hilo)); /* Creaci�n de un nuevo hilo. */
		nutria_hilo.setPriority(10);
		nutria_hilo.start();
	}

	@Override
	public String getID() {
		String name = "Rodrigo Anto�ana";
		return name;
	}

	@Override
	public void setPista(Pista pista) {
		this.pista = pista;
	}

	@Override
	public void run() {
		gps++;
		gpss = Integer.toHexString(gps);
	    	
		
		
	}

}
