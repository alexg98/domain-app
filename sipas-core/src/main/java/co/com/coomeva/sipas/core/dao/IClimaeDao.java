package co.com.coomeva.sipas.core.dao;

import co.com.coomeva.sipas.core.model.sipasdb.Climae;
import co.com.coomeva.sipas.core.model.sipasdb.ClimaeDetallado;
import co.com.coomeva.sipas.databaseutil.dao.IAbstractSipasDAO;


public interface IClimaeDao extends IAbstractSipasDAO<Climae>{
	
	ClimaeDetallado getClimaeDetallado(Long numint); 

}
