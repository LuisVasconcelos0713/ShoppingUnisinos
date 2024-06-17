public class Produto {
    private String nome;
    private int preco;

    private Data dataValidade;


    public Produto(String nome, int preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataDeValidade;
    }

    public String toString(){
        return "Produto: " +
                " Nome: " + getNome() + "," +
                "Preco: R$" + getPreco() + ", " +
                "Data de Validade: " + getDataValidade();
    }

    public boolean estaVencido(Data data) {
        if (data.getAno() > this.dataValidade.getAno()) {
            return true;
        } else if (data.getAno() == this.dataValidade.getAno()) {
            if (data.getMes() > this.dataValidade.getMes()) {
                return true;
            } else if (data.getMes() == this.dataValidade.getMes()) {
                if (data.getDia() > this.dataValidade.getDia()) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataDeValidade) {
        this.dataValidade = dataDeValidade;
    }
}

