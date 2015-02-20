package comba.datos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import comba.datos.entidades.Intento;
import comba.datos.entidades.Usuario;

public class IntentoDao implements IDao {

	public Object crear(Object objeto) throws Exception {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// setea campos
		Intento intento = (Intento) objeto;
		// persiste
		em.persist(intento);
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return intento;
	}

	public Object actualizar(Object objeto) throws Exception {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// setea campos
		Intento intento = (Intento) objeto;
		// merge
		em.merge(intento);
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return intento;
	}

	public void eliminar(Object objeto) throws Exception {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// merge
		Intento intento = (Intento) objeto;
		intento = em.merge(intento);
		em.remove(intento);
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

	}

	public Object seleccionarUno(long id) throws Exception {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// seleccionar
		Intento t = em.find(Intento.class, id);
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
		Query q = em.createQuery("select t from Intento t");
		List<Object> lista = q.getResultList();
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return lista;
	}

}
