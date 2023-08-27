package DTO;

public class TipoInvalido extends Exception{
    @Override
    public String getMessage(){
        return "Tipo vazio! Por favor, digite um tipo.";
    }
}
