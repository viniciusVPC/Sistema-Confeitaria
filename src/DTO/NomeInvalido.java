package DTO;

public class NomeInvalido extends Exception{
    @Override
    public String getMessage(){
        return "Nome vazio! Por favor, digite um nome.";
    }
}
