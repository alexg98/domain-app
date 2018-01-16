package co.com.coomeva.sipas.core.service.protecciones;

import java.util.List;

import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;

public interface ProteccionService {

	void registrarIncremento();
	
	List<SipProtecciones> getProteccioneByAsonumint(Long asoNumint);	
}
