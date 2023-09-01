package DTO;

public class EmailInvalidoDTO extends Exception{
    @Override
    public String getMessage(){
        return "Email inválido! Por favor insira um email com \"@\".";
    }
}
