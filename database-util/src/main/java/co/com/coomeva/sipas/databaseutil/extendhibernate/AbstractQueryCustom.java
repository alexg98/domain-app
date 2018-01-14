package co.com.coomeva.sipas.databaseutil.extendhibernate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

import org.hibernate.CacheMode;
import org.hibernate.FlushMode;
import org.hibernate.LockMode;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;
import org.hibernate.type.Type;

public abstract class AbstractQueryCustom {

	
	public FlushMode getFlushMode() {
		throw new UnsupportedOperationException("Metodo getFlushMode no soportado en esta version");
	}
	
	public CacheMode getCacheMode() {	
		throw new UnsupportedOperationException("Metodo getCacheMode no soportado en esta version");
	}
	
	public boolean isCacheable() {		
		throw new UnsupportedOperationException("Metodo isCacheable no soportado en esta version");
	}
	
	public String getCacheRegion() {		
		throw new UnsupportedOperationException("Metodo getCacheRegion no soportado en esta version");
	}
	
	public Integer getTimeout() {		
		throw new UnsupportedOperationException("Metodo getTimeout no soportado en esta version");
	}
	
	public Integer getFetchSize() {		
		throw new UnsupportedOperationException("Metodo getFetchSize no soportado en esta version");
	}
	
	public boolean isReadOnly() {		
		throw new UnsupportedOperationException("Metodo isReadOnly no soportado en esta version");
	}
	
	public Type[] getReturnTypes() {		
		throw new UnsupportedOperationException("Metodo getReturnTypes no soportado en esta version");
	}
	
	public String getQueryString() {		
		throw new UnsupportedOperationException("Metodo getQueryString no soportado en esta version");
	}
	
	public Integer getMaxResults() {		
		throw new UnsupportedOperationException("Metodo getMaxResults no soportado en esta version");
	}
	
	public Query setMaxResults(int maxResults) {
		
		throw new UnsupportedOperationException("Metodo setMaxResults no soportado en esta version");
	}
	
	public Integer getFirstResult() {		
		throw new UnsupportedOperationException("Metodo getFirstResult no soportado en esta version");
	}
	
	public Query setFirstResult(int firstResult) {		
		throw new UnsupportedOperationException("Metodo setFirstResult no soportado en esta version");
	}
	
	public Query setFlushMode(FlushMode flushMode) {		
		throw new UnsupportedOperationException("Metodo setFlushMode no soportado en esta version");
	}
	
	public Query setCacheMode(CacheMode cacheMode) {		
		throw new UnsupportedOperationException("Metodo setCacheMode no soportado en esta version");
	}
	
	public Query setCacheable(boolean cacheable) {		
		throw new UnsupportedOperationException("Metodo setCacheable no soportado en esta version");
	}
	
	public Query setCacheRegion(String cacheRegion) {		
		throw new UnsupportedOperationException("Metodo setCacheRegion no soportado en esta version");
	}
	
	public Query setTimeout(int timeout) {		
		throw new UnsupportedOperationException("Metodo setTimeout no soportado en esta version");
	}
	
	public Query setFetchSize(int fetchSize) {		
		throw new UnsupportedOperationException("Metodo setFetchSize no soportado en esta version");
	}
	
	public Query setReadOnly(boolean readOnly) {		
		throw new UnsupportedOperationException("Metodo setReadOnly no soportado en esta version");
	}
	
	public LockOptions getLockOptions() {		
		throw new UnsupportedOperationException("Metodo getLockOptions no soportado en esta version");
	}
	
	public Query setLockOptions(LockOptions lockOptions) {		
		throw new UnsupportedOperationException("Metodo setLockOptions no soportado en esta version");
	}
	
	public Query setLockMode(String alias, LockMode lockMode) {		
		throw new UnsupportedOperationException("Metodo setLockMode no soportado en esta version");
	}
	
	public String getComment() {		
		throw new UnsupportedOperationException("Metodo getComment no soportado en esta version");
	}
	
	public Query setComment(String comment) {		
		throw new UnsupportedOperationException("Metodo setComment no soportado en esta version");
	}
	
	public Query addQueryHint(String hint) {		
		throw new UnsupportedOperationException("Metodo addQueryHint no soportado en esta version");
	}
	
	public String[] getReturnAliases() {		
		throw new UnsupportedOperationException("Metodo getReturnAliases no soportado en esta version");
	}
	
	public String[] getNamedParameters() {		
		throw new UnsupportedOperationException("Metodo getNamedParameters no soportado en esta version");
	}
	
	@SuppressWarnings("rawtypes")
	public Iterator iterate() {		
		throw new UnsupportedOperationException("Metodo iterate no soportado en esta version");
	}
	
	public ScrollableResults scroll() {		
		throw new UnsupportedOperationException("Metodo scroll no soportado en esta version");
	}
	
	public ScrollableResults scroll(ScrollMode scrollMode) {		
		throw new UnsupportedOperationException("Metodo scroll no soportado en esta version");
	}	
	
	public int executeUpdate() {		
		throw new UnsupportedOperationException("Metodo executeUpdate no soportado en esta version");
	}
	
	public Query setParameter(int position, Object val, Type type) {		
		throw new UnsupportedOperationException("Metodo setParameter no soportado en esta version");
	}
	
	public Query setParameter(String name, Object val, Type type) {		
		throw new UnsupportedOperationException("Metodo setParameter no soportado en esta version");
	}
	
	public Query setParameter(int position, Object val) {		
		throw new UnsupportedOperationException("Metodo setParameter no soportado en esta version");
	}
	
	public Query setParameter(String name, Object val) {		
		throw new UnsupportedOperationException("Metodo setParameter no soportado en esta version");
	}
	
	public Query setParameters(Object[] values, Type[] types) {		
		throw new UnsupportedOperationException("Metodo setParameter no soportado en esta version");
	}
	
	@SuppressWarnings("rawtypes")
	public Query setParameterList(String name, Collection values, Type type) {		
		throw new UnsupportedOperationException("Metodo setParameterList no soportado en esta version");
	}
	
	@SuppressWarnings("rawtypes")
	public Query setParameterList(String name, Collection values) {		
		throw new UnsupportedOperationException("Metodo no soportado en esta version");
	}
	
	public Query setParameterList(String name, Object[] values, Type type) {		
		throw new UnsupportedOperationException("Metodo setParameterList no soportado en esta version");
	}
	
	public Query setParameterList(String name, Object[] values) {		
		throw new UnsupportedOperationException("Metodo setParameterList no soportado en esta version");
	}
	
	public Query setProperties(Object bean) {		
		throw new UnsupportedOperationException("Metodo setProperties no soportado en esta version");
	}
	
	@SuppressWarnings("rawtypes")
	public Query setProperties(Map bean) {		
		throw new UnsupportedOperationException("Metodo setProperties no soportado en esta version");
	}
	
	public Query setString(int position, String val) {		
		throw new UnsupportedOperationException("Metodo setString no soportado en esta version");
	}
	
	public Query setCharacter(int position, char val) {		
		throw new UnsupportedOperationException("Metodo setCharacter no soportado en esta version");
	}
	
	public Query setBoolean(int position, boolean val) {		
		throw new UnsupportedOperationException("Metodo setBoolean no soportado en esta version");
	}
	
	public Query setByte(int position, byte val) {		
		throw new UnsupportedOperationException("Metodo setByte no soportado en esta version");
	}
	
	public Query setShort(int position, short val) {		
		throw new UnsupportedOperationException("Metodo setShort no soportado en esta version");
	}
	
	public Query setInteger(int position, int val) {		
		throw new UnsupportedOperationException("Metodo setInteger no soportado en esta version");
	}
	
	public Query setLong(int position, long val) {		
		throw new UnsupportedOperationException("Metodo setLong no soportado en esta version");
	}
	
	public Query setFloat(int position, float val) {		
		throw new UnsupportedOperationException("Metodo setFloat no soportado en esta version");
	}
	
	public Query setDouble(int position, double val) {		
		throw new UnsupportedOperationException("Metodo setDouble no soportado en esta version");
	}
	
	public Query setBinary(int position, byte[] val) {		
		throw new UnsupportedOperationException("Metodo no soportado en esta version");
	}
	
	public Query setText(int position, String val) {		
		throw new UnsupportedOperationException("Metodo setText no soportado en esta version");
	}
	
	public Query setSerializable(int position, Serializable val) {		
		throw new UnsupportedOperationException("Metodo setSerializable no soportado en esta version");
	}
	
	public Query setLocale(int position, Locale locale) {		
		throw new UnsupportedOperationException("Metodo setLocale no soportado en esta version");
	}
	
	public Query setBigDecimal(int position, BigDecimal number) {		
		throw new UnsupportedOperationException("Metodo setBigDecimal no soportado en esta version");
	}
	
	public Query setBigInteger(int position, BigInteger number) {		
		throw new UnsupportedOperationException("Metodo setBigInteger no soportado en esta version");
	}
	
	public Query setDate(int position, Date date) {		
		throw new UnsupportedOperationException("Metodo setDate no soportado en esta version");
	}
	
	public Query setTime(int position, Date date) {		
		throw new UnsupportedOperationException("Metodo setTime no soportado en esta version");
	}
	
	public Query setTimestamp(int position, Date date) {		
		throw new UnsupportedOperationException("Metodo setTimestamp no soportado en esta version");
	}
	
	public Query setCalendar(int position, Calendar calendar) {		
		throw new UnsupportedOperationException("Metodo setCalendar no soportado en esta version");
	}
	
	public Query setCalendarDate(int position, Calendar calendar) {		
		throw new UnsupportedOperationException("Metodo setCalendarDate no soportado en esta version");
	}
	
	public Query setString(String name, String val) {		
		throw new UnsupportedOperationException("Metodo setString no soportado en esta version");
	}
	
	public Query setCharacter(String name, char val) {		
		throw new UnsupportedOperationException("Metodo setCharacter no soportado en esta version");
	}
	
	public Query setBoolean(String name, boolean val) {		
		throw new UnsupportedOperationException("Metodo setBoolean no soportado en esta version");
	}
	
	public Query setByte(String name, byte val) {		
		throw new UnsupportedOperationException("Metodo setByte no soportado en esta version");
	}
	
	public Query setShort(String name, short val) {		
		throw new UnsupportedOperationException("Metodo setShort no soportado en esta version");
	}
	
	public Query setInteger(String name, int val) {		
		throw new UnsupportedOperationException("Metodo setInteger no soportado en esta version");
	}
	
	public Query setLong(String name, long val) {		
		throw new UnsupportedOperationException("Metodo setLong no soportado en esta version");
	}
	
	public Query setFloat(String name, float val) {		
		throw new UnsupportedOperationException("Metodo setFloat no soportado en esta version");
	}
	
	public Query setDouble(String name, double val) {		
		throw new UnsupportedOperationException("Metodo setDouble no soportado en esta version");
	}
	
	public Query setBinary(String name, byte[] val) {		
		throw new UnsupportedOperationException("Metodo setBinary no soportado en esta version");
	}
	
	public Query setText(String name, String val) {		
		throw new UnsupportedOperationException("Metodo setText no soportado en esta version");
	}
	
	public Query setSerializable(String name, Serializable val) {		
		throw new UnsupportedOperationException("Metodo setSerializable no soportado en esta version");
	}
	
	public Query setLocale(String name, Locale locale) {		
		throw new UnsupportedOperationException("Metodo setLocale no soportado en esta version");
	}
	
	public Query setBigDecimal(String name, BigDecimal number) {		
		throw new UnsupportedOperationException("Metodo setBigDecimal no soportado en esta version");
	}
	
	public Query setBigInteger(String name, BigInteger number) {		
		throw new UnsupportedOperationException("Metodo setBigInteger no soportado en esta version");
	}
	
	public Query setDate(String name, Date date) {		
		throw new UnsupportedOperationException("Metodo setDate no soportado en esta version");
	}
	
	public Query setTime(String name, Date date) {		
		throw new UnsupportedOperationException("Metodo setTime no soportado en esta version");	}
	
	public Query setTimestamp(String name, Date date) {		
		throw new UnsupportedOperationException("Metodo setTimestamp no soportado en esta version");	
	}
	
	public Query setCalendar(String name, Calendar calendar) {		
		throw new UnsupportedOperationException("Metodo setCalendar no soportado en esta version");
	}
	
	public Query setCalendarDate(String name, Calendar calendar) {		
		throw new UnsupportedOperationException("Metodo setCalendarDate no soportado en esta version");
	}
	
	public Query setEntity(int position, Object val) {		
		throw new UnsupportedOperationException("Metodo setEntity no soportado en esta version");
	}
	
	public Query setEntity(String name, Object val) {		
		throw new UnsupportedOperationException("Metodo setEntity no soportado en esta version");
	}	
}