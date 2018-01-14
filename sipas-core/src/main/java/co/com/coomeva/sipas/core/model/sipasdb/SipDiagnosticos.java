package co.com.coomeva.sipas.core.model.sipasdb;
// Generated by MyEclipse - Hibernate Tools

import java.util.Set;


/**
 * SipDiagnosticos generated by MyEclipse - Hibernate Tools
 */
public class SipDiagnosticos extends AbstractSipDiagnosticos implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public SipDiagnosticos() {
    }

	/** minimal constructor */
    public SipDiagnosticos(String diagCod, String diagDesc, String diaEstado) {
        super(diagCod, diagDesc, diaEstado);        
    }
    
    /** medium constructor */
    public SipDiagnosticos(String diagCod, String diagDesc, String diaEstado, Long diagDiasMinimo, Long diagDiasMaximo, Double diagPuntaje, Set sipEnfermedadAltoCostos, Set sipPreexistenciases) {
        super(diagCod, diagDesc, diaEstado, diagDiasMinimo, diagDiasMaximo, diagPuntaje, sipEnfermedadAltoCostos, sipPreexistenciases);        
    }
    
    
    public SipDiagnosticos(String diagCod, String diagDesc, String diaEstado, Long diagDiasMinimo, Long diagDiasMaximo, Double diagPuntaje, String diagObservaciones, String diagAutomatico, Long diagDiasPertinencia,Set sipEnfermedadAltoCostos, Set sipPreexistenciases) {
        super(diagCod, diagDesc, diaEstado, diagDiasMinimo, diagDiasMaximo, diagPuntaje,diagObservaciones,diagAutomatico,diagDiasPertinencia, sipEnfermedadAltoCostos, sipPreexistenciases);        
    }   
}
