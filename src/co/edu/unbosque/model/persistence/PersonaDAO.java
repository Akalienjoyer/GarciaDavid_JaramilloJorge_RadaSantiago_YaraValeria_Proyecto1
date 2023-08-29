package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import co.edu.unbosque.model.PersonaDTO;

public class PersonaDAO implements OperacionDAO{

	ArrayList<PersonaDTO> lista;
	public PersonaDAO() {
		lista = new ArrayList<>();
	}
	
	@Override
	public void crear(String... args) {
		lista.add(new PersonaDTO( Integer.parseInt(args[0]), args[1], LocalDate.parse(args[2]), Integer.parseInt(args[3]), args[4], args[5]));
		
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
			lista.set(index, new PersonaDTO(Integer.parseInt(args[0]), args[1], LocalDate.parse(args[2]), Integer.parseInt(args[3]), args[4], args[5]));
			return true;
		}
		
	}

	@Override
	public String mostrar() {
		String salida = "";
		for(PersonaDTO per:lista) {
			salida += per.toString();
		}
		return salida;
	}
}
