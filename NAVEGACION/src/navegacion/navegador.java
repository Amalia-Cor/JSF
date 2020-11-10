package navegacion;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean (name="consulta")
@RequestScoped
public class navegador implements Serializable{
public String metodo1() {
	return "Nosotros";
	
}
public String metodo2() {
	return "Contacto";
}
}
