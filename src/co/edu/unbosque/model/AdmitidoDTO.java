package co.edu.unbosque.model;
import java.time.*;

public class AdmitidoDTO extends PersonaDTO{

	private LocalDateTime fechaHoraDeEntrada;
	private int tiempoEstadiaDias;
	private LocalDate fechaSalida;
	
	public AdmitidoDTO() {
	
	}

	public AdmitidoDTO(LocalDateTime fechaHoraDeEntrada, int tiempoEstadiaDias, LocalDate fechaSalida) {
		super();
		this.fechaHoraDeEntrada = fechaHoraDeEntrada;
		this.tiempoEstadiaDias = tiempoEstadiaDias;
		this.fechaSalida = fechaSalida;
	}

	public AdmitidoDTO(long numDoc, String nombre, LocalDate fechaCumple, int edad, String paisOrigen,
			String ciudadOrigen) {
		super(numDoc, nombre, fechaCumple, edad, paisOrigen, ciudadOrigen);
		// TODO Auto-generated constructor stub
	}

	public AdmitidoDTO(long numDoc, String nombre, LocalDate fechaCumple, int edad, String paisOrigen,
			String ciudadOrigen, LocalDateTime fechaHoraDeEntrada, int tiempoEstadiaDias, LocalDate fechaSalida) {
		super(numDoc, nombre, fechaCumple, edad, paisOrigen, ciudadOrigen);
		this.fechaHoraDeEntrada = fechaHoraDeEntrada;
		this.tiempoEstadiaDias = tiempoEstadiaDias;
		this.fechaSalida = fechaSalida;
	}

	public LocalDateTime getFechaHoraDeEntrada() {
		return fechaHoraDeEntrada;
	}

	public void setFechaHoraDeEntrada(LocalDateTime fechaHoraDeEntrada) {
		this.fechaHoraDeEntrada = fechaHoraDeEntrada;
	}

	public int getTiempoEstadiaDias() {
		return tiempoEstadiaDias;
	}

	public void setTiempoEstadiaDias(int tiempoEstadiaDias) {
		this.tiempoEstadiaDias = tiempoEstadiaDias;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	@Override
	public String toString() {
	StringBuilder cadena = new StringBuilder();
	cadena.append("Fecha y hora de entrada: "+fechaHoraDeEntrada+"\n");
	cadena.append("Duracion de la estadia: "+tiempoEstadiaDias+"\n");
	cadena.append("Fecha de salida: "+fechaSalida+"\n");
		return super.toString()+"\n"+cadena.toString();
	}
	
}