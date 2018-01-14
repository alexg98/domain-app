package co.com.coomeva.sipas.core.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.validation.ValidationUtils;

import co.com.coomeva.sipas.core.model.SipParametros;

/**
 * http://www.baeldung.com/java-8-functional-interfaces
 * @author alge3325
 *
 */
public class UpdateJava {

	

	public static void main(String...str) {
		
	
		/**
		 * 	computeIfAbsent
		 */
		Map<String, Integer> nameMap = new HashMap<>();
		// Conputar con expresion lamda
		Integer value2 = nameMap.computeIfAbsent("John", String::length); // with a method referen 		
		nameMap.computeIfAbsent("Alexander", k -> k.length()); // with expression lamda
		
		System.out.println("valor 2 " + value2);
		System.out.println("Map " + nameMap.get("John") );
		
		/**
		 * Function
		 */	
		Function<Integer, String> intToString = Object::toString;
		Function<String, String> quote = s -> "'" + s + "'";
		 
			
		Function<Integer, Double> calcularAreaCuadrado = (n) -> (double)(n*n);
				
		Function<Integer, String> quoteIntToString = quote.compose(intToString);	
	 
		System.out.println( quoteIntToString.apply(5));
		
		Function<String, String> funccio = (n) -> n+1;	
		
		Function<SipParametros, String> funcion2 = p -> p.getNombre() ;  	//--Obtener el valor
		
		Function<Long[],String> conver = (arr) -> "result ="+  arr[0] + arr[1] + arr[2];  	//--Obtener el valor
		
		String result = funcion2.apply( new SipParametros(null, null, "Nombre prueba"));
		
		System.out.println("Extrar valor de function" + result);
		
		//UserValidation nameIsNotEmpty = user -> !user.name.trim().isEmpty();
		//UserValidation eMailContainsAtSign = user -> user.email.contains("@");
		//User gregor = new User("Gregor", 30, "nicemail@gmail.com");

		//nameIsNotEmpty.apply(gregor) && eMailContainsAtSing.apply(gregor);
		//ValidationUtils.invokeValidator(validator, obj, errors);
		/**
		 * Two-Arity Function Specializations
		 */
		Map<String, Integer> salaries = new HashMap<>();
		salaries.put("John", 40000);
		salaries.put("Freddy", 30000);
		salaries.put("Samuel", 50000);
		//                      K      V  
		salaries.replaceAll( (name, oldValue) -> name.equals("Freddy") ? oldValue : oldValue + 10000);
		System.out.println(salaries);
		
		/**
		 * Suppliers
		 */
		Supplier<Double> lazyValue = () -> {
		   // Uninterruptibles.sleepUninterruptibly(1000, TimeUnit.MILLISECONDS);
		    return 9d;
		};
		 
		Double valueSquared = squareLazy(lazyValue);
		
		/**
		 *  Consumers 
		 */
		List<String> names = Arrays.asList("John", "Freddy", "Samuel");
		names.forEach(name -> System.out.println("Hello, " + name));
		
		Map<String, Integer> ages = new HashMap<>();
		ages.put("John", 25);
		ages.put("Freddy", 24);
		ages.put("Samuel", 30);
		
		ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));

		/**
		 * Predicates
		 */
		List<String> names1 = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");
		 
		List<String> namesWithA = names1.stream()
		  .filter(name -> name.startsWith("A"))
		  .collect(Collectors.toList());
		
		/**
		 * Operators
		 */
		List<String> namess = Arrays.asList("bob", "josh", "megan");
		namess.replaceAll(name -> name.toUpperCase());
		
		names.replaceAll(String::toUpperCase);
		List<Integer> values = Arrays.asList(3, 5, 8, 9, 12);
		 
		int sum = values.stream()
		  .reduce(0, (i1, i2) -> i1 + i2);
		
	}
	
	/**
	 * Suppliers
	 */
	public static double squareLazy(Supplier<Double> lazyValue) {
	    return Math.pow(lazyValue.get(), 2);
	}
	
	
	
	void valores() {

		/*
		Post post = new Post();
		Session session = new Session();
		/**
		if (post.getCreator().equals(session.getUser())) {
			  if (post.getRating() < 50) {
			    //postRepository.delete(post);
			  } else errors.add(400, "Cant delete post with rating 50 or higher")
			} else errors add (400, "You should be owner of the post")
		*/	
		
		/*
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
    	
    	/*
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


