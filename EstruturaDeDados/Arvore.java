package EstruturaDeDados;

/**@author Joamir Silveira*/

/* Minha classe Arvore com a raiz de elementos da Lista, a quantidade de nós. */
public class Arvore {
    CelulaArvore raiz;
    int quantidade;
    // Primeiro será feita a busca pré-ordem
    // Se a raiz não for nula, irá visitar a raiz e retornar seu dado.
    public int buscapreordem(int dado, CelulaArvore raiz){
        if(raiz != null){
            if(raiz.dado == dado){
                return dado;
            }
        // Em seguida irá percorrer para a esquerda.
        buscapreordem(dado, raiz.esquerda);
        // E por fim, percorrerá a 'caixinha' direita.
        buscapreordem(dado, raiz.direita);
        }
        return dado;
}
    // Em segundo lugar será feita a busca pós-ordem.
    // Se a raiz não for nula...
    // ... a busca pela raiz esquerda vem primeiro
    public int buscaposordem(int dado, CelulaArvore raiz){
        if(raiz != null){
            buscaposordem(dado, raiz.esquerda);
            // Em seguida, a busca vai para a 'caixinha' direita.
            buscaposordem(dado, raiz.direita);
            // E por último, buscará a raiz e retornará seu dado.
            if(raiz.dado == dado){
                return dado;
            }
        }
        return dado;
    }
    // Em terceiro lugar será feita a busca simétrica
    public int  buscasimetrica(int dado, CelulaArvore raiz){
        // Se a raiz não for nula...
        // ... a busca pela raiz esquerda vem primeiro
        if(raiz != null){
            buscasimetrica(dado, raiz.esquerda);
        // Em seguinda, busca-se a raiz e retorna seu dado.
            if(raiz.dado == dado){
                return dado;
            }
        // E por último busca-se a 'caixinha' da raiz.direita.
            buscasimetrica(dado, raiz.direita);
        }
        return dado;
        
    }
}

/* Fonte de Pesquisa: 
Github.com, Apostila Caelum Estrutura de Dados, Wikipedia.com,
https://www.ime.usp.br/~song/mac5710/slides/05tree */
