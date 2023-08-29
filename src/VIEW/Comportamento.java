package VIEW;

import DAO.UsuarioDAO;
import DTO.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Comportamento {

    static private ProdutoDTO[] produtos = new ProdutoDTO[10];
    static private UsuarioDTO[] usuarios = new UsuarioDTO[10];
    static private int indiceP = 0, indiceU = 0;
    static private boolean houveErro;

    static void InserirProduto(String nome, String tipo, double tempo, double custo, int quant, InserirProdutoVIEW janela, ProdutoDTO produtoEdit, boolean editando) {
        ProdutoDTO produto;
        if (editando) {
            produto = produtoEdit;
            System.out.println("Editando");
        } else {
            produto = new ProdutoDTO();
        }

        try {
            produto.setNome(nome);
        } catch (NomeInvalidoDTO ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }

        try {
            produto.setTipo(tipo);
        } catch (TipoInvalidoDTO ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }

        try {
            produto.setTempoProducao(tempo);
        } catch (TempoInvalidoDTO ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }

        try {
            produto.setCustoAprox(custo);
        } catch (CustoInvalidoDTO ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }

        try {
            produto.setQuantidade(quant);
        } catch (QuantidadeInvalidaDTO ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }

        produto.setValor(tempo, custo);

        if (!editando) {
            produto.setIdProduto(indiceP + 1);
        } else {
            System.out.println("Editando");
        }

        if (!houveErro) {
            System.out.println(indiceP);
            String mensagem;
            if (!editando) {
                mensagem = "Produto cadastrado com sucesso. Seu novo id é: " + produto.getIdProduto();
                if (indiceP >= produtos.length) {
                    AumentarArray(produtos);
                }
                produtos[indiceP] = produto;
                indiceP++;
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

        ProdutoDTO newArr[] = new ProdutoDTO[produtos.length - 1];

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
        indiceP--;
        JOptionPane.showMessageDialog(null, "Produto apagado com sucesso.");
    }

    static ProdutoDTO getProduto(int indice) {
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

    private static void AumentarArray(ProdutoDTO[] produtos) {
        ProdutoDTO newArr[] = new ProdutoDTO[produtos.length * 2];
        System.arraycopy(produtos, 0, newArr, 0, produtos.length);
        produtos = newArr;
    }

    private static void AumentarArray(UsuarioDTO[] usuarios) {
        UsuarioDTO newArr[] = new UsuarioDTO[usuarios.length * 2];
        System.arraycopy(usuarios, 0, newArr, 0, usuarios.length);
        usuarios = newArr;
    }

    static void validarIndice(int indice) throws IndiceInvalidoDTO {
        if (indice >= produtos.length) {
            throw new IndiceInvalidoDTO();
        }
    }

    static int getIndice(int id) throws IdNaoEncontradoDTO {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getIdProduto() == id) {
                return i;
            }
        }
        throw new IdNaoEncontradoDTO();
    }

    static void InserirUsuario(String nome, int dia, int mes, int ano, String celular, String cpf, String rg, String email, String senha, double maoObra, CriarUsuarioVIEW janela, UsuarioDTO usuarioEdit, boolean editando) {
        UsuarioDTO usuario;
        if (editando) {
            usuario = usuarioEdit;
            System.out.println("Editando");
        } else {
            usuario = new UsuarioDTO();
        }
        try {
            usuario.setNome(nome);
        } catch (NomeInvalidoDTO ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }
        try {
            usuario.setDataNasc(dia, mes, ano);
        } catch (AnoInvalidoDTO ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }
        try {
            usuario.setCelular(celular);
        } catch (CelularInvalidoDTO ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }
        usuario.setCpf(cpf);
        usuario.setRg(rg);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        try {
            usuario.setMaoObra(maoObra);
        } catch (MaoObraInvalidaDTO ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
            houveErro = true;
        }

        if (!editando) {
            usuario.setIdUsuario(indiceU + 1);
        } else {
            System.out.println("Editando");
        }

        if (!houveErro) {
            System.out.println(indiceU);
            String mensagem;
            if (!editando) {
                mensagem = "Usuário cadastrado com sucesso. Seu novo id é: " + usuario.getIdUsuario();
                
                UsuarioDAO userDAO = new UsuarioDAO();
                userDAO.cadastrarUsuario(usuario);
                janela.dispose();
                LoginVIEW login = new LoginVIEW();
                login.setVisible(true);
                
            } else {
                mensagem = "Usuário editado com sucesso.";
            }

            JOptionPane.showMessageDialog(null, mensagem);
            janela.apagarTextos();
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar usuário!");
            houveErro = false;
        }

    }

    static void Login(String nome, String senha, LoginVIEW loginVIEW) {
        UsuarioDTO userDTO = new UsuarioDTO();
        try {
            userDTO.setNome(nome);
        } catch (NomeInvalidoDTO ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
        }
        userDTO.setSenha(senha);

        try {
            UsuarioDAO UserDAO = new UsuarioDAO();
            ResultSet rsUserDAO = UserDAO.autenticacaoUsuario(userDTO);
            if (rsUserDAO.next()) {
                JanelaAdmVIEW admVIEW = new JanelaAdmVIEW();
                admVIEW.setVisible(true);
                loginVIEW.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Comportamento: " + ex.getMessage());
        }
    }
}
