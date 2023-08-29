package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import co.edu.unbosque.model.AdmitidoDTO;

public class AdmitidoDAO implements OperacionDAO{

	private ArrayList<AdmitidoDTO> lista;

	public AdmitidoDAO() {
		lista = new ArrayList<>();
	}

	@Override
	public void crear(String... args) {
		lista.add(new AdmitidoDTO(Long.parseLong(args[0]), args[1], LocalDate.parse(args[2]), Integer.parseInt(args[3]), args[4], args[5], LocalDateTime.parse(args[6]), Integer.parseInt(args[7]), LocalDate.parse(args[8])));


	}

	@Override
	public boolean eliminar(int index) {
		if (index>lista.size() || index<0) {
			return false;
		} else
			lista.remove(index);
		return true;
	}

	@Override
	public boolean actualizar(int index, String... args) {

		if (index>lista.size() || index<0) {
			return false;
		} else {
			lista.set(index, new AdmitidoDTO(Long.parseLong(args[0]), args[1], LocalDate.parse(args[2]), Integer.parseInt(args[3]), args[4], args[5], LocalDateTime.parse(args[6]), Integer.parseInt(args[7]), LocalDate.parse(args[8])));
			return true;
		}

	}

	@Override
	public String mostrar() {
		String salida = "";
		for(AdmitidoDTO pa: lista) {
			salida+= pa.toString();
		}
		return salida;
	}


}