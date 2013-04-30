package net.srirangan.packt.maven.security;

import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

public class HttpSessionProducer {

	@Produces
	public HttpSession getHttpSession(){
		return (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(false);
	}
}
