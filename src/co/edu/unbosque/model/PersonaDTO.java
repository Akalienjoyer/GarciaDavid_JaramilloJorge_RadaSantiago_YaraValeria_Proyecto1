package co.edu.unbosque.model;
import java.time.*;

public class PersonaDTO {
	private long numeroDocumento;
	private String nombreCompleto;
	private LocalDate fechaNacimiento;
	private float edadExacta;
	private String paisOrigen;
	private String ciudadOrigen;
	
	public PersonaDTO() {
		//fechaNacimiento.of(0, 0, 0)
	}

	public PersonaDTO(long numeroDocumento, String nombreCompleto, LocalDate fechaNacimiento, float edadExacta,
			String paisOrigen, String ciudadOrigen) {
		super();
		this.numeroDocumento = numeroDocumento;
		this.nombreCompleto = nombreCompleto;
		this.fechaNacimiento = fechaNacimiento;
		this.edadExacta = edadExacta;
		this.paisOrigen = paisOrigen;
		this.ciudadOrigen = ciudadOrigen;
	}

	public long getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(long numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public float getEdadExacta() {
		return edadExacta;
	}

	public void setEdadExacta(float edadExacta) {
		this.edadExacta = edadExacta;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	@Override
	public String toString() {
	StringBuilder cadena = new StringBuilder();
	cadena.append("Numero de documento: "+numeroDocumento+"\n");
	cadena.append("Nombre completo: "+nombreCompleto+"\n");
	cadena.append("Fecha de cumpleaños: "+fechaNacimiento+"\n");
	cadena.append("Edad: "+edadExacta+"\n");
	cadena.append("Pais de origen: "+paisOrigen+"\n");
	cadena.append("Ciudad de origen: "+ciudadOrigen+"\n");
		return cadena.toString();
	}
}