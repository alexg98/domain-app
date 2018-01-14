package co.com.coomeva.sipas.core.model.sipasdb;

import java.sql.Timestamp;
import java.util.Date;


/**
 * SipSolicitudesRetencion entity. @author MyEclipse Persistence Tools
 */
public class SipSolicitudesRetencion extends AbstractSipSolicitudesRetencion implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipSolicitudesRetencion() {
    }

	/** minimal constructor */
    public SipSolicitudesRetencion(Long srtConsecutivo, Long srtAsoNumint, Long srtTipoSolicitud, Long srtProdCodigoMadre,Long srtProdCodigoHija, Long srtValorDeseado) {
        super(srtConsecutivo, srtAsoNumint, srtTipoSolicitud, srtProdCodigoMadre,srtProdCodigoHija, srtValorDeseado);        
    }
    
    /** full constructor */
    public SipSolicitudesRetencion(Long srtConsecutivo, Long srtProCodMadre,Long srtProCodHija, Long srtAsoNumint, Long srtTipoSolicitud, String srtPeriodoReliquidacion, Long srtProdCodigoMadre,Long srtProdCodigoHija, Long srtValorDeseado, Long srtAhorroRendimiento, Long srtNuevaCuota, Long srtNuevoFactor, String srtContribucionVida, Long srtMesesContVida, Long srtMesesAplazaSolv, Long srtValorCuotaVida, Long srtProteccionVida, Long srtEstadoRegistro,Timestamp srtFechaRegistro, String srtUsuario) {
        super(srtConsecutivo, srtProCodMadre,srtProCodHija, srtAsoNumint, srtTipoSolicitud, srtPeriodoReliquidacion, srtProdCodigoMadre,srtProdCodigoHija, srtValorDeseado, srtAhorroRendimiento, srtNuevaCuota, srtNuevoFactor, srtContribucionVida, srtMesesContVida, srtMesesAplazaSolv, srtValorCuotaVida, srtProteccionVida,srtEstadoRegistro, srtFechaRegistro, srtUsuario);        
    }
   
}
