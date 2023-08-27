package VIEW;

import DTO.*;
import javax.swing.JOptionPane;

public class Comportamento {

    static private Produto[] produtos = new Produto[0];
    static private int indice = 0;
    static private boolean houveErro;

    static void InserirProduto(String nome, String tipo, double tempo, double custo, int quant, InserirProdutoVIEW janela, Produto produtoEdit, boolean editando) {
        Produto produto;
        if (editando) {
            produto = produtoEdit;
            System.out.println("Editando");
        } else {
            produto = new Produto();
        }

        try {
            produto.setNome(nome);
        } catch (NomeInvalido ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }

        try {
            produto.setTipo(tipo);
        } catch (TipoInvalido ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }

        try {
            produto.setTempoProducao(tempo);
        } catch (TempoInvalido ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }

        try {
            produto.setCustoAprox(custo);
        } catch (CustoInvalido ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }

        try {
            produto.setQuantidade(quant);
        } catch (QuantidadeInvalida ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }
        
        produto.setValor(tempo, custo);

        if (!editando) {
            produto.setIdProduto(indice + 1);
        } else {
            System.out.println("Editando");
        }
        

        if (!houveErro) {
            System.out.println(indice);
            String mensagem;
            if (!editando) {
                mensagem = "Produto cadastrado com sucesso. Seu novo id é: " + produto.getIdProduto();
                if (indice >= produtos.length) {
                    AumentarArray();
                }
                produtos[indice] = produto;
                indice++;
            } else {
                mensagem = "Produto editado com sucesso.";
            }

            JOptionPane.showMessageDialog(null, mensagem);
            janela.apagarTextos();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível criar um produto!");
            houveErro = false;
        }
    }

    static String ExibirEstoque() {
        String banco = "";
        if (produtos.length >= 1) {
            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i] != null) {
                    banco += ((i + 1) + " - " + produtos[i].getNome() + "\r\n");
                }
            }
        } else {
            banco = "Não há nenhum produto no estoque.";
        }
        return banco;
    }

    static void ApagarProduto(int id) {

        Produto newArr[] = new Produto[produtos.length - 1];

        if (newArr.length >= 0) {
            int selecao = 0;
            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i].getIdProduto() == id + 1) {
                    selecao = i;
                }
            }
            for (int i = 0; i < newArr.length; i++) {
                if (i < selecao) {
                    newArr[i] = produtos[i];
                }
                if (i >= selecao) {
                    newArr[i] = produtos[i + 1];
                }
            }
        }

        produtos = newArr;
        indice--;
        JOptionPane.showMessageDialog(null, "Produto apagado com sucesso.");
    }
    
    static Produto getProduto(int indice) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getIdProduto() == indice + 1) {
                return produtos[i];
            }
        }
        return null;
    }

    static String ExibirInfoProduto(int indice) {
        return produtos[indice].toString();
    }

    private static void AumentarArray() {
        Produto newArr[] = new Produto[produtos.length + 5];
        System.arraycopy(produtos, 0, newArr, 0, produtos.length);
        produtos = newArr;
    }

    static void validarIndice(int indice) throws IndiceInvalido {
        if (indice >= produtos.length) {
            throw new IndiceInvalido();
        }
    }
    
    static int getIndice(int id) throws IdNaoEncontrado{
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getIdProduto() == id) {
                return i;
            }
        }
        throw new IdNaoEncontrado();
    }
}
