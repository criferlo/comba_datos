package comba.datos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import comba.datos.entidades.Tipociudad;
import comba.datos.entidades.Tipoinstitucion;

public class TipoinstitucionDao implements IDao {

	public Object crear(Object objeto) throws Exception {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// setea campos
		Tipoinstitucion institucion = (Tipoinstitucion) objeto;
		// persiste
		em.persist(institucion);
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return institucion;
	}

	public Object actualizar(Object objeto) throws Exception {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// setea campos
		Tipoinstitucion institucion = (Tipoinstitucion) objeto;
		// merge
		em.merge(institucion);
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return institucion;
	}

	public void eliminar(Object objeto) throws Exception {
		// TODO Auto-generated method stub
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// merge
		Tipoinstitucion institucion = (Tipoinstitucion) objeto;
		institucion = em.merge(institucion);
		em.remove(institucion);
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
		Tipoinstitucion t = em.find(Tipoinstitucion.class, id);
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
		Query q = em.createQuery("select t from Tipoinstitucion t");
		List<Object> lista = q.getResultList();
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return lista;
	}
	
	public List<Tipoinstitucion> seleccionarPorCiudad(String nom){
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// seleccionar
		Query q = em.createQuery("select t from Tipoinstitucion t where t.tipoCiudad.nombre like '%"+nom+"%'"); 
		List<Tipoinstitucion> lista =  q.getResultList();
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return lista;
	}
	
	public List<Tipoinstitucion> seleccionarPorNombre(String nom){
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// seleccionar
		Query q = em.createQuery("select t from Tipoinstitucion t where t.nombre like '%"+nom+"%'"); 
		List<Tipoinstitucion> lista =  q.getResultList();
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return lista;
	}

}
