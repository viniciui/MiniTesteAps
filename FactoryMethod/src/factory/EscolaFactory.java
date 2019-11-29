package factory;

public class EscolaFactory {
	
	public OcupacaoEscola gerarOcupacao(String ocupacao) {
	
	if(ocupacao == "" || ocupacao == null) {
		return null;
	}
	
	if(ocupacao.equals("Aluno")) {
		return new Aluno();
	} else if (ocupacao.equals("Professor")) {
		return new Professor();
	} else if (ocupacao.equals("Secretario")) {
		return new Secretario();	
	}
	return null;
}
}