
public class Main {
	public static final int N_CHANNELS = 2;
	
	/* Ingresar las matr�culas aqu�. */
	public static final int MATRICULA_MAURICIO = 200404067;
	
	/* Fin de matr�culas. */
	
	public static void main(String[] args) {
		
		int alumno=MATRICULA_MAURICIO;
		
		switch(alumno){
			/* Ingresar el bloque de c�digo de inicializaci�n para cada alumno. */
			case MATRICULA_MAURICIO: 
				Generator generator = new Generator(N_CHANNELS);
				for (int i=0; i<5000;i++){
					System.out.println("Generator: " + generator.getMuestra(0) + " : " + generator.getMuestra(1) + ".");
					try {Thread.sleep(1);} catch (InterruptedException e) {}
				}
				generator.stop();
				break;
				
			default:
				System.out.println("Ingrese su nro. de alumno e implemente su secci�n de c�digo.");
		}
		
	}

}
