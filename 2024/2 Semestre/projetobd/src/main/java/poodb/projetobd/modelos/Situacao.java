package poodb.projetobd.modelos;

public enum Situacao {
    CURSANDO(0),
    CANCELADO(1),
    TRANCADO(2),
    APROVADO(30),
    REPROVADO(4);

    private int valor;

    Situacao(int valor){
        this.valor = valor;
    }
    
    public String toString(){
        return String.valueOf(valor);
    }
   
}
