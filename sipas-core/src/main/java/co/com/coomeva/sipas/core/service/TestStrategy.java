package co.com.coomeva.sipas.core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import co.com.coomeva.sipas.core.dao.ISipParametroDao;
import co.com.coomeva.sipas.core.dao.SipParametroDao;
import co.com.coomeva.sipas.core.model.SipParametros;
import co.com.coomeva.sipas.core.model.SipParametrosId;


/**
 * see https://www.adictosaltrabajo.com/tutoriales/java-util-optional-un-pequeno-tutorial-practico/ 
 * @author alge3325
 *
 */
class A{
	String version() {
		return "1.0";
	}
}

class B{
	A a;
	
	String getA() {
		return null;//Optional.empty();
	}
}

class C{
	B b;
	
	Optional<B> getB() {
		return Optional.empty();
	}
}

//@PropertySource(value = { "classpath:parametros_generales.properties" })
public class TestStrategy {

	@Autowired
	private Environment env;
	
	private static ISipParametroDao sipParametroDao;
		
	public void validate() {
		 Long valor1 = env.getProperty("factores.edad.maxima", Long.class);
		 String valor2 = env.getProperty("factores.edad.maxima", String.class);		 
	}
	
	public void readFileHbm() {
		sipParametroDao.findByProperty(SipParametroDao.TIP_COD ,120);
	}
	
	public static void main(String[] args) {}

}

class Post{
	public String getCreator() {
		return null;
	}
	
	public int getRating(){
		return 0;
	}
}

class Session{
	public String getUser(){
		return null;
	}
}

@FunctionalInterface
interface ValidationCondition {
    Optional<String> validate(final Post post, final Session session, final Environment env);
}

class CreatorValidation implements ValidationCondition {

    public Optional<String> validate(final Post post, final Session session,final Environment env) {
        if (post.getCreator().equals(session.getUser())) {
            return Optional.empty();
        }
        return Optional.of("You should be owner of the post");
    }    
}

class ScoreValidation implements ValidationCondition {

    public Optional<String> validate(final Post post, final Session session,final Environment env) {
        if (post.getCreator().equals(session.getUser())) {
            return Optional.empty();
        }
        return Optional.of("You should be owner of the post");
    }    
}