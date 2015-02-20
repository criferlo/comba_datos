package comba.datos.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Tipoinstitucion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="tipociudad_id")
	private Tipociudad tipoCiudad;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Tipociudad getTipoCiudad() {
		return tipoCiudad;
	}
	public void setTipoCiudad(Tipociudad tipoCiudad) {
		this.tipoCiudad = tipoCiudad;
	}
	
	public String toString(){
		return this.nombre;
	}
	
}
