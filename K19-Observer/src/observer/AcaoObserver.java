package observer;

import subject.Acao;

public interface AcaoObserver {

	void notificaAlteracao(Acao acao);
}
