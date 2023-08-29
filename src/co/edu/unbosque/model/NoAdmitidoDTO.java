package co.edu.unbosque.model;
import java.time.*;

public class NoAdmitidoDTO extends PersonaDTO{

	private String ciudadDevolucion;
	private LocalDate fechaExpulsion;
	private String motivoExpulsion;
	
	public NoAdmitidoDTO() {
	}

	public NoAdmitidoDTO(String ciudadDevolucion, LocalDate fechaExpulsion, String motivoExpulsion) {
		super();
		this.ciudadDevolucion = ciudadDevolucion;
		this.fechaExpulsion = fechaExpulsion;
		this.motivoExpulsion = motivoExpulsion;
	}

	public NoAdmitidoDTO(long numDoc, String nombre, LocalDate fechaCumple, int edad, String paisOrigen,
			String ciudadOrigen) {
		super(numDoc, nombre, fechaCumple, edad, paisOrigen, ciudadOrigen);
		// TODO Auto-generated constructor stub
	}

	public NoAdmitidoDTO(long numDoc, String nombre, LocalDate fechaCumple, int edad, String paisOrigen,
			String ciudadOrigen, String ciudadDevolucion, LocalDate fechaExpulsion, String motivoExpulsion) {
		super(numDoc, nombre, fechaCumple, edad, paisOrigen, ciudadOrigen);
		this.ciudadDevolucion = ciudadDevolucion;
		this.fechaExpulsion = fechaExpulsion;
		this.motivoExpulsion = motivoExpulsion;
	}

	public String getCiudadDevolucion() {
		return ciudadDevolucion;
	}

	public void setCiudadDevolucion(String ciudadDevolucion) {
		this.ciudadDevolucion = ciudadDevolucion;
	}

	public LocalDate getFechaExpulsion() {
		return fechaExpulsion;
	}

	public void setFechaExpulsion(LocalDate fechaExpulsion) {
		this.fechaExpulsion = fechaExpulsion;
	}

	public String getMotivoExpulsion() {
		return motivoExpulsion;
	}

	public void setMotivoExpulsion(String motivoExpulsion) {
		this.motivoExpulsion = motivoExpulsion;
	}
	@Override
	public String toString() {
	StringBuilder cadena = new StringBuilder();
	cadena.append("Ciudad de devolucion: "+ciudadDevolucion+"\n");
	cadena.append("Fecha de expulsion: "+fechaExpulsion+"\n");
	cadena.append("Motivo de expulsion: "+motivoExpulsion+"\n");
		return super.toString()+"\n"+cadena.toString();
	}
}