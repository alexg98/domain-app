package co.com.coomeva.sipas.core.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import co.com.coomeva.sipas.core.model.User;

@Scope("singleton")
@Repository
public class UserDao extends BaseHibernateDao<User> implements IUserDao {
	
	/** Constant IDFILES. */
	public static final String ID = "id";
	
	@Autowired
	public UserDao(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super(User.class, sessionFactory);		
	}
}