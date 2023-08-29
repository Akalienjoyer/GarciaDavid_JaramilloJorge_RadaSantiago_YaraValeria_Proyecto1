package co.edu.unbosque.model.persistence;

public interface OperacionDAO {
	public void crear(String ...args);
	
	public String mostrar ();
	
	public boolean actualizar(int index, String ...args);
	
	public boolean eliminar (int index);
}
