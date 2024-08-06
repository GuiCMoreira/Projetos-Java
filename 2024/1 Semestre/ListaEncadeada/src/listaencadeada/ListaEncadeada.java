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
        System.out.println("Fim");
        System.exit(0);
    }
    
}
