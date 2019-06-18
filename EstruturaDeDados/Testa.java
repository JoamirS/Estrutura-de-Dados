package EstruturaDeDados;
// Impotando a biblioteca java para input do teclado
import java.util.Scanner;

/**@author Joamir Silveira*/

// Minha classe para testar os métodos da Lista e da Arvore
public class Testa {
    // Método main para executar minhas classes 
    public static void main(String[] args){
        // Mostrando as possiblidades para o usuário
        System.out.println("Escolha a ação que você deseja fazer:");
        System.out.println("Opção 1: Inserir no Início da lista");
        System.out.println("Opção 2: Inserir no Fim da lista");
        System.out.println("Opção 3: Remover no Inicio da lista ");
        System.out.println("Opção 4: Remover no Fim da lista");
        System.out.println("Opção 5: Retornar a quantidade de itens da lista");
        System.out.println("Opção 6: Fazer busca pré-ordem");
        System.out.println("Opção 7: Fazer buscar pós-ordem");
        System.out.println("Opção 8: Fazer busca simétrica");
        
        // Usando a biblioteca para usar o teclado
        Scanner scan = new Scanner(System.in);
        
        /* Declarando a variável que irá armazenar os numeros inseridos pelo
           pelo teclado. */
        int metodo;
        metodo = scan.nextInt();
        
        // Fazendo o swith case
        switch(metodo){
            case 1:
                Lista insereI = new Lista();
                insereI.insereInicio(metodo);
                break;
            case 2:
                Lista insereF = new Lista();
                insereF.insereFim(metodo);
                break;
            case 3:
                Lista removeI = new Lista();
                removeI.RemoveInicio();
                break;
            case 4:
                Lista removeF = new Lista();
                removeF.RemoveFim();
                break;
            case 5:
                Lista total = new Lista();
                total.total();
                break;
            case 6:
                Arvore pre = new Arvore();
                pre.buscapreordem(metodo, null);
                break;
            case 7:
                Arvore pos = new Arvore();
                pos.buscaposordem(metodo, null);
                break;
            case 8:
                Arvore simetrica = new Arvore();
                simetrica.buscasimetrica(metodo, null);
                break;
                
        }
    }
}
/* Fonte de Pesquisa: 
Github.com, Apostila Caelum Estrutura de Dados, Wikipedia.com e Youtube */