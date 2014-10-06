package br.com.barbero.design;

import org.junit.Before;
import org.junit.Test;

import br.com.barbero.sms.Emissor;
import br.com.barbero.sms.factory.EmissorCreator;
import br.com.barbero.sms.factory.TipoEmissor;

public class TestaEmissores {
	
	EmissorCreator emissorCreator = null;
	
	@Before
	public void  setUp(){
		emissorCreator = new EmissorCreator();
	}
	
	@Test
	public void testaEmissorSms(){
		Emissor emissor = emissorCreator.create(TipoEmissor.SMS);
		emissor.envia("Mensagem Sms");
	}
	
	@Test
	public void testaEmissorEmail(){
		Emissor emissor = emissorCreator.create(TipoEmissor.EMAIL);
		emissor.envia("Mensagem Email");
	}
	
	@Test
	public void testaEmissorJms(){
		Emissor emissor = emissorCreator.create(TipoEmissor.JMS);
		emissor.envia("Mensagem JMS");
	}

}
