package comba.datos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import comba.datos.entidades.Tipoinstitucion;
import comba.datos.entidades.Usuario;

public class UsuarioDao implements IDao {

	public Object crear(Object objeto) throws Exception {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// setea campos
		Usuario usuario = (Usuario) objeto;
		// persiste
		em.persist(usuario);
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return usuario;
	}

	public Object actualizar(Object objeto) throws Exception {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// setea campos
		Usuario usuario = (Usuario) objeto;
		// merge
		em.merge(usuario);
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return usuario;
	}

	public void eliminar(Object objeto) throws Exception {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// merge
		Usuario usuario = (Usuario) objeto;
		usuario = em.merge(usuario);
		em.remove(usuario);
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
		Usuario t = em.find(Usuario.class, id);
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
		Query q = em.createQuery("select t from Usuario t");
		List<Object> lista = q.getResultList();
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return lista;
	}

	public List<Object> seleccionarPorCedula(String ced) throws Exception {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// seleccionar
		Query q = em.createQuery("select t from Usuario t where t.cedula="+ced+"");
		List<Object> lista = q.getResultList();
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return lista;
	}
	
	public List<Object> seleccionarPorNombre(String nom) throws Exception {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// seleccionar
		Query q = em.createQuery("select t from Usuario t where t.nombre_completo like '%"+nom+"%'");
		List<Object> lista = q.getResultList();
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return lista;
	}

}
