package co.com.coomeva.sipas.core.model.sipasdb;



/**
 * SipEstudiosCuentaDetalle entity. @author MyEclipse Persistence Tools
 */
public class SipEstudiosCuentaDetalle extends AbstractSipEstudiosCuentaDetalle implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipEstudiosCuentaDetalle() {
    }

	/** minimal constructor */
    public SipEstudiosCuentaDetalle(SipEstudiosCuentaDetalleId id) {
        super(id);        
    }
    
    /** full constructor */
    public SipEstudiosCuentaDetalle(SipEstudiosCuentaDetalleId id, String estDetMesIncremento, Integer estDetAgno, Double estDetValorProteccion, Long estDetVpSmmlv, Double estDetProValorSmmlv, Double estDetFactorSimple, Double estDetCuotaSimple, Double estDetFactorDoble, Double estDetCuotaDoble, Double estDetValorPagadoReal, Long estDetMesesPago,Double estDetCodFactor) {
        super(id, estDetMesIncremento, estDetAgno, estDetValorProteccion, estDetVpSmmlv, estDetProValorSmmlv, estDetFactorSimple, estDetCuotaSimple, estDetFactorDoble, estDetCuotaDoble, estDetValorPagadoReal, estDetMesesPago,estDetCodFactor);        
    }
   
}
