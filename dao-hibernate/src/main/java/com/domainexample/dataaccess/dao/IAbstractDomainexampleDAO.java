package com.domainexample.dataaccess.dao;

import java.util.List;

import org.hibernate.Session;

/**
 * The Interface IAbstractDomainexampleDAO enclosing the common transactional methods.
 *
 * @param <T> the generic type
 */
public interface IAbstractDomainexampleDAO<T> {
	
	/**
	 * Save.
	 *
	 * @param instance the instance
	 * @return the t
	 */
	T save(T instance);

	
	/**
	 * Delete.
	 *
	 * @param instance the instance
	 */
	void delete(T instance);

	
	/**
	 * Update.
	 *
	 * @param instance the instance
	 */
	void update(T instance);

	
	/**
	 * Find by id.
	 *
	 * @param id the id
	 * @return the t
	 */
	T findById(Long id);

	
	/**
	 * Find by example.
	 *
	 * @param instance the instance
	 * @return the list< t>
	 */
	List<T> findByExample(T instance);

	
	/**
	 * Find by property.
	 *
	 * @param propertyName the property name
	 * @param value the value
	 * @return the list< t>
	 */
	List<T> findByProperty(String propertyName, Object value);

	
	/**
	 * Find all.
	 *
	 * @return the list< t>
	 */
	List<T> findAll();

	
	/**
	 * Find by criteria.
	 *
	 * @param whereCondition the where condition
	 * @return the list< t>
	 */
	List<T> findByCriteria(String whereCondition);

	
	/**
	 * Find page entities.
	 *
	 * @param sortColumnName the sort column name
	 * @param sortAscending the sort ascending
	 * @param startRow the start row
	 * @param maxResults the max results
	 * @return the list< t>
	 */
	List<T> findPageEntities(String sortColumnName, boolean sortAscending,
			int startRow, int maxResults);

	
	/**
	 * Find total number entities.
	 *
	 * @return the long
	 */
	Long findTotalNumberEntities();
	
	Session getSession();
	
	/**
	 * This method removes from the current session the entity passed as argument.
	 * @param entity that will be removed from session
	 */
	void evictEntityFromSession(T entity);
}
