/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filacicularvetor;

/**
 *
 * @author Luciano Pelissoli
 */
public class FilaCicularVetor {

    /**
     * @param args the command line arguments
     */
    private static final String[] nomes = {"Alberto",
    "Joao", "Maria", "Juliano", "Felizberto","Debora","Vanessa"};
    public static void main(String[] args) {
        // TODO code application logic here
        for (String nome : nomes) {
            try{
                System.out.println("Adicionando " + nome);
                FilaCircular.pop(nome);


            }catch(RuntimeException e){
                System.out.println(e.getMessage());
                System.out.printf("%s não foi inserido\n",nome);
            }
        }
        
        System.out.println("\nAvaliando a fila circular\n"+ 
                            FilaCircular.avaliar());
        boolean erro = false;
        int execucoes = 0;
        do{
            try{
                if (execucoes < 4){
                    System.out.println("Chamando " + FilaCircular.push());
                    System.out.println("\nAvaliando a fila circular\n"+ 
                            FilaCircular.avaliar());
                    execucoes++;
                }
                else{
                    System.out.println("Adicionando Rodrigo");
                    FilaCircular.pop("Rodrigo");
                    System.out.println("\nAvaliando a fila circular\n"+ 
                            FilaCircular.avaliar());
                    execucoes = 0;                    
                }
            }
            catch (RuntimeException e){
                System.out.println(e.getMessage());
                erro = true;
            }
        } while (!erro);
    }
    
}
