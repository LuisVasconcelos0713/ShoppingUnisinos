public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int maxLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                '}';
    }

    public boolean insereLoja(Loja loja){
        for (int i = 0; i < lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equals(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int count = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                if (tipo.equals("Cosmetico") && loja instanceof Cosmetico) {
                    count++;
                } else if (tipo.equals("Vestuario") && loja instanceof Vestuario) {
                    count++;
                } else if (tipo.equals("Bijuteria") && loja instanceof Bijuteria) {
                    count++;
                } else if (tipo.equals("Alimentacao") && loja instanceof Alimentacao) {
                    count++;
                } else if (tipo.equals("Informatica") && loja instanceof Informatica) {
                    count++;
                }
            }
        }
        return count > 0 ? count : -1;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica maisCara = null;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (maisCara == null || informatica.getSeguroEletronicos() > maisCara.getSeguroEletronicos()) {
                    maisCara = informatica;
                }
            }
        }
        return maisCara;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }
}
