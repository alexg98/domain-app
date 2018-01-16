package co.com.coomeva.sipas.core.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import co.com.coomeva.sipas.core.model.SipParametros;
import co.com.coomeva.sipas.util.annotations.EvictSession;

@Scope("singleton")
@Repository
public class SipParametroDao extends BaseHibernateDao<SipParametros> implements ISipParametroDao {
	
	public static final String TIP_COD = "id.tipCod";
	
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
	@EvictSession
	public Optional<SipParametros> getParametroPorTipCodCAndCodigo(Long id) {
		SipParametros parametros = findById(id);
		return Optional.of(parametros);
	}	
	
}