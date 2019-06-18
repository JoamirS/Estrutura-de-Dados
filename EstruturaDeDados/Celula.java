package EstruturaDeDados;

/**@author Joamir Silveira*/

/* Classe célula, como se fosse um nó: Aquela 'caixinha' com anterior, proxima 
e o dado do nó.

        |-----------------------------|
-->>    | anterior  | dado |  proxima |
        |-----------------------------|
*/

public class Celula {
   public Celula anterior;
   public Celula proxima;
   Object dado;
}

/* Fonte de Pesquisa: 
Github.com, Apostila Caelum Estrutura de Dados, Wikipedia.com */