package mauricio;

import paquete.Pasajero;
import paquete.Vehiculo;

public class Monitor_200404067 extends Vehiculo {
	private Vehiculo monitoreado = null;
	
	public Monitor_200404067(int ingresos_por_a, int ingresos_por_b) {
		super(0, 0); /* Atributos no utilizados (se utilizar�n los del veh�culo a monitorear). */
		
	}
	
	public Monitor_200404067(Vehiculo monitoreado){
		super(0,0);
		this.monitoreado = monitoreado;
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaA(Pasajero p) {
		synchronized(this){
			int permitidos = monitoreado.getIngresosPermitidosPorPuertaA();
			int realizados = monitoreado.getIngresosPorPuertaA();
			if (permitidos < realizados) {
				monitoreado.dejarEntrarAPasajeroPorPuertaA(p);
			}
		}
	}

	@Override
	public void dejarEntrarAPasajeroPorPuertaB(Pasajero p) {
		synchronized(this){
			int permitidos = monitoreado.getIngresosPermitidosPorPuertaB();
			int realizados = monitoreado.getIngresosPorPuertaB();
			if (permitidos < realizados) {
				monitoreado.dejarEntrarAPasajeroPorPuertaB(p);
			}
		}
	}

	@Override
	public String getAPELLIDONombreDelAlumno() {
		return "JOST, Mauricio G.";
	}

}
