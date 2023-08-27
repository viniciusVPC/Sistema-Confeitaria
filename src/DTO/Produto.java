package DTO;

public class Produto {

    //Atributos
    String nome, tipo;
    double tempoProducao, custoAprox, valor;
    int idProduto, quantidade;

    //Métodos Acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalido {
        if (!"".equals(nome)) {
            this.nome = nome;
        } else {
            throw new NomeInvalido();
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws TipoInvalido {
        if (!"".equals(tipo)) {
            this.tipo = tipo;
        } else {
            throw new TipoInvalido();
        }
    }

    public double getTempoProducao() {
        return tempoProducao;
    }

    public void setTempoProducao(double tempoProducao) throws TempoInvalido {
        if (tempoProducao > 0) {

            this.tempoProducao = tempoProducao;
        } else {
            throw new TempoInvalido();
        }
    }

    public double getCustoAprox() {
        return custoAprox;
    }

    public void setCustoAprox(double custoAprox) throws CustoInvalido {
        if (custoAprox > 0) {
            this.custoAprox = custoAprox;
        } else {
            throw new CustoInvalido();
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double tempo, double custo) {
        this.valor = (tempo * 10) + custo;      //mudar 10 pro preço da chef
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) throws QuantidadeInvalida {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            throw new QuantidadeInvalida();
        }
    }

    //Comportamento
    @Override
    public String toString() {
        return ("Nome: " + nome + "\nTipo: " + tipo + "\nTempo de Produção: " + tempoProducao
                + "\nCusto Aproximado: " + custoAprox + "\nValor: " + valor
                + "\nQuantidade no Estoqe: " + quantidade);
    }
}
