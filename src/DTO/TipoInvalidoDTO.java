package DTO;

public class TipoInvalidoDTO extends Exception{
    @Override
    public String getMessage(){
        return "Tipo vazio! Por favor, digite um tipo.";
    }
}
