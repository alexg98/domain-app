package co.com.coomeva.sipas.core.service.protecciones;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.coomeva.sipas.core.enums.EnumAcumulado;
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
	@Override
	public void registrarIncremento() {
		
		
		
		Long asoNumint = null;
		EnumAcumulado.ADICIONAL.getAcumuladoByAsociado(asoNumint); //Obtener el 
		
		
	}

}
