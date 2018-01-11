package co.com.coomeva.sipas.databaseutil.model;
/**
 * Clase generica para casteo automatico del resulmapping
 * @author alexg
 *
 * @param <T>
 */
public class MapValue <T>{
	T ref;
	public MapValue(T ref){
		this.ref = ref;
	}
	/**
	 * DEvuelve el valor casteado
	 * @return
	 */
	public <T> T value(){
		return (T)ref;
	}
}
