package comba.datos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import comba.datos.dao.IntentoDao;
import comba.datos.dao.TipoblancoDao;
import comba.datos.dao.TiposexoDao;
import comba.datos.dao.TipociudadDao;
import comba.datos.dao.TipoinstitucionDao;
import comba.datos.dao.UsuarioDao;
import comba.datos.entidades.Intento;
import comba.datos.entidades.Tipoblanco;
import comba.datos.entidades.Tipociudad;
import comba.datos.entidades.Tipoinstitucion;
import comba.datos.entidades.Tiposexo;
import comba.datos.entidades.Usuario;


public class Principal {

	
	/* public Project findProjectWithName(String name) {
	        Project project = (Project)em.createQuery("SELECT OBJECT(project) FROM Project project WHERE project.name = :projectName")
	                .setParameter("projectName", name).getSingleResult();
	        return project;
	    }*/
	
	
	public static void main(String[] args){
		//prueba crear exitosa
		TipociudadDao t = new TipociudadDao();
		TipoinstitucionDao dao2 = new TipoinstitucionDao();
		TiposexoDao sexodao = new TiposexoDao();
		TipoblancoDao blanco = new TipoblancoDao();
		UsuarioDao usuariodao = new UsuarioDao();
		IntentoDao intentodao = new IntentoDao();
		
		/*
		Tipociudad ciudad = new Tipociudad();
		ciudad.setNombre("CALI");
		ciudad = (Tipociudad) t.crear(ciudad);
		Util.m(ciudad.getId()+"");*/
		
		//prueba consultar exitosa
		Tipociudad objtc=null;
		try {
			objtc = (Tipociudad) t.seleccionarUno((long)2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//Util.m(obj.getNombre());
		
		
		/*obj.setNombre("CALI MODIFICADA");
		//prueba actualizar exitosa
		t.actualizar(obj);*/
		//prueba eliminar exitosa
		//t.eliminar(obj);
		
		/*List<Object> lista = t.seleccionarTodos();
		for(Object b:lista){
			Tipociudad ta =(Tipociudad) b;
			Util.m(ta.getNombre());
		}*/
		
		
		
		/*Tipoinstitucion tipo = new Tipoinstitucion();
		tipo.setNombre("UNIVERSIDAD MANUELA BELTRAN");
		tipo.setTipoCiudad(objtc);
		try {
			dao2.crear(tipo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		/*try {
			Tipoinstitucion tao=(Tipoinstitucion) dao2.seleccionarUno((long)1);
			Util.m(tao.getTipoCiudad().getNombre());
			Tiposexo sexo=(Tiposexo) sexodao.seleccionarUno((long)1);
			///
			Usuario usu = new Usuario();
			usu.setCedula("87069371");
			usu.setEstatura((long)175);
			
			usu.setFecha_nacimiento(new Date());
			usu.setFecha_registro_at(new Date());
			usu.setNombre_completo("CRISTHIAN FERNANDO LOMBANA");
			usu.setPeso((long)30);
			usu.setTipoInstitucion(tao);
			usu.setTipoSexo(sexo);
			
			//prueba crear exitosa
			//usu = (Usuario) usuariodao.crear(usu);
			
			Util.m(usu.getId()+"");
			
			
			usu = (Usuario) usuariodao.seleccionarUno((long)1);
			
			Tipoblanco objtipoblanco = new Tipoblanco();
			objtipoblanco = (Tipoblanco) blanco.seleccionarUno((long)1);
			
			Intento intento = new Intento();
			
			intento.setDesviacion_lanzadera((float)1.2);
			intento.setDireccion_lanzadera((float)6000);
			intento.setElevacion_lanzadera((float)3000);
			intento.setFecha_at(new Date());
			intento.setPrecision((float)4);
			intento.setTamano_blanco((float)50);
			intento.setTiempo_respuesta((float)20);
			intento.setTipoBlanco(objtipoblanco);
			intento.setUsuario(usu);
			intento.setVelocidad_blanco((float)4);
			intento.setVelocidad_disparo((float)5);
			intento.setVelocidad_lanzadera((long)2000);
			
			//prueba crear exitosa
			intentodao.crear(intento);
			
			Intento inte = (Intento) intentodao.seleccionarUno((long)3);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		
	}
	
}
