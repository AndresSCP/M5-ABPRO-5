package modelo;


public class Usuario {
	private  Integer id; // Autoincremetable
	private  Integer runUsuario; // RUN del usuario (menor a 99.999.999)
	private  String nombreUsuario; // nombres que identifica al usuario
	private  String apellidoUsuario; // apellidos que identifica al usuario
	private  String fechaNacimientoUsuario; // fecha de nacimiento del usuario
	private  Integer idUsuario;



	public Usuario() {
		super();
	}

	public Usuario(Integer id, Integer runUsuario, String nombreUsuario, String apellidoUsuario,
			String fechaNacimientoUsuario, Integer idUsuario) {
		super();
		this.id = id;
		this.runUsuario = runUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.fechaNacimientoUsuario = fechaNacimientoUsuario;
		this.idUsuario = idUsuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRunUsuario() {
		return runUsuario;
	}

	public void setRunUsuario(Integer runUsuario) {
		this.runUsuario = runUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getFechaNacimientoUsuario() {
		return fechaNacimientoUsuario;
	}

	public void setFechaNacimientoUsuario(String fechaNacimientoUsuario) {
		this.fechaNacimientoUsuario = fechaNacimientoUsuario;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}






}