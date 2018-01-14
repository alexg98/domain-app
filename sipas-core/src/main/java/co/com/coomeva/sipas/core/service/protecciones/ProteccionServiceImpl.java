package co.com.coomeva.sipas.core.service.protecciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.coomeva.sipas.core.enums.EnumAcumulado;
import co.com.coomeva.sipas.core.factory.ValidadorProteccionesFactory;
import co.com.coomeva.sipas.core.validaciones.protecciones.ValidadorProtecciones;
/**
 * Clase encargada de la administracion de las protecciones
 * @author alge3325
 * {@linkplain} https://coomeva.com.co/doumentacion/repositorio
 */
@Service
@Transactional(readOnly = true)
public class ProteccionServiceImpl implements ProteccionService{
	
	/**
	 * 
	 */
	
	@Autowired
    private ValidadorProteccionesFactory serviceLocatedFactory;
	
	@Override
	public void registrarIncremento() {		
		Long asoNumint = null;
		EnumAcumulado.ADICIONAL.getAcumuladoByAsociado(asoNumint); 
		
		ValidadorProtecciones valid = serviceLocatedFactory.get("prodcodigo_99");
		valid.validaCondicionesRegistro(null);
		
	}

}
