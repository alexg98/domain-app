package co.com.coomeva.sipas.core.service;

import java.util.List;

import co.com.coomeva.sipas.core.model.User;

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
	void deleteUser(User user);

	public void test(User user);
}
