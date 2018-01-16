package co.com.coomeva.sipas.core.service.protecciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.coomeva.sipas.core.dao.ISipProteccionesDao;
import co.com.coomeva.sipas.core.enums.EnumAcumulado;
import co.com.coomeva.sipas.core.factory.ValidadorProteccionesFactory;
import co.com.coomeva.sipas.core.model.sipasdb.SipProtecciones;
import co.com.coomeva.sipas.core.validaciones.protecciones.ValidadorProtecciones;
import co.com.coomeva.sipas.util.annotations.EvictSession;
/**
 * Clase encargada de la administracion de las protecciones
 * @author alge3325
 * {@linkplain} https://coomeva.com.co/doumentacion/repositorio
 */
@Service
@Transactional(readOnly = true)
public class ProteccionServiceImpl implements ProteccionService{
	
	@Autowired
    private ValidadorProteccionesFactory serviceLocatedFactory;
	
	@Autowired
	ISipProteccionesDao dao;
	
	@Override
	public void registrarIncremento() {		
		Long asoNumint = 45454l;
		EnumAcumulado.ADICIONAL.getAcumuladoByAsociado(asoNumint); 
		
		ValidadorProtecciones valid = serviceLocatedFactory.get("prodcodigo_99");
		valid.validaCondicionesRegistro(null);	
	}

	@Override
	@EvictSession
	public List<SipProtecciones> getProteccioneByAsonumint(Long asoNumint) {		
		return dao.findByProperty(ISipProteccionesDao.ASO_NUMINT , asoNumint);
	}
}
