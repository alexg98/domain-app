package co.com.coomeva.sipas.core.model;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipParametros generated by MyEclipse - Hibernate Tools
 */

public class SipParametros  implements java.io.Serializable, Comparable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -3410084026909427766L;
	private SipParametrosId id;
     private SipParametrosTipo sipParametrosTipo;
     private String nombre;
     private String nombreCorto;
     private String estado;
     private Double valor;
     private Set sipFactoreses = new HashSet(0);


    // Constructors

    /** default constructor */
    public SipParametros() {
    }

	/** minimal constructor */
    public SipParametros(SipParametrosId id, SipParametrosTipo sipParametrosTipo, String nombre) {
        this.id = id;
        this.sipParametrosTipo = sipParametrosTipo;
        this.nombre = nombre;
    }
    
    /** full constructor */
    public SipParametros(SipParametrosId id, SipParametrosTipo sipParametrosTipo, String nombre, String nombreCorto, String estado, Double valor, Set sipFactoreses) {
        this.id = id;
        this.sipParametrosTipo = sipParametrosTipo;
        this.nombre = nombre;
        this.nombreCorto = nombreCorto;
        this.estado = estado;
        this.valor = valor;
        this.sipFactoreses = sipFactoreses;
    }

   
    // Property accessors

    public SipParametrosId getId() {
        return this.id;
    }
    
    public void setId(SipParametrosId id) {
        this.id = id;
    }

    public SipParametrosTipo getSipParametrosTipo() {
        return this.sipParametrosTipo;
    }
    
    public void setSipParametrosTipo(SipParametrosTipo sipParametrosTipo) {
        this.sipParametrosTipo = sipParametrosTipo;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCorto() {
        return this.nombreCorto;
    }
    
    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getValor() {
        return this.valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}