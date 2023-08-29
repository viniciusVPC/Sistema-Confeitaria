package DTO;

public class CustoInvalidoDTO extends Exception{
    @Override
    public String getMessage(){
        return "Custo inválido! Por favor, digite um valor válido.";
    }
}
