package factory;


public class Main {
	
	public static void main (String [] args) {
		
		EscolaFactory tipoOcupacao = new EscolaFactory();
		
		OcupacaoEscola minhaOcupacao = tipoOcupacao.gerarOcupacao("Aluno");
		minhaOcupacao.criarOcupação();
		
		minhaOcupacao = tipoOcupacao.gerarOcupacao("Professor");
		minhaOcupacao.criarOcupação();
		
		minhaOcupacao = tipoOcupacao.gerarOcupacao("Secretario");
		minhaOcupacao.criarOcupação();
	}

}
