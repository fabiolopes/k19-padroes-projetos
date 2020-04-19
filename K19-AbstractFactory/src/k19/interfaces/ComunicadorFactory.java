package k19.interfaces;

public interface ComunicadorFactory {
	Emissor createEmissor();
	Receptor createReceptor();
}
