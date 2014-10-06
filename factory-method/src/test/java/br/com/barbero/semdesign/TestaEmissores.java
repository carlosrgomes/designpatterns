package br.com.barbero.semdesign;

import org.junit.Test;

import br.com.barbero.sms.Emissor;
import br.com.barbero.sms.impl.EmissorEmail;
import br.com.barbero.sms.impl.EmissorJms;
import br.com.barbero.sms.impl.EmissorSms;

public class TestaEmissores {

	@Test
	public void testaEmissorSms(){
		Emissor emissor = new EmissorSms();
		emissor.envia("Mensagem SMS");
	}
	
	@Test
	public void testaEmissorJms(){
		Emissor emissor = new EmissorJms();
		emissor.envia("Mensagem JMS");
	}
	
	@Test
	public void testaEmissorEmail(){
		Emissor emissor = new EmissorEmail();
		emissor.envia("Mensagem E-mail");
	}
	
	
	
}
