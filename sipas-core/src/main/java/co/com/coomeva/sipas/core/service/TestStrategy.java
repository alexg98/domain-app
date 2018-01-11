package co.com.coomeva.sipas.core.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import co.com.coomeva.sipas.core.dao.ISipParametroDao;
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
	
	
	
	public static void main(String[] args) {
		Post post = new Post();
		Session session = new Session();
		/**
		if (post.getCreator().equals(session.getUser())) {
			  if (post.getRating() < 50) {
			    //postRepository.delete(post);
			  } else errors.add(400, "Cant delete post with rating 50 or higher")
			} else errors add (400, "You should be owner of the post")
		*/	
		
		C claseC =  new C();
		
		Optional<C> validar = Optional.of(claseC);		
		
		String valor = validar.flatMap(C::getB).map(B::getA).orElse("Sin version");				
		
		Optional<SipParametros> param = sipParametroDao.getParametroPorTipCodCAndCodigo(1l);
		
		String nombreParametro = param.map(SipParametros::getNombre).orElse("sin nombre");
		param.map(SipParametros::getNombreCorto).orElseThrow(() -> new IllegalArgumentException("Campo vacio, por favor validar") );
		
		//Long tipCod = param.filter(predicate)
		
		//flatMap(SipParametros::getId)
		//Sie el valor no es vacio		
		param.ifPresent(s -> System.out.println("valor de " + s) );		
				
		
		
		String version = computer.flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUSB)
                .map(USB::getVersion)
                .orElse("UNKNOWN");
		
		
		final List<ValidationCondition> conditions = new ArrayList<>();
    	conditions.add(new CreatorValidation());
    	conditions.add(new ScoreValidation());
    	
    	final List<String> errors = new ArrayList<>();

    	/*
    	for (final ValidationCondition condition : conditions) {
    	    final Optional<String> error = condition.validate(post, session, env);
    	    if (error.isPresent()) {
    	        errors.add(error. get());
    	    }
    	}
    	*/
    	System.out.println();
    	/**
    	 * La mayoria de consultas se realizan hacia la base de datos consultando la existencia de algun registro
    	 * Tipo de validaciones:
    	 * - De base de datos
    	 * - De condiciones de negocio
    	 */
    	// Valida si asociado esta en 
    	final ValidationCondition validarEdadMaxima  = (post1, session1, env) -> {
    	    return post1.getCreator().equals(session1.getUser()) ? Optional.empty() : Optional.of("Asociado no cuenta con la proteccion");
    	};
    	
    	final ValidationCondition validarExistenciaProteccion  = (post1, session1, env) -> {
    		return post.getCreator().equals(env.getProperty("factores.edad.maxima",String.class) ) ? Optional.empty() : Optional.of("Asociado no cuenta con la proteccion"); 
    	};
    	
    	ValidationCondition validarEdadMinimaproteccion  = (post1, session1, env) -> {    		
    	    return post1.getCreator().equals(session1.getUser()) ? Optional.empty() : Optional.of("Asociado no cuenta con la proteccion");
    	};
    	
    	
    	final List<ValidationCondition> conditions2 = new ArrayList<>();
    	conditions.add(validarEdadMaxima);
    	conditions.add(validarExistenciaProteccion);
    	conditions.add(validarEdadMinimaproteccion);
    /*	
    	List<SipParametros> list = sipParametroDao.findAll();
    	Optional<List<SipParametros>> valor = Optional.of(list);
    	valor.ifPresent(consumer);
    	
    	
    //	source.ifPresent(s -> doSomethingWith(s));
    	
    	
    	//-- validar uso de optional para la simplifiacion de resultados    	
    	
    	Optional req = options.requires.stream()
    			  .filter(mn -> !modules.containsKey(mn))
    			  .findFirst();
    			if (req.isPresent()) {
    			  throw new BadArgs("err.module.not.found", req.get());
    			}
    			
    			Optional req = options.requires.stream()
    					  .filter(mn -> !modules.containsKey(mn))
    					  .findFirst();
    					if (req.isPresent()) {
    					  throw new BadArgs("err.module.not.found", req.get());
    					}
    					*/
	}

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