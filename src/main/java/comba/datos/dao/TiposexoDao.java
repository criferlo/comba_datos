package comba.datos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import comba.datos.entidades.Tipoinstitucion;
import comba.datos.entidades.Tiposexo;

public class TiposexoDao implements IDao {

	public Object crear(Object objeto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Object actualizar(Object objeto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void eliminar(Object objeto) throws Exception {
		// TODO Auto-generated method stub

	}

	public Object seleccionarUno(long id) throws Exception {

		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// seleccionar
		Tiposexo t = em.find(Tiposexo.class, id);
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return t;

	}

	public List<Object> seleccionarTodos() throws Exception {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// seleccionar
		Query q = em.createQuery("select t from Tiposexo t");
		List<Object> lista = q.getResultList();
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return lista;
	}

}
