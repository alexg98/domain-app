package co.com.coomeva.sipas.core.aop;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectEvict {	
	
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * Desvincula los objetos de la session
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
	@Around("@annotation(co.com.coomeva.sipas.util.annotations.EvictSession) && execution(* *(..))")
	public Object evictEntityOfSession(ProceedingJoinPoint joinPoint) throws Throwable {
		try {
			Object entity = joinPoint.proceed();		
			if(entity instanceof Collection) {
				List result = (List)entity;
				result.forEach( p -> evictSession(p) );			
			}else if(entity instanceof Serializable){
				evictSession(entity);
			}		
		    return joinPoint.proceed();
		} catch (Exception ex) {
			throw new Exception("Error[0] : Errorr desvinculando el objeto de la session ",ex) ;
		}		
	}
	
	private void evictSession(Object entity) {
		sessionFactory.getCurrentSession().evict(entity);
	}
}
