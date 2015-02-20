package comba.datos.dao;

import java.util.ArrayList;
import java.util.List;

public interface IDao {

	public Object crear(Object objeto) throws Exception;
	public Object actualizar(Object objeto) throws Exception;
	public void eliminar(Object objeto) throws Exception;
	public Object seleccionarUno(long id) throws Exception;
	public List<Object> seleccionarTodos() throws Exception;
}
