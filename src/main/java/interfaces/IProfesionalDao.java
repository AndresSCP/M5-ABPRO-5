package interfaces;
import modelo.Profesional; 
import java.util.List;


public interface IProfesionalDao {
    public void agregarProfesional(Profesional profesional);
    public void actualizarProfesional(Profesional profesional);
    public void eliminarProfesional(int id);
    public Profesional obtenerProfesionalPorId(int id);
    public List<Profesional> obtenerTodosLosProfesionales();
}