package co.com.coomeva.sipas.util.annotations;


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import co.com.coomeva.sipas.util.enumerations.LoggingLevel;

/**
 * Annotation class that works as the point cut of the aspects
 * for logging proposes for the application.
 *
 */
@Target( {ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Loggable {
	
	/**
	 * The loggin level for the logged element.
	 * @return
	 */
	LoggingLevel level();
	
}
