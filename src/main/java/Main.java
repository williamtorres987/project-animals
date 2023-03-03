import animals.Ave;
import animals.Papagaio;
import animals.Tucano;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(":::::::::::::A ave abaixo é um Tucano:::::::::::::");
        //abaixo você está utilizando a classe Ave para criar um objeto
        Tucano tucano = new Tucano();
        //abaixo você está alterando as informações da sua ave, passando por parametro a informação que deseja
        tucano.setBico("bico fino");
        tucano.setCor("vermelho");
        tucano.setEspecie("tucano");
        tucano.setTamanho("porte pequeno");
        tucano.setBicao("Bicudao");
        //abaixo você está pegando os dados da sua ave e mostrando eles no console
        System.out.println(tucano.getBico());
        System.out.println(tucano.getCor());
        System.out.println(tucano.getEspecie());
        System.out.println(tucano.getTamanho());
        System.out.println(tucano.getBicao());

        System.out.println(":::::::::::::A ave abaixo é um papagaio:::::::::::::");
        //abaixo você está utilizando a classe Ave para criar um objeto
        Papagaio papagaio = new Papagaio();
        papagaio.setRepetirPalavras("Ele repete palavras");
        papagaio.setBico("longo");
        papagaio.setEspecie("papagaio");
        System.out.println(papagaio.getRepetirPalavras());
        System.out.println(papagaio.getBico());
        System.out.println(papagaio.getEspecie());
        //abaixo você está alterando as informações da sua ave, passando por parametro a informação que deseja


        //TODO: Criar outras classes de passaros e estender as informações da super classe.
        //TODO: Setar(alterar as informações das variaveis e em seguida mostrar os dados na tela pegando os valores com o GET)
    }
}
