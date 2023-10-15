package projeto.correios.ike.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.correios.ike.config.InicializarTeste;
import projeto.correios.ike.pages.HomePage;

public class ConsultaCepIkeTeste {

	HomePage home = new HomePage();
	
	@Before
	public void IniciarTeste() {

		InicializarTeste.configurarAmbiente();
	}

	@After
	public void finalizarTeste() {

		InicializarTeste.encerrarTeste();
	}

	@When("enviar os dados para busca")
	public void enviarOsDadosParaBusca() {
		
		home.buscarCepEndereco("06253-000");
	}

	@Then("validar os dados retornados")
	public void validarOsDadosRetornados() {
		
		home.validarDadoRetornados("Rua Presidente Costa e Silva", "Helena Maria", "Osasco/SP", "06253-000");
	}

}
