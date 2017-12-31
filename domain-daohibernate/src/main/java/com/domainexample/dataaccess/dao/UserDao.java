package com.domainexample.dataaccess.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.domainexample.model.User;

@Scope("singleton")
@Repository("userDao")
public class UserDao extends AbstractDomainexampleDAO<User> implements IUserDao {

	/** Constant IDFILES. */
	public static final String ID = "id";

}