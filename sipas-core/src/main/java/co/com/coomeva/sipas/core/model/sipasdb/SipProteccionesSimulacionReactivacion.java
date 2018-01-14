package co.com.coomeva.sipas.core.model.sipasdb;


import java.util.Date;
import java.util.Set;

/**
 * SipProteccionesSimulacionReactivacion entity. @author MyEclipse Persistence
 * Tools
 */
public class SipProteccionesSimulacionReactivacion extends
		AbstractSipProteccionesSimulacionReactivacion implements
		java.io.Serializable, Comparable<SipProteccionesSimulacionReactivacion> {

	// Constructors

	/** default constructor */
	public SipProteccionesSimulacionReactivacion() {
	}

	/** minimal constructor */
	public SipProteccionesSimulacionReactivacion(
			SipProteccionesSimulacionReactivacionId id,
			Long psrConsecutivoProteccion, Long psrProCod,
			String psrProdDescripcion, Long psrValorMora) {
		super(id, psrConsecutivoProteccion, psrProCod, psrProdDescripcion,
				psrValorMora);
	}

	/** full constructor */
	public SipProteccionesSimulacionReactivacion(
			SipProteccionesSimulacionReactivacionId id,
			Long psrConsecutivoProteccion, Long psrProCod,
			Short psrProdCodigo, String psrProdDescripcion, Long psrProValor,
			Long psrProCuotaContribucion, Long psrProValorNuevo,
			Long psrContribucionNueva, Date psrProFechaIngProteccion,
			Long psrSaldoFactura, Long psrValorMora, String psrProObservacion,
			Set sipCuotasSimulacionReactivacions,String psrProAdicional,Long psrValorMoraOculto) {
		super(id, psrConsecutivoProteccion, psrProCod, psrProdCodigo,
				psrProdDescripcion, psrProValor, psrProCuotaContribucion,
				psrProValorNuevo, psrContribucionNueva,
				psrProFechaIngProteccion, psrSaldoFactura, psrValorMora,
				psrProObservacion, sipCuotasSimulacionReactivacions,psrProAdicional,psrValorMoraOculto);
	}

	public int compareTo(SipProteccionesSimulacionReactivacion o) {
		// TODO Auto-generated method stub
		return o.getPsrProCod().compareTo(getPsrProCod());
	}

}
