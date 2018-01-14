package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * AbstractSipDetalleDistribucion generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipDetalleDistribucion  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1877443922503352175L;
	private SipDetalleDistribucionId id;
     private SipLiquidaciones sipLiquidaciones;
     private SipBeneficiariosPago sipBeneficiariosPago;
     private Double detDisPorcenDist;
     private Long detDisValorDist;
     private Long detDistNumCta;
     private Long detDistAgenCob;
     private String detCuentaDepositoAp;


    // Constructors

    /** default constructor */
    public AbstractSipDetalleDistribucion() {
    }

	/** minimal constructor */
    public AbstractSipDetalleDistribucion(SipDetalleDistribucionId id, SipLiquidaciones sipLiquidaciones,SipBeneficiariosPago sipBeneficiariosPago, Double detDisPorcenDist, Long detDisValorDist) {
        this.id = id;
        this.sipBeneficiariosPago = sipBeneficiariosPago;
        this.detDisPorcenDist = detDisPorcenDist;
        this.detDisValorDist = detDisValorDist;
        this.sipLiquidaciones=sipLiquidaciones;
    }
    
    /** full constructor */
    public AbstractSipDetalleDistribucion(SipDetalleDistribucionId id, SipBeneficiariosPago sipBeneficiariosPago, Double detDisPorcenDist, Long detDisValorDist, Long detDistNumCta, Long detDistAgenCob,String detCuentaDepositoAp) {
        this.id = id;
        this.sipBeneficiariosPago = sipBeneficiariosPago;
        this.detDisPorcenDist = detDisPorcenDist;
        this.detDisValorDist = detDisValorDist;
        this.detDistNumCta = detDistNumCta;
        this.detDistAgenCob = detDistAgenCob;
        this.detCuentaDepositoAp=detCuentaDepositoAp;
    }

   
    // Property accessors

    public SipDetalleDistribucionId getId() {
        return this.id;
    }
    
    public void setId(SipDetalleDistribucionId id) {
        this.id = id;
    }

    public SipBeneficiariosPago getSipBeneficiariosPago() {
        return this.sipBeneficiariosPago;
    }
    
    public void setSipBeneficiariosPago(SipBeneficiariosPago sipBeneficiariosPago) {
        this.sipBeneficiariosPago = sipBeneficiariosPago;
    }

    public Double getDetDisPorcenDist() {
        return this.detDisPorcenDist;
    }
    
    public void setDetDisPorcenDist(Double detDisPorcenDist) {
        this.detDisPorcenDist = detDisPorcenDist;
    }

    public Long getDetDisValorDist() {
        return this.detDisValorDist;
    }
    
    public void setDetDisValorDist(Long detDisValorDist) {
        this.detDisValorDist = detDisValorDist;
    }

    public Long getDetDistNumCta() {
        return this.detDistNumCta;
    }
    
    public void setDetDistNumCta(Long detDistNumCta) {
        this.detDistNumCta = detDistNumCta;
    }

    public Long getDetDistAgenCob() {
        return this.detDistAgenCob;
    }
    
    public void setDetDistAgenCob(Long detDistAgenCob) {
        this.detDistAgenCob = detDistAgenCob;
    }

	public SipLiquidaciones getSipLiquidaciones() {
		return sipLiquidaciones;
	}

	public void setSipLiquidaciones(SipLiquidaciones sipLiquidaciones) {
		this.sipLiquidaciones = sipLiquidaciones;
	}

	public void setDetCuentaDepositoAp(String detCuentaDepositoAp) {
		this.detCuentaDepositoAp = detCuentaDepositoAp;
	}

	public String getDetCuentaDepositoAp() {
		return detCuentaDepositoAp;
	}
   








}