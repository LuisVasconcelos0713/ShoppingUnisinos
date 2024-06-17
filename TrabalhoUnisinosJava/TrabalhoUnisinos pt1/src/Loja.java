public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        salarioBaseFuncionario = -1;
    }

    public String toString(){
        return "Loja: " +
                "Nome: " + getNome() + ", " +
                "Quantidade de funcionarios: " + getQuantidadeFuncionarios() + ", " +
                "Salario base Funcionarios: " + "R$"+getSalarioBaseFuncionario();
    }

    public float gastosComSalario(){
        if(salarioBaseFuncionario > 0){
            return this.salarioBaseFuncionario * quantidadeFuncionarios;
            /* ==== Modelo exibindo na tela ====
            *  float i;
            *  i = this.salarioBaseFuncionario * quantidadeFuncionarios;
            *  return i;
            * */
        }else{
            return -1;
        }
    }

    public char tamanhoDaLoja(){
        if(this.quantidadeFuncionarios < 10){
            //System.out.println("loja é pequena");
            return 'P';
        }else if(this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30){
            //System.out.println("loja é média");
            return 'M';
        } else if (this.quantidadeFuncionarios >= 31) {
            //System.out.println("loja é grande");
            return 'G';
        }
        System.out.println("loja");
        return 'n';
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
}
