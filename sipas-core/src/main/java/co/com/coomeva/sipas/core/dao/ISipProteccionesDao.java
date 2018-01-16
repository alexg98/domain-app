package co.com.coomeva.sipas.core.dao;

import java.util.List;

import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;
import co.com.coomeva.sipas.databaseutil.dao.IAbstractSipasDAO;


public interface ISipProteccionesDao extends IAbstractSipasDAO<SipProtecciones>{
	
	public static final String ASO_NUMINT = "asoNumint";
	
	List<SipProtecciones> getProteccionesActivasByAsegurabilida(Long asoNumint, Long aseCodigo);

}
