package EstruturaDeDados;// Pacote do projeto

/** @author Joamir Silveira*/

/* Minha classe lista com o total de elementos da Lista, a primeira célula e a 
ultima. */
public class Lista{
    int totalDeElementos = 0;
    private Celula primeira;
    private Celula ultima;
    
        // Inserindo no inicio
        public void insereInicio(Object dado){
            /* Será criado uma nova Celula para que sirva como nó da Lista e que
            irá receber o dado */
            Celula novo = new Celula();
            novo.dado = dado;
            if(this.totalDeElementos == 0){
            /* Se for a primeira inserção e o total de elementos for 0, o proximo
             e o anterior receberão null.
             Se o total for 0, a celula novo receberá na primeira e na ultima
             pelo fato de a lista estar vazia. */
                novo.anterior = null;
                novo.proxima = null;
                this.primeira = novo;
                this.ultima = novo;
               
            }else{
            /* Caso contrário, o nó novo apontará proxima para primeira, que por
            sua vez apontará para a 'caixinha' anterior, que irá receber novo.
            E por fim a primeira receberá novo, inserindo assim, no começo. */    
                novo.proxima = primeira;
                this.primeira.anterior = novo;
                this.primeira = novo;
            }
            /* Incrementa toda vez que uma das duas operações de inserção forem 
            executadas */
            this.totalDeElementos++; 
            }
        
        // Inserindo no fim
        public void insereFim(Object dado){
            /* Neste if, será reutilizado o método InsereInicio, pois se estiver
            vazia a lista, serve para este caso também.*/ 
            if(this.totalDeElementos == 0)
                this.insereInicio(dado);
            
            else{
            /* Senão, será instanciada uma celula novo para que a 'caixinha' 
                proxima, da celula ultima, aponte para ela.
            Depois a 'caixinha' anterior de novo irá apontar para a atual ultima.
            Após as duas se apontarem, a celula ultima recebe novo. */
                
                Celula novo = new Celula();
                this.ultima.proxima = novo;
                novo.anterior = this.ultima;
                this.ultima = novo;
            /* Incrementa toda vez que uma das duas operações de inserção forem 
            executadas */
            this.totalDeElementos++; 
                }   
            }
        
        // Removendo no início
        public void RemoveInicio(){
            /* Neste if, verifica se o total de elementos é igual a zero, se for
            igual a zero, aparece uma mensagem de erro, pois não se pode remover
            se não há nada. 
            */
            if(totalDeElementos == 0){
                    System.out.print("A lista está vazia, não pode remover se "
                            + "não há dados");
            }else{
            /* Senão, a primeira vai apontar para a próxima, e então irá ser
            decrementado a lista 
            */
            this.primeira = this.primeira.proxima;
            this.totalDeElementos--;
            }
        }
        // Removendo no fim
        public void RemoveFim(){
        /* Neste if será reutilizado o primeiro caso do método anterior, pois é 
        o mesmo caso se a lista estiver vazia. */
           if(totalDeElementos == 0){
                    System.out.print("A lista está vazia, não pode remover se "
                            + "não há dados");      
                    
        /* Senão, haverá o apontamento entre a penultima e a ultima celula da
        lista. Com a celula penultima recebendo a 'caixinha' anterior da ultima
        celula. Assim, a 'caixinha' proxima de penultima recebe null. Só então é
        decrementada a lista */
                    
            }else{
                Celula penultima = this.ultima.anterior;
                penultima.proxima = null;
                this.ultima = penultima;
                this.totalDeElementos--;
                
            }
        }
        /* Aqui o método é simples, só irá retornar a quantidade de elementos,
        após as operações */
        public int total(){
            return this.totalDeElementos;  
        }
}
/* Fonte de Pesquisa: 
Github.com, Apostila Caelum Estrutura de Dados, Wikipedia.com */