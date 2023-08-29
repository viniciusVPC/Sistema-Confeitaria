package DTO;

public class UsuarioDTO {

    String nome, senha, dataNasc, Celular, cpf, rg, email;
    double maoObra;

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMaoObra() {
        return maoObra;
    }

    public void setMaoObra(double maoObra) {
        this.maoObra = maoObra;
    }

    public String getSenha() {
        return senha;
    }
    
    public String getNome() {
        return nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//id    
    //nome
    //dataNasc
    //Celular
    //valorMaoObra
    //cpf
    //rg
    //email
    //senha

    
}
