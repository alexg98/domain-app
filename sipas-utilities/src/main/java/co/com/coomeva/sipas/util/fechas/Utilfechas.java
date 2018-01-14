package co.com.coomeva.sipas.util.fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Utilfechas {

	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	public static synchronized Date getDateFromString(String fecha) {
		try {
			return formatter.parse(fecha);
		} catch (ParseException e) {
			throw new RuntimeException("Error convirtiendo fecha : "+fecha,e);
		}
	}
}
