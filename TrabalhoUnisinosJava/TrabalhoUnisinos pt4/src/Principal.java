import java.sql.SQLOutput;

public class Principal {
    public static void main(String[] args) {

        while(true){
            int opcao = Teclado.leInt("Selecione uma das opções abaixo (1) Criar uma Loja  (2) Criar um produto  (3) sair ");

            if(opcao == 1){
                String nome = Teclado.leString("Nome da Loja");
                int quantidadeFuncionarios = Teclado.leInt("Quantidade de funcionarios");
                int salarioBaseFuncionarios = Teclado.leInt("Salario base dos funcionarios");

                 String nomeDaRua = Teclado.leString("Digite a rua");
                 String cidade = Teclado.leString("Digite a cidade");
                 String estado = Teclado.leString("Digite o estado");
                 String pais = Teclado.leString("Digite o pais");
                 String cep = Teclado.leString("Digite o cep");
                 String numero = Teclado.leString("Digite o numero");
                 String complemento = Teclado.leString("Digite o complemento");

                Endereco endereco = new Endereco(nomeDaRua,cidade,estado,pais,cep,numero,complemento);

                int dia = Teclado.leInt("Digite o dia");
                int mes = Teclado.leInt("Digite o mes");
                int ano = Teclado.leInt("Digite o ano");

                Data data = new Data(dia,mes,ano);

                Loja loja = new Loja(nome,quantidadeFuncionarios,salarioBaseFuncionarios,endereco,data,3);
                System.out.println("Loja criada com sucesso!");
                System.out.println("Nome da loja: " + loja.getNome());
                System.out.println("Quantidade de funcionarios da loja: " +loja.getQuantidadeFuncionarios());
                System.out.println("Salario base da loja: " +loja.getSalarioBaseFuncionario());
                System.out.println("Data de abertura da loja: " +loja.getDataFundacao());
                System.out.println("Endereço da loja:" +loja.getEndereco());


            } else if (opcao == 2) {
                String nome = Teclado.leString("Nome do Produto");
                int preco = Teclado.leInt("Digite o preco");

                int dia = Teclado.leInt("Digite o dia");
                int mes = Teclado.leInt("Digite o mes");
                int ano = Teclado.leInt("Digite o ano");

                Data dataValidade = new Data(dia,mes,ano);

                Produto produto = new Produto(nome,preco,dataValidade);
                System.out.println("Produto criado com sucesso");

                Data dataAtual = new Data(20,10,2023);

                if (produto.estaVencido(dataAtual)) {
                    System.out.println("Produto Vencido");
                } else {
                    System.out.println("Produto não vencido");
                }

            } else if (opcao == 3) {
                System.out.println("Saindo....");
                break;
            }else {
                System.out.println("Opcao invalida");
            }

        }
    }
}
