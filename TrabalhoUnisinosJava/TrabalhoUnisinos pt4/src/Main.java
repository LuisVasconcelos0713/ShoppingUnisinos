//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Loja loja1 = new Loja("Livraria 54", 54,1000,new Endereco("irai", "sapucaia do sul","Rio Grande do Sul","Brasil","93212570","97","Casa"), new Data(13,7,2024));
        //System.out.println(loja1.toString() );
        //loja1.gastosComSalario();
        //loja1.tamanhoDaLoja();
        //loja1.getDataFundacao();
        //Produto produto1 = new Produto("Jantar Secreto", 49.90F);
        //System.out.println(produto1.toString());

        Endereco endereco1 = new Endereco("Irai","Sapucaia do Sul", "Rio Grande do Sul", "Brasil", "93212-570","97","Casa");
        //System.out.println(endereco1.toString());

        Data data1 = new Data(29,2, 2024);
        //System.out.println(data1.toString());

        Cosmetico cosmetico1 = new Cosmetico("Oboticario",54,9000,endereco1,data1,20,3);
        System.out.println(cosmetico1.toString());

        Vestuario vestuario1 = new Vestuario("Nike",54,9000,endereco1,data1,true,3);
        System.out.println(vestuario1.toString());

        Bijuteria bijus1 = new Bijuteria("BijuGold",54,9000,endereco1,data1,20,3);
        System.out.println(bijus1.toString());

        Alimentacao alimentacao1 = new Alimentacao("Sushito",54,9000,endereco1,data1,data1,3);
        System.out.println(alimentacao1.toString());

        Informatica informatica1 = new Informatica("TerabyteKabum",54,9000,endereco1,data1,543,3);
        System.out.println(informatica1.toString());

        Shopping shopping = new Shopping("park shopping",endereco1,3);


        shopping.insereLoja(bijus1);
        shopping.insereLoja(bijus1);
        int total = shopping.quantidadeLojasPorTipo("Bijuteria");

        System.out.println(total);
    }
}