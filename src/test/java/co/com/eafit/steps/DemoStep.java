package co.com.eafit.steps;

import co.com.eafit.pageobject.DemoPage;
import net.thucydides.core.annotations.Step;

public class DemoStep {
	
	
	DemoPage demoPage;

	@Step
	public void cargarUrl() {
		demoPage.open();
	}

	@Step
	public void escribirCredenciales(String usuario, String clave) {
		demoPage.realizarAutenticacion(usuario, clave);
		
	}

	@Step
	public void verificarAcceso(String tituloPantalla) {
		demoPage.verificarTitulo(tituloPantalla);		
	}

}


