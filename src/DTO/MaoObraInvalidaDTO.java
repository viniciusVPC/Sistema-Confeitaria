package DTO;

public class MaoObraInvalidaDTO extends Exception{
   @Override
    public String getMessage(){
        return "Valor de mão de obra inválido! Por favor digite um valor.";
    } 
}
