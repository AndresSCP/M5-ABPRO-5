package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import conexion.ConexionSingleton;
import interfaces.IProfesionalDao;

public class ProfesionalDAOImpl implements IProfesionalDao {

	private Connection conexion = ConexionSingleton.conectar();
	
    @Override
    public void agregarProfesional(Profesional profesional) {
        try {
            String sql = "INSERT INTO profesionales (run_usuario, nombre_usuario, apellido_usuario, fecha_nacimiento_usuario, telefono, titulo_profesional, proyecto) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, profesional.getRunUsuario());
            statement.setString(2, profesional.getNombreUsuario());
            statement.setString(3, profesional.getApellidoUsuario());
            statement.setString(4, profesional.getFechaNacimientoUsuario());
            statement.setInt(5, profesional.getTelefono());
            statement.setString(6, profesional.getTituloProfesional());
            statement.setString(7, profesional.getProyecto());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actualizarProfesional(Profesional profesional) {
        try {
            String sql = "UPDATE profesionales SET run_usuario=?, nombre_usuario=?, apellido_usuario=?, fecha_nacimiento_usuario=?, telefono=?, titulo_profesional=?, proyecto=? WHERE id=?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, profesional.getRunUsuario());
            statement.setString(2, profesional.getNombreUsuario());
            statement.setString(3, profesional.getApellidoUsuario());
            statement.setString(4, profesional.getFechaNacimientoUsuario());
            statement.setInt(5, profesional.getTelefono());
            statement.setString(6, profesional.getTituloProfesional());
            statement.setString(7, profesional.getProyecto());
            statement.setInt(8, profesional.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarProfesional(int id) {
        try {
            String sql = "DELETE FROM profesionales WHERE id=?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Profesional> obtenerTodosLosProfesionales() {
        String query = "SELECT * FROM profesionales";
        List<Profesional> listaProfesionales = new ArrayList<>();
        try (Statement statement = conexion.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Profesional profesional = new Profesional(
                		resultSet.getInt("id"),
                        resultSet.getInt("runUsuario"),
                        resultSet.getString("nombreUsuario"),
                        resultSet.getString("apellidoUsuario"),
                        resultSet.getInt("idUsuario"),                    
                        resultSet.getString("fechaNacimientoUsuario"),
                        resultSet.getInt("telefono"),
                        resultSet.getString("tituloProfesional"),
                        resultSet.getString("proyecto")
                );
                profesional.setId(resultSet.getInt("id"));
                listaProfesionales.add(profesional);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaProfesionales;
    }

	@Override
	public Profesional obtenerProfesionalPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
