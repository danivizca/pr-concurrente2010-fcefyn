package paquete;

/* Clase abstracta. 
 * Contiene m�todos que deben ser implementados por la clase hija.
 * Prestar atenci�n a los modificadores 'protected' y sacar provecho de ellos en la clase hija.
 * Implementar las 4 clases hija: 
 *   ColectivoSinControl_Matricula, 
 *   ColectivoConUnInspector_Matricula, 
 *   ColectivoConDosInspectores_Matricula.
 *   ColectivoConDosInspectoresSemaphore_Matricula
 * Completar getAPELLIDONombreDelAlumno().
 */
public abstract class Vehiculo{
	private static final int RETARDO_MS = 70;
	private int ingresosPermitidosA; 		/* Ingresos permitidos por puerta A. */
	private int ingresosPermitidosB; 		/* Ingresos permitidos por puerta B. */
	private int ingresosPorA = 0;			/* Cantidad de ingresos al memento por puerta A. */
	private int ingresosPorB = 0;			/* Cantidad de ingresos al memento por puerta B. */
	
	private Object inspectorA = new Object(); /* Inspector A. */ 
	private Object inspectorB = new Object(); /* Inspector B. */
	
	public Vehiculo(int ingresos_por_a, int ingresos_por_b){
		this.ingresosPermitidosA = ingresos_por_a;
		this.ingresosPermitidosB = ingresos_por_b;
	}
	
	protected Object getInspectorA(){
		return inspectorA;
	}
	
	protected Object getInspectorB(){
		return inspectorB;
	}
	
	public int getIngresosPermitidosPorPuertaA(){
		return ingresosPermitidosA;
	}
	
	public int getIngresosPermitidosPorPuertaB(){
		return ingresosPermitidosB;
	}
	
	public int getIngresosPorPuertaA(){
		int oc;
		oc = ingresosPorA;
		try {
			Thread.sleep(RETARDO_MS); 	/* 	Transcurre un tiempo entre que miro 
										 *	la cantidad de gente y hago algo 
										 *	adicional (como entrar). 
										 */
		} catch (InterruptedException e) {e.printStackTrace();}
		return oc;
	}
	
	public int getIngresosPorPuertaB(){
		int oc;
		oc = ingresosPorB;
		try {
			Thread.sleep(RETARDO_MS); 	/* 	Transcurre un tiempo entre que miro 
										 *	la cantidad de gente y hago algo 
										 *	adicional (como entrar). 
										 */
		} catch (InterruptedException e) {e.printStackTrace();}
		
		return oc;
	}
	
	public void incrementarIngresosPorPuertaA(){
		this.ingresosPorA++;
		System.out.println("Ingreso por A -> "+this.ingresosPorA);
	}
	
	public void incrementarIngresosPorPuertaB(){
		this.ingresosPorB++;
		System.out.println("Ingreso por B -> "+this.ingresosPorB);
	}

	public abstract void dejarEntrarAPasajeroPorPuertaA(Pasajero p);
	public abstract void dejarEntrarAPasajeroPorPuertaB(Pasajero p);
	public abstract String getAPELLIDONombreDelAlumno();
}

