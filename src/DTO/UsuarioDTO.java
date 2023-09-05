package DTO;

import java.time.Year;
import java.util.regex.*;

public class UsuarioDTO {

    //Atributos
    String nome, senha, dataNasc, Celular, cpf, rg, email;
    int idUsuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    //Métodos Acessores
    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dia, int mes, int ano) throws AnoInvalidoDTO {
        int anoAtual = Year.now().getValue();
        String dataNasc;
        if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > anoAtual - 100 && ano < anoAtual - 18) {
            dataNasc = "" + dia + "/" + mes + "/" + ano;
            this.dataNasc = dataNasc;
        } else {
            throw new AnoInvalidoDTO();
        }
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String celular) throws CelularInvalidoDTO {
        if (celular.length() >= 9) {
            this.Celular = Celular;
        } else {
            throw new CelularInvalidoDTO();
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws CpfInvalidoDTO {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            throw new CpfInvalidoDTO();
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailInvalidoDTO {
        if (Pattern.compile("^(.+)@(\\S+)$").matcher(email).matches()) {
            this.email = email;
        } else {
            throw new EmailInvalidoDTO();
        }
    }

    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalidoDTO {
        this.nome = nome;
    }
}
