package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.unbosque.model.NoAdmitidoDTO;

public class NoAdmitidoDAO implements OperacionDAO{

	ArrayList<NoAdmitidoDTO> lista;
	public NoAdmitidoDAO() {
	lista = new ArrayList<>();
	}
	
	@Override
	public void crear(String... args) {
		lista.add(new NoAdmitidoDTO(Long.parseLong(args[0]), args[1], LocalDate.parse(args[2]), Integer.parseInt(args[3]), args[4], args[5], args[6], LocalDate.parse(args[7]), args[8]));
		
	}

	@Override
	public boolean eliminar(int index) {
		if(index>= lista.size()||index<0) {
			return false;
		}else {
			lista.remove(index);
			return true;
		}
	}

	@Override
	public boolean actualizar(int index, String... args) {
		if(index>= lista.size()||index<0) {
			return false;
		}else {
			lista.set(index, new NoAdmitidoDTO(Long.parseLong(args[0]), args[1], LocalDate.parse(args[2]), Integer.parseInt(args[3]), args[4], args[5], args[6], LocalDate.parse(args[7]), args[8]));
			return true;
		}
	}

	@Override
	public String mostrar() {
		String salida = "";
		for(NoAdmitidoDTO noa:lista) {
			salida += noa.toString();
		}
		return salida;
	}

}

