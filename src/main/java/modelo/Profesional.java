package modelo;

import java.util.Date;

public class Profesional extends Usuario {
    private Integer run;
    private String tituloProfesional;
    private Date FechaIngreso;
    private String proyecto;
	public Profesional() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profesional(Integer run,String tituloProfesional, Date fechaIngreso, String proyecto, String nombre, Date fechaNac, Integer tipo) {
		super(run, nombre, fechaNac, tipo);
		// TODO Auto-generated constructor stub
		this.run = run;
		this.tituloProfesional = tituloProfesional;
		this.FechaIngreso = fechaIngreso;
		this.proyecto = proyecto;
		
	}
	public Integer getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public String getTituloProfesional() {
		return tituloProfesional;
	}
	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}
	public Date getFechaIngreso() {
		return FechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}
	public String getProyecto() {
		return proyecto;
	}
	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
	@Override
	public String toString() {
		return "Profesional [run=" + run + ", tituloProfesional=" + tituloProfesional + ", FechaIngreso=" + FechaIngreso
				+ ", proyecto=" + proyecto + ", getRun()=" + getRun() + ", getTituloProfesional()="
				+ getTituloProfesional() + ", getFechaIngreso()=" + getFechaIngreso() + ", getProyecto()="
				+ getProyecto() + ", getNombre()=" + getNombre() + ", getFechaNac()=" + getFechaNac() + ", getTipo()="
				+ getTipo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

    
    
}