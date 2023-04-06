package implementacion;

import interfaces.ICapacitacion;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import modelo.Capacitacion;


public class CapacitacionImpl implements ICapacitacion{
	
	/**
	 * Creacion de 3 tipos de capacitacion.
	 */
	
	@Override
	public List<Capacitacion> obtenerCapacitaciones() {
		List<Capacitacion>capacitacion = new ArrayList<>();
		capacitacion.add(new Capacitacion (8, "Capacitacion 8", 189746, "Martes", "11:00", "Valparaiso", "20",12));
		capacitacion.add(new Capacitacion (9, "Capacitacion 9", 189556, "Lunes", "12:00", "Villa Alemana", "5",4));
		capacitacion.add(new Capacitacion (10, "Capacitacion 10", 173125, "Miercoles", "11:00", "Quilpue", "2",20));
		return capacitacion;
	}
	
	/**
	 * Registro de capacitaciones
	 */
	
	@Override
	public String registrarCapacitacion(Capacitacion capacitacion) {
		
		return capacitacion.toString();
		
	}
}
	