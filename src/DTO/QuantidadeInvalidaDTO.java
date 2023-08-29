package DTO;

public class QuantidadeInvalidaDTO extends Exception{
    @Override
    public String getMessage(){
        return "Quantidade inválida! Por favor, digite uma quantidade inteira positiva.";
    }
}
