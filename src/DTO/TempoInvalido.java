package DTO;

public class TempoInvalido extends Exception{
    @Override
    public String getMessage(){
        return "Tempo inválido! Por favor, digite um tempo válido.";
    }
}
