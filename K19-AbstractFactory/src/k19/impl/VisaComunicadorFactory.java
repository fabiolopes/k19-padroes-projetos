package k19.impl;

import k19.factory.EmissorCreator;
import k19.factory.ReceptorCreator;
import k19.interfaces.ComunicadorFactory;
import k19.interfaces.Emissor;
import k19.interfaces.Receptor;

public class VisaComunicadorFactory implements ComunicadorFactory{
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	@Override
	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.VISA);
	}

	@Override
	public Receptor createReceptor() {
		return receptorCreator.create(ReceptorCreator.VISA);
	}

	

}
