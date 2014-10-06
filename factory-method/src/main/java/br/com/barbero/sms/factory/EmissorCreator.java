package br.com.barbero.sms.factory;

import br.com.barbero.sms.Emissor;
import br.com.barbero.sms.impl.EmissorEmail;
import br.com.barbero.sms.impl.EmissorJms;
import br.com.barbero.sms.impl.EmissorSms;

public class EmissorCreator {

	public Emissor create(TipoEmissor tipoEmissor) {
		Emissor emissor = null;
		if (tipoEmissor.equals(TipoEmissor.EMAIL)) {
			
			emissor = new EmissorEmail();
			
		} else if (tipoEmissor.equals(TipoEmissor.JMS)) {
			
			emissor = new EmissorJms();
			
		} else if (tipoEmissor.equals(TipoEmissor.SMS)) {
			
			emissor = new EmissorSms();
			
		}else{
			throw new IllegalArgumentException("Implementacao do Emissor não definido");
		}
		
		return emissor;
	}

}
