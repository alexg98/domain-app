package com.domainexample.dataaccess.daofactory;

import com.domainexample.dataaccess.dao.IUserDao;
import com.domainexample.dataaccess.dao.UserDao;

/**
 * Factory for Data Access Objects Strategy The DAO pattern can be made highly flexible by adopting the Abstract Factory
 * [GoF] and the Factory Method [GoF] patterns. When the underlying storage is not subject to change from one
 * implementation to another, this strategy can be implemented using the Factory Method pattern to produce a number of
 * DAOs needed by the application. This class is a Factory Method pattern
 * 
 */
public final class XMLHibernateDaoFactory {
	private static XMLHibernateDaoFactory instance = null;

	private IUserDao userDao;

	private XMLHibernateDaoFactory() {
	}

	/**
	 * 
	 * @return HibernateDaoFactory
	 */
	public static XMLHibernateDaoFactory getInstance() {
		if (instance == null) {
			instance = new XMLHibernateDaoFactory();
		}

		return instance;
	}

	/**
	 * This method instantiates the IAnuAnnounceImagesDAO class for HibernateCore that is used in this applications
	 * deployment environment to access the data.
	 * 
	 * @return IAnuAnnounceImagesDAO implementation
	 */
	
	public IUserDao getUserDao() {
		if(userDao == null) {
			userDao = new UserDao();
		}
		return userDao;
	}

}
