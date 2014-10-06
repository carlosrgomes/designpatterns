package br.com.barbero.sms.impl;

import br.com.barbero.sms.Emissor;

public class EmissorSms implements Emissor {

	public void envia(String mensagem) {
		System.out.println("Enviando mensagem SMS");
		System.out.println(mensagem);
	}

}
