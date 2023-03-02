package src.main.java;

import src.main.java.animals.Ave;

public class Main {

    public static void main(String[] args) {
        Ave tucano = new Ave();
        tucano.setBico("bico fino");
        tucano.setCor("vermelho");
        tucano.setEspecie("tucano");
        System.out.println(tucano.getBico());
        System.out.println(tucano.getCor());
        System.out.println(tucano.getEspecie());

        Ave papagaio = new Ave();
        papagaio.setBico("bico longo");
        papagaio.setCor("azul");
        papagaio.setEspecie("arara");
        System.out.println(papagaio.getBico());
        System.out.println(papagaio.getCor());
        System.out.println(papagaio.getEspecie());
    }
}
