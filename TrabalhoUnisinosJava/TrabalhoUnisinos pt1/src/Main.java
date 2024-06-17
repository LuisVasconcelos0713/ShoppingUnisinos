//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Loja loja1 = new Loja("Livraria 54", 54,1000);
        System.out.println(loja1.toString() );
        loja1.gastosComSalario();
        loja1.tamanhoDaLoja();

        Produto produto1 = new Produto("Jantar Secreto", 49.90F);
        System.out.println(produto1.toString());

        Endereco endereco1 = new Endereco("Irai","Sapucaia do Sul", "Rio Grande do Sul", "Brasil", "93212-570","97","Casa");
        System.out.println(endereco1.toString());

        Data data1 = new Data(29,2, 2024);
        System.out.println(data1.toString());
    }
}