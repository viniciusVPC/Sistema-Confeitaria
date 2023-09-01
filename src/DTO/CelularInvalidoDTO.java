package DTO;

public class CelularInvalidoDTO extends Exception{
    @Override
    public String getMessage(){
        return "Número de celular inválido! Por favor digite um número com mais de 9 dígitos.";
    }
}
