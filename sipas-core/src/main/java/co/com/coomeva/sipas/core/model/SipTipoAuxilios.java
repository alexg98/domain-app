package co.com.coomeva.sipas.core.model;


public class SipTipoAuxilios  implements java.io.Serializable {

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long tipIdTipoAuxilio;
     private String tipDescripcion;
     private String tipEstado;

    // Constructors

    /** default constructor */
    public SipTipoAuxilios() {
    }

	/** minimal constructor */
    public SipTipoAuxilios(Long tipIdTipoAuxilio) {
        this.tipIdTipoAuxilio = tipIdTipoAuxilio;
    }
    
    /** full constructor */
    public SipTipoAuxilios(Long tipIdTipoAuxilio, String tipDescripcion, String tipEstado) {
        this.tipIdTipoAuxilio = tipIdTipoAuxilio;
        this.tipDescripcion = tipDescripcion;
        this.tipEstado = tipEstado;
    }
   
    // Property accessors

    public Long getTipIdTipoAuxilio() {
        return this.tipIdTipoAuxilio;
    }
    
    public String getTipEstado() {
		return tipEstado;
	}

	public void setTipEstado(String tipEstado) {
		this.tipEstado = tipEstado;
	}

	public void setTipIdTipoAuxilio(Long tipIdTipoAuxilio) {
        this.tipIdTipoAuxilio = tipIdTipoAuxilio;
    }

    public String getTipDescripcion() {
        return this.tipDescripcion;
    }
    
    public void setTipDescripcion(String tipDescripcion) {
        this.tipDescripcion = tipDescripcion;
    }
   








}