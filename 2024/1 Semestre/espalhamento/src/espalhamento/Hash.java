package espalhamento;

public class Hash {
    
    private static int tamanho = 1;
    private static int[] tabela;
    
    public static void criar(int qtd){
        int total = qtd*2;
        while (!ePrimo(total)){
            total--;
        }
        tamanho = total;
        tabela = new int[tamanho];
    }
    
    private static boolean ePrimo(int numero){
        for (int i = 2 ; i < numero ; i++){
            if ( (numero % i) == 0){
                return false;
            }
        }        
        return true;
    }
    
    private static int fatorhash(int key){
        return (key % tamanho);
    }
    
    public static void inserir(int valor){
        int id = fatorhash(valor);
        while (true){
            if (tabela[id] == 0){
                tabela[id] = valor;
                break;
            }
            id = fatorhash(id+1);
        }
    }
    
    public static int busca(int valor){
        int id = fatorhash(valor);
        while(true){
            if (tabela[id] == valor){
                return tabela[id];
            }
            else{
                if (tabela[id] == 0){
                    break;
                }
                else {
                    id = fatorhash(id+1);
                }                
            }
        }        
        return 0;
    }
    
    public static int[] retorno(){
        return tabela;
    }
    
    
}
