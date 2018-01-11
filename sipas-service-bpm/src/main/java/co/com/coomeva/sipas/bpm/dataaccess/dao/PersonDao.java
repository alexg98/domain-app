package co.com.coomeva.sipas.bpm.dataaccess.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import co.com.coomeva.sipas.bpm.model.Person;


@Scope("singleton")
@Repository("personDao")
public class PersonDao extends BaseHibernateDao<Person> implements IPersonDao {
		
	/** Constant IDFILES. */
	public static final String ID = "id";
	
	@Autowired
	public PersonDao(@Qualifier("sessionBpmFactory") SessionFactory sessionBpmFactory) {
		super(Person.class, sessionBpmFactory);		
	}
}