package com.domainexample.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domainexample.dataaccess.dao.IUserDao;

import co.com.coomeva.sipas.core.model.SipParametros;
import co.com.coomeva.sipas.core.model.User;
import co.com.sipas.databaseutil.model.MapValue;



@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	protected IUserDao userDao;
			
	@Override
	public User save(User user) {
		return userDao.save(user);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void deleteUser(User user) {		
		this.userDao.delete(user);	
	}
	
	@Override
	public void test(User user) {		
		
		List<SipParametros> listn = this.userDao.getNamedQuery("getTipoAuxilios").list();
		listn.forEach(item -> System.out.println(item.getNombre() +" "+item.getId().getCodigo() ));
		
		
		//List<Map<String,MapValue<Object>>> result = this.userDao.getNamedQueryMap("test");
		List<Map<String,MapValue<Object>>> result = this.userDao.getNamedQueryMap("getTipoAuxilios2");
		
		result.forEach(item -> {
			item.forEach( (k,v) ->  System.out.println(k+" valor " + v.value() + " type "  + v.value().getClass()) );
		});
		
		List lis = this.userDao.getNamedQuery("getTipoAuxilios.con.param").setParam("id", new Long[] { 1l,2l}).list();
				
		Map<String, MapValue<Object>> resultado = result.get(0);
		String titulo = resultado.get("title").value();
		Long userId = resultado.get("userId").value();   
		Long announcementId = resultado.get("announcementId").value();   
				
		System.out.println(titulo+ " - "+userId+" "+announcementId);
		
		String test = convetOut("valor");
		Long test2 = convetOut(12222l);
		//Integer test3 = convetOut(new StringBuffer());
		//System.out.println(test+test2+test3);
		
		HashMap<String, Object> ddd = new HashMap<>();
		ddd.put("sss",22222);
		
		List<User> list = this.userDao.getNamedQueryTransoformDto("test", User.class)
			.setParameter("wqwq", 11111l).list();
		
		List<User> list2 = this.userDao.getNamedQuery("\"test\"").list();
		
		
	}
	
	private <T> T convetOut(Object value) {
		return (T)value;
	}
}
