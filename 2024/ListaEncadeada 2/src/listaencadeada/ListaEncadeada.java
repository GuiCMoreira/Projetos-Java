/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaencadeada;

/**
 *
 * @author Luciano Pelissoli
 */
public class ListaEncadeada {

    /**
     * @param args the command line arguments
     */
    private static Lista<Paciente> normal;
    private static Lista<Paciente> prioritario;
    
    public static void main(String[] args) {
        // cria as listas
        normal = new Lista<Paciente>();
        prioritario = new Lista<>();
        // insere pacientes nas listas
        normal.insert(new Paciente("jose",35));
        normal.insert(new Paciente("Geremias",39));
        prioritario.insert(new Paciente("Beltrano",85));
        prioritario.insert(new Paciente("Maria",75));
        
        // tenta inserir no inicio
        normal.insertBegin(new Paciente("Godofredo",67));
        // tenta inserir após o elemento 0
        try{
            normal.insertAfter(0, new Paciente("Francisco",45));
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        // tenta inserir após o elemento 1
        try{
            normal.insertAfter(1, new Paciente("Francisco",45));
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        // tenta inserir em posicao que não existe
        // nesta situação não ocorre Run Time Error
        prioritario.insertAfter(99, new Paciente("Josefina",98));
        // busca um paciente
        Paciente localizou = normal.buscar(new Paciente("Francisco",45));
        if (localizou != null){
            System.out.println("Localizado: " + localizou.toString());
        }
        else{
            System.out.println("Não existe.");
        }
        // listar o atendimento Normal
        System.out.println("Lista Normal");
        for (Paciente p : normal.listar()){
            System.out.println(p.toString());
        }
        // listar o atendimento prioritário
        System.out.println("Lista Prioridade");
        for (Paciente p : prioritario.listar()){
            System.out.println(p.toString());
        }
        // localizar um paciente para remoção
        localizou = normal.buscar(new Paciente("jose",35));
        localizou = normal.remover(localizou);
        if (localizou != null)
            System.out.println("removido: " + localizou.toString());
        else
            System.out.println("Não localizado.");
        // lista novamente
        System.out.println("Lista Normal");
        for (Paciente p : normal.listar()){
            System.out.println(p.toString());
        }
        System.out.println("Lista Prioridade");
        for (Paciente p : prioritario.listar()){
            System.out.println(p.toString());
        }
        System.out.println("Fim");
        System.exit(0);
    }
    
}
