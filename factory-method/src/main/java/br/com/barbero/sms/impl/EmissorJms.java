package br.com.barbero.sms.impl;

import br.com.barbero.sms.Emissor;

public class EmissorJms implements Emissor {

	public void envia(String mensagem) {
		System.out.println (" Enviando por Jms a mensagem : ");
		System.out.println ( mensagem );
	}

}
