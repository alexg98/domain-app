package co.com.coomeva.sipas.core.model.sipasdb;
// default package

import java.sql.Timestamp;


/**
 * SipCertificadosRecaudo entity. @author MyEclipse Persistence Tools
 */
public class SipCertificadosRecaudo extends AbstractSipCertificadosRecaudo implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipCertificadosRecaudo() {
    }

	/** minimal constructor */
    public SipCertificadosRecaudo(Long cerConsecutivo, Long cerAsonumint, Long cerNitcli, Integer cerConsecutivoCertificado, Integer cerTipoCertificado) {
        super(cerConsecutivo, cerAsonumint, cerNitcli, cerConsecutivoCertificado, cerTipoCertificado);        
    }
    
    /** full constructor */
    public SipCertificadosRecaudo(Long cerConsecutivo, Long cerAsonumint, Long cerNitcli, Integer cerConsecutivoCertificado, Integer cerTipoCertificado, Timestamp cerFechaGeneracion) {
        super(cerConsecutivo, cerAsonumint, cerNitcli, cerConsecutivoCertificado, cerTipoCertificado, cerFechaGeneracion);        
    }
   
}
