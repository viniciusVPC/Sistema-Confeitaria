package DTO;

public class NomeInvalidoDTO extends Exception{
    @Override
    public String getMessage(){
        return "Nome vazio! Por favor, digite um nome.";
    }
}
