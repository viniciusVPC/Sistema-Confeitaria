package DTO;

public class IdNaoEncontradoDTO extends Exception{
    @Override
    public String getMessage(){
        return "O Id digitado não foi encontrado! Tente novamente.";
    }
}