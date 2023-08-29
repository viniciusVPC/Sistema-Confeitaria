package DTO;

public class IndiceInvalidoDTO extends Exception{
    @Override
    public String getMessage(){
        return "Indice inválido! Por favor, digite um índice exstente no Banco de Dados.";
    }
}
