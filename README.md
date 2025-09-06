# ListasEncadeadas

Este projeto implementa as estruturas de dados de Pilha e Fila utilizando listas encadeadas em Java. Além disso, inclui a função de Merge.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

  * **`Node.java`**: Representa um nó da lista encadeada, contendo um valor inteiro e uma referência para o próximo nó.
  * **`Pilha.java`**: Implementa a estrutura de dados de Pilha (LIFO - Last-In, First-Out).
  * **`Fila.java`**: Implementa a estrutura de dados de Fila (FIFO - First-In, First-Out).
  * **`FilaEncadeada.java`**: Uma segunda implementação da Fila, utilizada no processo de merge.
  * **`Merge.java`**: Contém a lógica para mesclar duas filas (`FilaEncadeada`) ordenadas.

### Como Executar

Você pode executar as funções Pilha, Fila e Merge que vão executar suas respectivas funções.

-----

### 1\. Pilha

A classe `Pilha.java` permite que você insira elementos em uma pilha e, opcionalmente, os remova.

**Exemplo de uso:**

Ao executar o comando, o programa solicitará que você digite os itens da lista.

1.  Digite os números que deseja empilhar, pressionando Enter após cada um.
2.  Digite `0` para parar de adicionar elementos.
3.  A pilha será impressa no console.
4.  Se desejar remover o último elemento adicionado, digite `1`. Você pode remover quantos elementos desejar.
5.  Digite qualquer outro número para parar de remover e exibir a pilha final.

### 2\. Testando a Fila

A classe `Fila.java` permite que você insira elementos em uma fila e, opcionalmente, os remova.

**Exemplo de uso:**

O processo é similar ao da pilha.

1.  Digite os números que deseja enfileirar, pressionando Enter após cada um.
2.  Digite `0` para parar de adicionar elementos.
3.  A fila será impressa.
4.  Se desejar remover o primeiro elemento que entrou, digite `1`.
5.  Digite qualquer outro número para parar de remover e exibir a fila final.

### 3\. Testando o Merge de Filas

A classe `Merge.java` permite criar duas filas ordenadas e, em seguida, mesclá-las em uma terceira fila, que também estará ordenada.

**Exemplo de uso:**

1.  O programa solicitará os itens para a primeira fila (Fila A). Digite números em ordem crescente e `0` para finalizar.
2.  Em seguida, solicitará os itens para a segunda fila (Fila B). Digite números também em ordem crescente e `0` para finalizar.
3.  As duas filas serão impressas, seguidas pela fila final mesclada e ordenada.
## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.
