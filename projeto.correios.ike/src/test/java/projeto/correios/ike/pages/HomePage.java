package projeto.correios.ike.pages;

import projeto.correios.ike.elemento.Elementos;
import projeto.correios.ike.metodos.Metodos;

public class HomePage {
	
	Metodos metodo = new Metodos();
	
	public void buscarCepEndereco(String dado) {
		
		metodo.escrever(Elementos.buscarCepEndereco, dado);
	}
	
	public void validarDadoRetornados(String logradouro, String bairro, String localidade, String cep) {
		
		metodo.mudarAba();
		metodo.validarTexto(Elementos.logradouro_Nome, logradouro);
		metodo.validarTexto(Elementos.bairro_Distrito, bairro);
		metodo.validarTexto(Elementos.localidade_UF, localidade);
		metodo.validarTexto(Elementos.cep, cep);

	}

}
