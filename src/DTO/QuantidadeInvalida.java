package DTO;

public class QuantidadeInvalida extends Exception{
    @Override
    public String getMessage(){
        return "Quantidade inválida! Por favor, digite uma quantidade inteira positiva.";
    }
}
