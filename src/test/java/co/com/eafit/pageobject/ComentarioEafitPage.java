package co.com.eafit.pageobject;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.eafit.edu.co/institucional/contacto/Paginas/contacto-eafit.aspx")
public class ComentarioEafitPage extends PageObject {

	
	@FindBy(id="Field1")
	public WebElementFacade txtNombre;
	
	@FindBy(id="Field3")
	public WebElementFacade txtMail;

	@FindBy(id="Field4")
	public WebElementFacade txtTelefono;

	@FindBy(id="Field5")
	public WebElementFacade txtCiudad;

	@FindBy(id="Field6")
	public WebElementFacade txtComentario;

	@FindBy(id="saveForm")
	public WebElementFacade btnEnviar;
	
	@FindBy(xpath = "//*[@id=\"container\"]/form/h2")
	public WebElementFacade lblMensaje;

	
	public void ingresarDatosComentario(DataTable dtDatos) {
		
		List<List<String>> data = dtDatos.raw();
		
		getDriver().switchTo().frame(0);
		txtNombre.sendKeys(data.get(1).get(0));
		txtMail.sendKeys(data.get(1).get(1));
		txtTelefono.sendKeys(data.get(1).get(2));
		txtCiudad.sendKeys(data.get(1).get(3));
		txtComentario.sendKeys(data.get(1).get(4));
		btnEnviar.click();		
		
	}


	public void mensajeComentarioExitoso(String mensaje) {
		String strMensaje = lblMensaje.getText();
		assertThat(strMensaje, Matchers.containsString(mensaje));
		
	}

}
