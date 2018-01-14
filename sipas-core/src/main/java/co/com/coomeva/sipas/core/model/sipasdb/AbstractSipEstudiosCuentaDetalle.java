package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * AbstractSipEstudiosCuentaDetalle entity provides the base persistence definition of the SipEstudiosCuentaDetalle entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSipEstudiosCuentaDetalle  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -2965388539124872520L;
	private SipEstudiosCuentaDetalleId id;
     private String estDetMesIncremento;
     private Integer estDetAgno;
     private Double estDetValorProteccion;
     private Long estDetVpSmmlv;
     private Double estDetProValorSmmlv;
     private Double estDetFactorSimple;
     private Double estDetCuotaSimple;
     private Double estDetFactorDoble;
     private Double estDetCuotaDoble;
     private Double estDetValorPagadoReal;
     private Long estDetMesesPago;
     private Double estDetCodFactor;


    // Constructors

    /** default constructor */
    public AbstractSipEstudiosCuentaDetalle() {
    }

	/** minimal constructor */
    public AbstractSipEstudiosCuentaDetalle(SipEstudiosCuentaDetalleId id) {
        this.id = id;
    }
    
    /** full constructor */
    public AbstractSipEstudiosCuentaDetalle(SipEstudiosCuentaDetalleId id, String estDetMesIncremento, Integer estDetAgno, Double estDetValorProteccion, Long estDetVpSmmlv, Double estDetProValorSmmlv, Double estDetFactorSimple, Double estDetCuotaSimple, Double estDetFactorDoble, Double estDetCuotaDoble, Double estDetValorPagadoReal, Long estDetMesesPago,Double estDetCodFactor) {
        this.id = id;
        this.estDetMesIncremento = estDetMesIncremento;
        this.estDetAgno = estDetAgno;
        this.estDetValorProteccion = estDetValorProteccion;
        this.estDetVpSmmlv = estDetVpSmmlv;
        this.estDetProValorSmmlv = estDetProValorSmmlv;
        this.estDetFactorSimple = estDetFactorSimple;
        this.estDetCuotaSimple = estDetCuotaSimple;
        this.estDetFactorDoble = estDetFactorDoble;
        this.estDetCuotaDoble = estDetCuotaDoble;
        this.estDetValorPagadoReal = estDetValorPagadoReal;
        this.estDetMesesPago = estDetMesesPago;
        this.estDetCodFactor=estDetCodFactor;
    }

   
    // Property accessors

    public SipEstudiosCuentaDetalleId getId() {
        return this.id;
    }
    
    public void setId(SipEstudiosCuentaDetalleId id) {
        this.id = id;
    }

    public String getEstDetMesIncremento() {
        return this.estDetMesIncremento;
    }
    
    public void setEstDetMesIncremento(String estDetMesIncremento) {
        this.estDetMesIncremento = estDetMesIncremento;
    }

    public Integer getEstDetAgno() {
        return this.estDetAgno;
    }
    
    public void setEstDetAgno(Integer estDetAgno) {
        this.estDetAgno = estDetAgno;
    }

    public Double getEstDetValorProteccion() {
        return this.estDetValorProteccion;
    }
    
    public void setEstDetValorProteccion(Double estDetValorProteccion) {
        this.estDetValorProteccion = estDetValorProteccion;
    }

    public Long getEstDetVpSmmlv() {
        return this.estDetVpSmmlv;
    }
    
    public void setEstDetVpSmmlv(Long estDetVpSmmlv) {
        this.estDetVpSmmlv = estDetVpSmmlv;
    }

    public Double getEstDetProValorSmmlv() {
        return this.estDetProValorSmmlv;
    }
    
    public void setEstDetProValorSmmlv(Double estDetProValorSmmlv) {
        this.estDetProValorSmmlv = estDetProValorSmmlv;
    }

    public Double getEstDetFactorSimple() {
        return this.estDetFactorSimple;
    }
    
    public void setEstDetFactorSimple(Double estDetFactorSimple) {
        this.estDetFactorSimple = estDetFactorSimple;
    }

    public Double getEstDetCuotaSimple() {
        return this.estDetCuotaSimple;
    }
    
    public void setEstDetCuotaSimple(Double estDetCuotaSimple) {
        this.estDetCuotaSimple = estDetCuotaSimple;
    }

    public Double getEstDetFactorDoble() {
        return this.estDetFactorDoble;
    }
    
    public void setEstDetFactorDoble(Double estDetFactorDoble) {
        this.estDetFactorDoble = estDetFactorDoble;
    }

    public Double getEstDetCuotaDoble() {
        return this.estDetCuotaDoble;
    }
    
    public void setEstDetCuotaDoble(Double estDetCuotaDoble) {
        this.estDetCuotaDoble = estDetCuotaDoble;
    }

    public Double getEstDetValorPagadoReal() {
        return this.estDetValorPagadoReal;
    }
    
    public void setEstDetValorPagadoReal(Double estDetValorPagadoReal) {
        this.estDetValorPagadoReal = estDetValorPagadoReal;
    }

    public Long getEstDetMesesPago() {
        return this.estDetMesesPago;
    }
    
    public void setEstDetMesesPago(Long estDetMesesPago) {
        this.estDetMesesPago = estDetMesesPago;
    }

	public void setEstDetCodFactor(Double estDetCodFactor) {
		this.estDetCodFactor = estDetCodFactor;
	}

	public Double getEstDetCodFactor() {
		return estDetCodFactor;
	}
   








}