package interfaces;
import java.util.List;
import modelo.Capacitacion;


public interface ICapacitacion {
	
    List<Capacitacion> obtenerCapacitaciones();
    void registrarCapacitacion(Capacitacion capacitacion);

}
