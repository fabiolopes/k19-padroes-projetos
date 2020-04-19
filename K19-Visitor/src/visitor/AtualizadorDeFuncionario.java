package visitor;

import concreteelement.Gerente;
import concreteelement.Telefonista;

public interface AtualizadorDeFuncionario {
	void atualiza(Gerente g);
	void atualiza(Telefonista t);
}
