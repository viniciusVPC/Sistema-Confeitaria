package DTO;

public class AnoInvalidoDTO extends Exception{
    @Override
    public String getMessage(){
        return "Ano de nascimento inválido! Por favor insira um ano válido.";
    }
}
