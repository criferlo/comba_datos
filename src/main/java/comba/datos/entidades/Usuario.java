package comba.datos.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cedula;
	private String nombre_completo;
	@Temporal(TemporalType.DATE)
	private Date fecha_nacimiento;
	private Long estatura;
	private Long peso;
	@Temporal(TemporalType.DATE)
	private Date fecha_registro_at;
	
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="tipoinstitucion_id")
	private Tipoinstitucion tipoInstitucion;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="tiposexo_id")
	private Tiposexo tipoSexo;
	
	@OneToMany(mappedBy="usuario")
	private final List<Intento> intentos = new ArrayList<Intento>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre_completo() {
		return nombre_completo;
	}

	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Long getEstatura() {
		return estatura;
	}

	public void setEstatura(Long estatura) {
		this.estatura = estatura;
	}

	public Long getPeso() {
		return peso;
	}

	public void setPeso(Long peso) {
		this.peso = peso;
	}

	public Date getFecha_registro_at() {
		return fecha_registro_at;
	}

	public void setFecha_registro_at(Date fecha_registro_at) {
		this.fecha_registro_at = fecha_registro_at;
	}

	public Tipoinstitucion getTipoInstitucion() {
		return tipoInstitucion;
	}

	public void setTipoInstitucion(Tipoinstitucion tipoInstitucion) {
		this.tipoInstitucion = tipoInstitucion;
	}

	public Tiposexo getTipoSexo() {
		return tipoSexo;
	}

	public void setTipoSexo(Tiposexo tipoSexo) {
		this.tipoSexo = tipoSexo;
	}

	public List<Intento> getIntentos() {
		return intentos;
	}

	

	
}
