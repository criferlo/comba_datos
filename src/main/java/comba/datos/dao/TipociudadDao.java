package comba.datos.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import comba.datos.Util;
import comba.datos.entidades.Tipociudad;

public class TipociudadDao implements IDao {

	public Object crear(Object objeto) throws Exception{
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// setea campos
		Tipociudad ciudad = (Tipociudad) objeto;
		// persiste
		em.persist(ciudad);
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return ciudad;
	}

	public Object actualizar(Object objeto) throws Exception{
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// setea campos
		Tipociudad ciudad = (Tipociudad) objeto;
		// merge
		em.merge(ciudad);
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return ciudad;

	}

	public void eliminar(Object objeto) throws Exception{

		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// merge
		Tipociudad ciudad = (Tipociudad) objeto;
		ciudad = em.merge(ciudad);
		em.remove(ciudad); 
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

	}

	public Object seleccionarUno(long l) throws Exception{

		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// seleccionar
		Tipociudad t = em.find(Tipociudad.class, l);
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return t;

	}

	public List<Object> seleccionarTodos() {
		// objetos para persistir
		EntityManagerFactory factory;
		factory = Persistence.createEntityManagerFactory("unidad");
		EntityManager em = factory.createEntityManager();
		// abre transaccion
		em.getTransaction().begin();
		// seleccionar
		Query q = em.createQuery("select t from Tipociudad t"); 
		List<Object> lista =  q.getResultList();
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return lista;
	}
	
	

}
