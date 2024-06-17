public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.ano = ano; // Necessário para a validação do ano bissexto
        if (validarData(dia, mes)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Definindo data padrão para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean validarData(int dia, int mes) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1) {
            return false;
        }
        switch (mes) {
            case 2:
                if (verificaAnoBissexto()) {
                    return dia <= 29;
                } else {
                    return dia <= 28;
                }
            case 4: case 6: case 9: case 11:
                return dia <= 30;
            default:
                return dia <= 31;
        }
    }

    public String toString() {
        return "Data: " +
                "dia: " + getDia() +
                ", mes: " + getMes() +
                ", ano: " + getAno();
    }

    public boolean verificaAnoBissexto() {
        if ((getAno() % 4 == 0 && getAno()  % 100 != 0) || (getAno()  % 400 == 0)) {
            return true;
        }
        return false;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
