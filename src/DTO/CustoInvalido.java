package DTO;

public class CustoInvalido extends Exception{
    @Override
    public String getMessage(){
        return "Custo inválido! Por favor, digite um valor válido.";
    }
}
