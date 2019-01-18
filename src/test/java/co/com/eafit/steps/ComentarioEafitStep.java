package co.com.eafit.steps;

import co.com.eafit.pageobject.ComentarioEafitPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class ComentarioEafitStep {

	ComentarioEafitPage comentarioEafitPage;

	@Step
	public void abrirUrl() {
		comentarioEafitPage.open();		
	}

	@Step
	public void diligenciarComentario(DataTable dtDatos) {
		comentarioEafitPage.ingresarDatosComentario(dtDatos);		
	}

	@Step
	public void verificarMensaje(String mensaje) {
		comentarioEafitPage.mensajeComentarioExitoso(mensaje);
		
	}
	
	
}
