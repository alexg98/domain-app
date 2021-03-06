package co.com.coomeva.sipas.core.model.sipasdb;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractSipDetalleDocumentosReq generated by MyEclipse - Hibernate Tools
 */

public abstract class AbstractSipDetalleDocumentosReq  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 3024877579513337474L;
	private SipDetalleDocumentosReqId id;
     private SipAuxilios sipAuxilios;
     private SipDocumentosRequeridos sipDocumentosRequeridos;
     private String docRecObservaciones;
     private Date docReqFechaEntrega;
     private Long docReqEstado;
     private String docReqOblig;
     private String detDocBenMenorPv;
     private String detDocBenMenorPm;
     private Set sipDetDocReclas = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractSipDetalleDocumentosReq() {
    }

	/** minimal constructor */
    public AbstractSipDetalleDocumentosReq(SipDetalleDocumentosReqId id, SipAuxilios sipAuxilios, SipDocumentosRequeridos sipDocumentosRequeridos, Long docReqEstado) {
        this.id = id;
        this.sipAuxilios = sipAuxilios;
        this.sipDocumentosRequeridos = sipDocumentosRequeridos;
        this.docReqEstado = docReqEstado;
    }
    
    /** full constructor */
    public AbstractSipDetalleDocumentosReq(SipDetalleDocumentosReqId id, SipAuxilios sipAuxilios, SipDocumentosRequeridos sipDocumentosRequeridos, String docRecObservaciones, Date docReqFechaEntrega, Long docReqEstado, String docReqOblig, String detDocBenMenorPv, String detDocBenMenorPm, Set sipDetDocReclas) {
        this.id = id;
        this.sipAuxilios = sipAuxilios;
        this.sipDocumentosRequeridos = sipDocumentosRequeridos;
        this.docRecObservaciones = docRecObservaciones;
        this.docReqFechaEntrega = docReqFechaEntrega;
        this.docReqEstado = docReqEstado;
        this.docReqOblig = docReqOblig;
        this.detDocBenMenorPv = detDocBenMenorPv;
        this.detDocBenMenorPm = detDocBenMenorPm;
        this.sipDetDocReclas = sipDetDocReclas;
    }

   
    // Property accessors

    public SipDetalleDocumentosReqId getId() {
        return this.id;
    }
    
    public void setId(SipDetalleDocumentosReqId id) {
        this.id = id;
    }

    public SipAuxilios getSipAuxilios() {
        return this.sipAuxilios;
    }
    
    public void setSipAuxilios(SipAuxilios sipAuxilios) {
        this.sipAuxilios = sipAuxilios;
    }

    public SipDocumentosRequeridos getSipDocumentosRequeridos() {
        return this.sipDocumentosRequeridos;
    }
    
    public void setSipDocumentosRequeridos(SipDocumentosRequeridos sipDocumentosRequeridos) {
        this.sipDocumentosRequeridos = sipDocumentosRequeridos;
    }

    public String getDocRecObservaciones() {
        return this.docRecObservaciones;
    }
    
    public void setDocRecObservaciones(String docRecObservaciones) {
        this.docRecObservaciones = docRecObservaciones;
    }

    public Date getDocReqFechaEntrega() {
        return this.docReqFechaEntrega;
    }
    
    public void setDocReqFechaEntrega(Date docReqFechaEntrega) {
        this.docReqFechaEntrega = docReqFechaEntrega;
    }

    public Long getDocReqEstado() {
        return this.docReqEstado;
    }
    
    public void setDocReqEstado(Long docReqEstado) {
        this.docReqEstado = docReqEstado;
    }

    public String getDocReqOblig() {
        return this.docReqOblig;
    }
    
    public void setDocReqOblig(String docReqOblig) {
        this.docReqOblig = docReqOblig;
    }

    public String getDetDocBenMenorPv() {
        return this.detDocBenMenorPv;
    }
    
    public void setDetDocBenMenorPv(String detDocBenMenorPv) {
        this.detDocBenMenorPv = detDocBenMenorPv;
    }

    public String getDetDocBenMenorPm() {
        return this.detDocBenMenorPm;
    }
    
    public void setDetDocBenMenorPm(String detDocBenMenorPm) {
        this.detDocBenMenorPm = detDocBenMenorPm;
    }

    public Set getSipDetDocReclas() {
        return this.sipDetDocReclas;
    }
    
    public void setSipDetDocReclas(Set sipDetDocReclas) {
        this.sipDetDocReclas = sipDetDocReclas;
    }
   








}