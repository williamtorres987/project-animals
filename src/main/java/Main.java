import animals.Ave;

public class Main {

    public static void main(String[] args) {

        System.out.println(":::::::::::::A ave abaixo é um Tucano:::::::::::::");
        //abaixo você está utilizando a classe Ave para criar um objeto
        Ave tucano = new Ave();
        //abaixo você está alterando as informações da sua ave, passando por parametro a informação que deseja
        tucano.setBico("bico fino");
        tucano.setCor("vermelho");
        tucano.setEspecie("tucano");
        tucano.setTamanho("porte pequeno");
        //abaixo você está pegando os dados da sua ave e mostrando eles no console
        System.out.println(tucano.getBico());
        System.out.println(tucano.getCor());
        System.out.println(tucano.getEspecie());
        System.out.println(tucano.getTamanho());

        System.out.println(":::::::::::::A ave abaixo é um papagaio:::::::::::::");
        //abaixo você está utilizando a classe Ave para criar um objeto
        Ave papagaio = new Ave();
        //abaixo você está alterando as informações da sua ave, passando por parametro a informação que deseja
        papagaio.setBico("bico longo");
        papagaio.setCor("azul");
        papagaio.setEspecie("arara");
        papagaio.setTamanho("porte pequeno");
        //abaixo você está pegando os dados da sua ave e mostrando eles no console
        System.out.println(papagaio.getBico());
        System.out.println(papagaio.getCor());
        System.out.println(papagaio.getEspecie());
        System.out.println(papagaio.getTamanho());

        //TODO: proxima aula iremos ver sobre o conceito de herança no Java
    }
}
