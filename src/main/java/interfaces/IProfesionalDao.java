package interfaces;
import clases.Profesional; 

import java.util.List;


public interface IProfesionalDAO {
  
    public void actualizarProfesional(Profesional profesional);
    public void eliminarProfesional(int run);    
    public List<Profesional> obtenerTodosLosProfesionales();
	void insertarProfesional(Profesional profesional);
}