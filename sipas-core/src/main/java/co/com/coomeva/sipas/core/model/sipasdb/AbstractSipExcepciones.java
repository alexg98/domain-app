package co.com.coomeva.sipas.core.model.sipasdb;

import java.io.Serializable;

public abstract class AbstractSipExcepciones implements Serializable {
	
		 /**
	 * 
	 */
	private static final long serialVersionUID = 8311682654305306354L;
		private Long excCodigo;
	     private String excDescripcion;
	     private String excMensaje;
	     private Long excEstado;
	     private Long excTipoFlujo;
	     
	     /** default constructor */
	    public AbstractSipExcepciones() {
	    }

	    /** minimal constructor */
	    public AbstractSipExcepciones(Long excCodigo, Long excTipoFlujo) {
	        this.excCodigo = excCodigo;
	        this.excTipoFlujo = excTipoFlujo;
	    }
	    
	    /** full constructor */
	    public AbstractSipExcepciones(Long excCodigo, String excDescripcion, String excMensaje, Long excEstado, Long excTipoFlujo) {
	       this.excCodigo = excCodigo;
	       this.excDescripcion = excDescripcion;
	       this.excMensaje = excMensaje;
	       this.excEstado = excEstado;
	       this.excTipoFlujo = excTipoFlujo;
	    }

	    public AbstractSipExcepciones(Long excCodigo, String excMensaje) {
	    	this.excCodigo = excCodigo;
	    	this.excMensaje = excMensaje;		       
	    }
	    
	    public Long getExcCodigo() {
	        return this.excCodigo;
	    }
	    
	    public void setExcCodigo(Long excCodigo) {
	        this.excCodigo = excCodigo;
	    }
	    public String getExcDescripcion() {
	        return this.excDescripcion;
	    }
	    
	    public void setExcDescripcion(String excDescripcion) {
	        this.excDescripcion = excDescripcion;
	    }
	    public String getExcMensaje() {
	        return this.excMensaje;
	    }
	    
	    public void setExcMensaje(String excMensaje) {
	        this.excMensaje = excMensaje;
	    }
	    public Long getExcEstado() {
	        return this.excEstado;
	    }
	    
	    public void setExcEstado(Long excEstado) {
	        this.excEstado = excEstado;
	    }
	    public Long getExcTipoFlujo() {
	        return this.excTipoFlujo;
	    }
	    
	    public void setExcTipoFlujo(Long excTipoFlujo) {
	        this.excTipoFlujo = excTipoFlujo;
	    }

}
