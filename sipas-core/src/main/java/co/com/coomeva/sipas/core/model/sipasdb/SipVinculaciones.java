package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Date;


/**
 * SipVinculaciones generated by MyEclipse - Hibernate Tools
 */
public class SipVinculaciones extends AbstractSipVinculaciones implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipVinculaciones() {
    }

	/** minimal constructor */
    public SipVinculaciones(Long codigo, SipVinculacionesClasificacion sipVinculacionesClasificacion, Long asoNumint, String vinAuxilioFunerario, String vinEstado, Date fechaRegistro) {
        super(codigo, sipVinculacionesClasificacion, asoNumint, vinAuxilioFunerario, vinEstado, fechaRegistro);        
    }
    
    /** full constructor */
    public SipVinculaciones(Long codigo, SipVinculacionesClasificacion sipVinculacionesClasificacion, SipColectivos sipColectivos, Long asoNumint, Double vinProteccionAcumulada, Double vinProteccionAcumuladaTotal, Double vinCuotaAcumulada, String vinDesc, String vinTipoCambio, String vinCumpleRangos, String vinAuxilioFunerario, String vinEstado, Date fechaRegistro, String usuario, Date vinFechaVinculacion, Date vinFechaRenuncia, Date vinFechaCambio, Date fechaMigracion, String vinIncrementoAnual, Double vinPerseveranciaAcumulada, Double vinRentaAcumulada, Double vinAltoCostoAcumulado, Double vinSolvenciasAcumulado,Long vinIndFechaNacimiento) {
        super(codigo, sipVinculacionesClasificacion, sipColectivos, asoNumint, vinProteccionAcumulada, vinProteccionAcumuladaTotal, vinCuotaAcumulada, vinDesc, vinTipoCambio, vinCumpleRangos, vinAuxilioFunerario, vinEstado, fechaRegistro, usuario, vinFechaVinculacion, vinFechaRenuncia, vinFechaCambio, fechaMigracion, vinIncrementoAnual, vinPerseveranciaAcumulada, vinRentaAcumulada, vinAltoCostoAcumulado, vinSolvenciasAcumulado,vinIndFechaNacimiento);        
    }
   
}
