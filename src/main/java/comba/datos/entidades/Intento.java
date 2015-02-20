package comba.datos.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Intento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private float velocidad_blanco;
	private float tamano_blanco;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tipoblanco_id")
	private Tipoblanco tipoBlanco;
	
	private Long velocidad_lanzadera;
	private float desviacion_lanzadera;
	private float direccion_lanzadera;
	private float elevacion_lanzadera;
	private float precision_disparo;
	private float velocidad_disparo;
	private float tiempo_respuesta;
	private String tipo_recepcion;
	
	
	@JoinColumn(name="usuario_id")
	private Usuario usuario;
	
	@Temporal(TemporalType.DATE)
	private Date fecha_at;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getVelocidad_blanco() {
		return velocidad_blanco;
	}

	public void setVelocidad_blanco(float velocidad_blanco) {
		this.velocidad_blanco = velocidad_blanco;
	}

	public float getTamano_blanco() {
		return tamano_blanco;
	}

	public void setTamano_blanco(float tamano_blanco) {
		this.tamano_blanco = tamano_blanco;
	}

	public Tipoblanco getTipoBlanco() {
		return tipoBlanco;
	}

	public void setTipoBlanco(Tipoblanco tipoBlanco) {
		this.tipoBlanco = tipoBlanco;
	}

	public Long getVelocidad_lanzadera() {
		return velocidad_lanzadera;
	}

	public void setVelocidad_lanzadera(Long velocidad_lanzadera) {
		this.velocidad_lanzadera = velocidad_lanzadera;
	}

	public float getDesviacion_lanzadera() {
		return desviacion_lanzadera;
	}

	public void setDesviacion_lanzadera(float desviacion_lanzadera) {
		this.desviacion_lanzadera = desviacion_lanzadera;
	}

	public float getDireccion_lanzadera() {
		return direccion_lanzadera;
	}

	public void setDireccion_lanzadera(float direccion_lanzadera) {
		this.direccion_lanzadera = direccion_lanzadera;
	}

	public float getElevacion_lanzadera() {
		return elevacion_lanzadera;
	}

	public void setElevacion_lanzadera(float elevacion_lanzadera) {
		this.elevacion_lanzadera = elevacion_lanzadera;
	}

	public float getPrecision() {
		return precision_disparo;
	}

	public void setPrecision(float precision) {
		this.precision_disparo = precision;
	}

	public float getVelocidad_disparo() {
		return velocidad_disparo;
	}

	public void setVelocidad_disparo(float velocidad_disparo) {
		this.velocidad_disparo = velocidad_disparo;
	}

	public float getTiempo_respuesta() {
		return tiempo_respuesta;
	}

	public void setTiempo_respuesta(float tiempo_respuesta) {
		this.tiempo_respuesta = tiempo_respuesta;
	}

	@ManyToOne
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFecha_at() {
		return fecha_at;
	}

	public void setFecha_at(Date fecha_at) {
		this.fecha_at = fecha_at;
	}

	public float getPrecision_disparo() {
		return precision_disparo;
	}

	public void setPrecision_disparo(float precision_disparo) {
		this.precision_disparo = precision_disparo;
	}

	public String getTipo_recepcion() {
		return tipo_recepcion;
	}

	public void setTipo_recepcion(String tipo_recepcion) {
		this.tipo_recepcion = tipo_recepcion;
	}
	
	
	
}
