package co.com.eafit.definitions;

import co.com.eafit.steps.ComentarioEafitStep;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComentarioEafitDefinition {

	@Steps
	ComentarioEafitStep comentarioEafitStep;

	@Given("^que Yeison quiere escribir un comentario a la Universidad EAFIT$")
	public void queYeisonQuiereEscribirUnComentarioALaUniversidadEAFIT() throws Exception {
		comentarioEafitStep.abrirUrl();
	}

	@When("^el diligencia comentario$")
	public void elDiligenciaComentario(DataTable dtDatos) throws Exception {
		comentarioEafitStep.diligenciarComentario(dtDatos);
	}

	@Then("^el visualiza el pantalla el mensaje \"([^\"]*)\"\\.$")
	public void elVisualizaElPantallaElMensaje(String mensaje) throws Exception {
		comentarioEafitStep.verificarMensaje(mensaje);
	}

}
