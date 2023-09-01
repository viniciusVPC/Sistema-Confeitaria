package DAO;

import DTO.UsuarioDTO;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    //atributos
    private Connection co;
    private PreparedStatement pstm;

    //comportamento
    public ResultSet autenticacaoUsuario(UsuarioDTO userDTO) {
        co = new ConexaoDAO().conectar();
        try {
            String sql = "select * from usuario Where nome_usuario = ? "
                    + "and senha_usuario = ?";
            pstm = co.prepareStatement(sql);

            pstm.setString(1, userDTO.getNome());
            pstm.setString(2, userDTO.getSenha());
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro UsuarioDAO: " + ex.getMessage());
            return null;
        }
    }
    
    public void cadastrarUsuario(UsuarioDTO objUsuarioDTO){
        co = new ConexaoDAO().conectar();
        try{
            String sql = "insert into Usuario (nome_usuario, senha_usuario, data_usuario, celular_usuario, cpf_usuario, rg_usuario, email_usuario) values(?,?,?,?,?,?,?,?)";
            pstm = co.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome());
            pstm.setString(2, objUsuarioDTO.getSenha());
            pstm.setString(3, objUsuarioDTO.getDataNasc());
            pstm.setString(4, objUsuarioDTO.getCelular());
            pstm.setString(5, objUsuarioDTO.getCpf());
            pstm.setString(6, objUsuarioDTO.getRg());
            pstm.setString(7, objUsuarioDTO.getEmail());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!!!");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro UsuarioDAO: " + ex.getMessage());
        }
    }
}
