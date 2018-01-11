package co.com.coomeva.sipas.core.dao;

import java.util.List;
import java.util.Optional;

import co.com.coomeva.sipas.core.model.SipParametros;
import co.com.coomeva.sipas.databaseutil.dao.IAbstractDomainexampleDAO;

public interface ISipParametroDao extends IAbstractDomainexampleDAO<SipParametros>{

	List<SipParametros> test();
	
	Optional<SipParametros> getParametroPorTipCodCAndCodigo(Long codigo);
}
