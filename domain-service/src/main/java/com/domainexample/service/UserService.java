package com.domainexample.service;

import java.util.List;

import com.domainexample.model.User;

public interface UserService {

	/**
	 * @param user
	 * @return
	 */
	User save(User user);
	/**
	 * Recupera la lista de usuarios
	 * @return lista de usuarios
	 */
	List<User> findAll();
	/**
	 * Elimina un usuario con el id recibido
	 * @param id
	 */
	void deleteUser(Long id);


}
