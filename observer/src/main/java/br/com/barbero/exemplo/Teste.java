package br.com.barbero.exemplo;

/**
 * Created by crg1211 on 27/10/2014.
 */
public class Teste {

    public static void main(String[] args){
        Acao acao = new Acao (" VALE3 ", 45.27) ;

        Corretora corretora1 = new Corretora (" Corretora1 ");
        Corretora corretora2 = new Corretora (" Corretora2 ");

        acao.registraInteressado ( corretora1 );
        acao.registraInteressado ( corretora2 );

        acao . setValor (50) ;

    }
}
