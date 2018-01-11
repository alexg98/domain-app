package co.com.coomeva.sipas.core.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import co.com.coomeva.sipas.core.model.SipParametros;

@Scope("singleton")
@Repository
public class SipParametroDao extends BaseHibernateDao<SipParametros> implements ISipParametroDao {

	@Autowired
	public SipParametroDao(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super(SipParametros.class, sessionFactory);
	}

	/**
	 * Prueba de 
	 */
	@Override
	public List<SipParametros> test() {
		return getCurrentSession().createQuery("select model from SipParametros model where model.id.tipCod = 3").list();		
	}

	@Override
	public Optional<SipParametros> getParametroPorTipCodCAndCodigo(Long id) {
		SipParametros parametros = findById(id);
		return Optional.of(parametros);
	}
	
	
}