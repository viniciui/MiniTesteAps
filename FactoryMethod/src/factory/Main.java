package factory;


public class Main {
	
	public static void main (String [] args) {
		
		EscolaFactory tipoOcupacao = new EscolaFactory();
		
		OcupacaoEscola minhaOcupacao = tipoOcupacao.gerarOcupacao("Aluno");
		minhaOcupacao.criarOcupa��o();
		
		minhaOcupacao = tipoOcupacao.gerarOcupacao("Professor");
		minhaOcupacao.criarOcupa��o();
		
		minhaOcupacao = tipoOcupacao.gerarOcupacao("Secretario");
		minhaOcupacao.criarOcupa��o();
	}

}
