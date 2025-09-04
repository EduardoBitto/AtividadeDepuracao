# AtividadeDebug

### Explicação do Código.
#### Início do Código.
   O código inicia apresentando um **menu** ao usuário, onde são apresentadas 4 opções, são elas:
  - Adicionar tarefa.
  - Mover tarefa.
  - Listar tarefas.
  - Sair.  
   O código continua após a escolha do usuário, abaixo encontra-se a explicação aprofundada de cada escolha e o que ocorre após cada escolha.

  
#### Adicionar Tarefa.
   Ao escolher a primeira opção *"adicionar tarefa"*, o usuário deve informar ao sistema o **Título** da tarefa e a **Descrição** da tarefa.  
   Toda nova tarefa é adicionada com o status "TO DO", ou seja, que ainda deve ser realizada.  
   Após informar ao sistema o título e descrição, o *menu* é exibido novamente.

  
#### Mover Tarefa.
   Ao selecionar a segunda opção *"mover tarefa"*, é solicitado ao usuário o ID da tarefa que deve ser movida, depois disso, o usuário deve informar o novo status da tarefa, são eles:
  - "TO DO" --> Tarefa que ainda deve ser realizada.
  - "DOING" --> Tarefa que está sendo realizada / no processo de realização.
  - "DONE"  --> Tarefa que já foi realizada / concluída.  
   Depois de informar o novo status da tarefa, o *menu* é exibido novamente.  
   Vale mencionar que caso o usuário informe um ID inexistente, o programa retorna a mensagem **"Tarefa não encontrada."** e apresenta o *menu* novamente.

  
#### Listar Tarefas.
   Optando pela terceira opção *"listar tarefas"*, é apresentado ao usuário todas as tarefas, dividas pelo seu status.
   
   Exemplo:  
    **TO DO**  
  1 Título (TO DO)  
    **DOING**  
  2 Título (DOING)  
    **DONE**  
  3 Título (DONE)  

   Os números indicados antes do título de cada tarefa é o seu ID, ao lado do ID é apresentado o título para reforçar, o status da tarefa é colocado entre parênteses.  
   Abaixo da lista, o *menu* é apresentado ao usuário.

  
#### Sair.
   Caso o usuário escolha a quarta opção *"sair"*, o programa apresenta a mensagem **"Saindo..."** e o programa é automaticamente finalizado.
