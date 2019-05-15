package controller;

import View.CadFuncionario;
import model.vo.Funcionario;

public class CadastroDeFuncionariosController {
	
	public CadastroDeFuncionariosController() {
		CadFuncionario cadFunc = new CadFuncionario();
	}
	public void recebeDados(String nome, String matricula, String cargo, String salario,String cpf, String dataNasc, String setor, String epi, String status) {
		System.out.println(nome);
		System.out.println(matricula);
		System.out.println(cargo);
		System.out.println(cpf);
		System.out.println(dataNasc);
		System.out.println(setor);
		System.out.println(status);
		System.out.println(salario);

	}
	
	/*public boolean validaNome() {
		//String text = funcionario.getNome();
		return text.matches("[^\\d]+");
		
	}
	void validaCpf(){
		//funcionario.getCpf()
		
	}
}*/
}
