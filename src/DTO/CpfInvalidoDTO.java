package DTO;

public class CpfInvalidoDTO extends Exception{
    @Override
    public String getMessage(){
        return "CPF inválido! Por favor insira um valor com 11 dígitos.";
    }
}
