package comba.datos.dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;

import comba.datos.entidades.Tipoblanco;
import comba.datos.entidades.Tipociudad;

public class TipoblancoDao implements IDao {

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
		Tipoblanco t = em.find(Tipoblanco.class, id);
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
		Query q = em.createQuery("select t from Tipoblanco t");
		List<Object> lista = q.getResultList();
		// hace commit y cierra
		em.getTransaction().commit();
		em.close();

		return lista;
	}

}
