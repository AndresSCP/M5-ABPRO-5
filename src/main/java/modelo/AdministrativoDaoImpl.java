package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import conexion.ConexionSingleton;
import interfaces.IAdministrativoDao;

public class AdministrativoDaoImpl implements IAdministrativoDao{
	
	private Connection conexion = ConexionSingleton.conectar();
	
	public void registrarAdministrativo(Administrativo administrativo) {
        try {
            String sql = "INSERT INTO administrativos (run, nombres, apellidos, fecha_nacimiento_usuario, email, area, exPrevia, idUsuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
//            statement.setInt(1, administrativo.getRun());
            statement.setString(2, administrativo.getNombreUsuario());
//            statement.setString(3, administrativo.getApellidoUsuario());
            statement.setString(4, administrativo.getFechaNacimientoUsuario());
            statement.setString(5, administrativo.getEmail());
            statement.setString(6, administrativo.getArea());
            statement.setString(7, administrativo.getExpPrevia());
//            statement.setLong(8, administrativo.getIdUsuario());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
    @Override
    public void actualizarAdministrativo(Administrativo administrativo) {
        try {
            String sql = "UPDATE administrativos SET run=?, nombres=?, apellidos=?, fecha_nacimiento_usuario=?, email=?, area=?, exPrevia=? WHERE id=?";
            PreparedStatement statement = conexion.prepareStatement(sql);
//            statement.setInt(1, administrativo.getRun());
            statement.setString(2, administrativo.getNombreUsuario());
//            statement.setString(3, administrativo.getApellidoUsuario());
            statement.setString(4, administrativo.getFechaNacimientoUsuario());
            statement.setString(5, administrativo.getEmail());
            statement.setString(6, administrativo.getArea());
            statement.setString(7, administrativo.getExpPrevia());
//            statement.setLong(8, administrativo.getIdUsuario());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void eliminarAdministrativo(int id) {
        try {
            String sql = "DELETE FROM administrativos WHERE id=?";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
	@Override
	public List<Administrativo> obtenerAdministrativos()  {
		String sql = "SELECT * FROM administrativos";
		List<Administrativo> listaAdministrativos = new ArrayList<>();
		try {
			PreparedStatement ps = conexion.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Administrativo administrativo = new Administrativo();
//				administrativo.setRun(rs.getInt("run"));
				administrativo.setNombreUsuario(rs.getString("nombres"));
//				administrativo.setApellidoUsuario(rs.getString("apellidos"));
				administrativo.setFechaNacimientoUsuario(rs.getString("fecha_nacimiento_usuario"));
				administrativo.setEmail(rs.getString("email"));
				administrativo.setArea(rs.getString("area"));
				administrativo.setExpPrevia(rs.getString("exPrevia"));
				administrativo.setRunUsuario(rs.getInt("idUsuario"));							
				listaAdministrativos.add(administrativo);
                System.out.println(administrativo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaAdministrativos;
}

	@Override
	public Administrativo obtenerAdministrativoPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}


