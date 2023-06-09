package modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.ConexionSingleton;
//import clases.Usuario;
import interfaces.IUsuarioDao;


public class UsuarioDaoImpl  implements IUsuarioDao {

	private Connection conn;

	public UsuarioDaoImpl() {
		conn = ConexionSingleton.conectar();
	}

	@Override
	public void addUsuario(Usuario usuario) throws Exception {
		try {PreparedStatement st = conn.prepareStatement("INSERT INTO usuarios (run, nombre, fechaNac, tipo) VALUES (?,?,?,?);");
			 
			 st.setInt(1, usuario.getRunUsuario());
			 st.setString(2, usuario.getNombreUsuario());
			 st.setString(3, usuario.getFechaNacimientoUsuario());
			 st.setInt(4, usuario.getTipoUsuario());
			 
			 st.executeUpdate();


		}catch(Exception e) {
			throw e;
		}finally {
			if (conn != null) {
		        try {
		            conn.close();
		        } catch (SQLException er) {
		        	 er.printStackTrace();
		        }
		    }
		}

	}
	
	@Override
	public void updateUsuario(Usuario usuario) throws Exception {
		try {
			 PreparedStatement st = conn.prepareStatement("UPDATE usuarios SET nombre = ? WHERE run = ? ");
			 st.setString(1, usuario.getNombreUsuario());
			 st.setInt(2, usuario.getRunUsuario());
			 st.executeUpdate();

		}catch(Exception e) {
			throw e;
		}finally {
			if (conn != null) {
		        try {
		            conn.close();
		        } catch (SQLException er) {
		        	 er.getMessage();
		        }
		    }
		}

	}

	@Override
	public void deleteUsuario(Usuario usuario) throws Exception {
		try {
			 PreparedStatement st = conn.prepareStatement("DELETE FROM usuarios WHERE run= ?");
			 st.setInt(1, usuario.getRunUsuario());
			 st.executeUpdate();

		}catch(Exception e) {
			throw e;
		}finally {
			if (conn != null) {
		        try {
		            conn.close();
		        } catch (SQLException er) {
		        	 er.getMessage();
		        }
		    }
		}

	}

	@Override
	public ArrayList<Usuario> listarUsuario() throws Exception {
		String sql = "SELECT run, nombre, fechaNac,tipo FROM usuarios;";
		ArrayList<Usuario> lista = new ArrayList<>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
		    while(rs.next()) {
		        Usuario user = new Usuario();

		        user.setRunUsuario(rs.getInt("run"));
		        user.setNombreUsuario(rs.getString("nombre"));
		        user.setFechaNacimientoUsuario(rs.getString("fechaNac"));
		        user.setTipoUsuario(rs.getInt("tipo")); 
		        lista.add(user);
		        System.out.println(user.toString());
		    }
		    rs.close();
		   


		}catch(Exception e) {
		    throw e;
		}finally {
		    // Mover el cierre de la conexión aquí
		    if (conn != null) {
		        try {
		            conn.close();
		        } catch (SQLException er) {
		            er.getMessage();
		        }
		    }
		}
		return lista;
		}
	}


