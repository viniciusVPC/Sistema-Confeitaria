package DTO;

public class IdNaoEncontrado extends Exception{
    @Override
    public String getMessage(){
        return "O Id digitado não foi encontrado! Tente novamente.";
    }
}