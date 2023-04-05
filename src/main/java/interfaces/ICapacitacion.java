package interfaces;
import java.util.List;
import modelo.Capacitacion;


public interface ICapacitacion {
	
    List<Capacitacion> obtenerCapacitaciones();
    String registrarCapacitacion(Capacitacion capacitacion);

}
