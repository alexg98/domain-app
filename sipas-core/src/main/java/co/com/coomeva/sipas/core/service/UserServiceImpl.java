package co.com.coomeva.sipas.core.service;

import static co.com.coomeva.sipas.core.enums.EnumNamedQuerySipasdb.GET_PROTECCIONES_BY_ASECODIGO;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.coomeva.sipas.bpm.dataaccess.dao.IPersonDao;
import co.com.coomeva.sipas.bpm.model.Person;
import co.com.coomeva.sipas.core.config.dto.parametros.ParamRegistroProtecciones;
import co.com.coomeva.sipas.core.dao.ISipParametroDao;
import co.com.coomeva.sipas.core.dao.IUserDao;
import co.com.coomeva.sipas.core.enums.EnumAcumulado;
import co.com.coomeva.sipas.core.factory.ValidadorProteccionesFactory;
import co.com.coomeva.sipas.core.model.SipParametros;
import co.com.coomeva.sipas.core.model.User;
import co.com.coomeva.sipas.core.model.sipasdb.ClimaeDetallado;
import co.com.coomeva.sipas.core.validaciones.protecciones.ValidadorProtecciones;




@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	protected IUserDao userDao;
	
	@Autowired
	protected ISipParametroDao sipParametroDao;	

	@Autowired
	private TaskService taskService;
			
	@Autowired
	private IPersonDao personRepository;
	
	@Autowired
	private RuntimeService runtimeService;
	
	@Autowired
	private RepositoryService repositoryService;
	
	@Autowired
    private ValidadorProteccionesFactory serviceLocatedFactory;
	
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
	
	@Transactional(readOnly=false)
	public String transaccion() {
		Person person = personRepository.findById(1l);// Property("name", assignee).get(0);

		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("person", person);

		runtimeService.startProcessInstanceByKey("simpleProcess", variables);

		return processInfo();
	}
	
	@Override
	@Transactional(readOnly=false)
	public void test(User user) {
		
		Long acumuladoPerse = EnumAcumulado.PERSEVERANCIA.getAcumuladoByAsociado(4536950l);
		System.out.println("Acumulado perseverancia $" +acumuladoPerse);
		ClimaeDetallado climae = new ClimaeDetallado();
		
		ParamRegistroProtecciones param = new ParamRegistroProtecciones();
		param.setFechaNacimiento(new Date());
		param.setClimae(climae);
		param.getClimae().setFecNac("2018-01-14");
		param.getClimae().setNumInt(4536950l);
		
		ValidadorProtecciones valid = serviceLocatedFactory.get("prodCodigo_99");
		valid.validaCondicionesDeRegistro(param);
		
		
		
		System.out.println("Inicia " +new Date());
		List<SipParametros> listn = this.userDao.getNamedQuery(GET_PROTECCIONES_BY_ASECODIGO).list();
		System.out.println("Finaliza " +new Date());
		this.sipParametroDao.findAll();
				
		List<SipParametros> list4 = this.sipParametroDao.test();
		
		listn.forEach(item -> System.out.println(item.getNombre() +" "+item.getId().getCodigo() ));
		
		System.out.println( transaccion() +" "+ list4 + " " + listn);
		boolean flag = false;
		
		if(flag) {
			throw new RuntimeException(" -- rollback controlado --- ");
		}
		/*
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
		*/
		
	}
	
	private String processInfo() {
		List<Task> tasks = taskService.createTaskQuery().orderByTaskCreateTime().asc().list();
		
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("Number of process definitions : "
				+ repositoryService.createProcessDefinitionQuery().count() + "--> Tasks >> ");

		for (Task task : tasks) {
			stringBuilder
					.append(task + " | Assignee: " + task.getAssignee() + " | Description: " + task.getDescription());
		}

		return stringBuilder.toString();
	}
	
	private <T> T convetOut(Object value) {
		return (T)value;
	}
}
