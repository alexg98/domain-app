package co.com.coomeva.sipas.core.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import co.com.coomeva.sipas.core.enums.EnumNamedQuerySipasdb;
import co.com.coomeva.sipas.core.model.sipasdb.Climae;
import co.com.coomeva.sipas.core.model.sipasdb.ClimaeDetallado;
import co.com.coomeva.sipas.util.excepciones.NotFoundRuntimeExceptionSipas;


@PropertySource(value = { "classpath:msg_excepciones.properties" })
@Scope("singleton")
@Repository
public class ClimaeDao extends BaseHibernateDao<Climae> implements IClimaeDao {
	
	/** Constant IDFILES. */
	public static final String ID = "id";
	
	@Autowired
	private Environment env;
	
	@Autowired
	public ClimaeDao(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super(Climae.class, sessionFactory);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public ClimaeDetallado getClimaeDetallado(Long numint) {
		SQLQuery query = (SQLQuery)getCurrentSession().getNamedQuery(EnumNamedQuerySipasdb.GET_CLIMAE_DETALLE_ASOCIADO.toString() );
		List<ClimaeDetallado> result = query.addEntity(ClimaeDetallado.class).
				setLong("numint", numint).setParameter("asociao", "1").
				setCacheable(true).list();  
		
		return Optional.of(result.get(0))
				.orElseThrow(
				() -> new NotFoundRuntimeExceptionSipas(env.getProperty("excepcion.sipas.not.found.climae.detallado", String.class)) );
	}
}