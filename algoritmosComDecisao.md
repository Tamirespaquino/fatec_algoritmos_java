-> Algoritmos de sequência simples
    * Entrada:
        - Classes que possuem métodos para entrada
        - Scanner: métodos next---
            # Métodos devolvem os tipos específicos
        - JOptionPane: showInputDialog
            # Método devolve String - precisamos converter: usamos parse (Classes Empacotadoras)
    * Processamento:
        - +, -, /, *, %
        - Math: métodos com funções matemáticas
    * Saída:
        - Classes que possuem métodos para saída
        - System.out: print, println, printf
        - JOptionPane: showMessageDialog

-> Algoritmos com decisão:
    * Controles de fluxo:
        - Decisão:
            # Permite verificar entrada/valores processados
            # Tomar alguma ação
            # if - else
            # Operador ternário
            # switch - case
        - Repetição:
         # Permite a execução de um conjunto de ações várias vezes
         # for
         # while
         # do - while

-> Representação dos fluxos de lógica:
    * Sequência simples:
       input -> entrada -> processamento -> saída -> output
    * Decisão simples:
       input -> entrada -> verificação -> processamento a (Verdadeiro) -> saída a -> output
                                       -> processamento b (Falso) -> saída b -> output
    * Repetição:
        input -> entrada -> verificação -> Verdadeiro -> processamento -> saída -> output
                                        -> Falso -> output

-> Comando if/else (se - senão):
    * Permite verificar condições LÓGICAS
        - Possuem valor verdadeiro (true) ou falso (false) - booleanos
        - Temos novos operadores
            # relacionais: relacionam valores, expressões
                § >: maior
                § >=: maior ou igual
                § <: menor
                § <=: menor ou igual
                § ==: igual -> verificando se uma expressão é igual a outra (pergunta). Se for apenas =, ele é atribuição
                § !=: diferente 
            # lógicos:
                § && : e
                § || : ou
                § | : não

-> Expressões lógicas simples:
    * int a = 7, b = 13, c =2;
        a > b (F)
        a <= b+c (V)
        c != a-b (V)
        b == (b-3*c) (F)
        a == (b-3*c) (V)

-> Expressões lógicas compostas:
    * int a = 7, b = 13, c =2;
       § a > b || c < b 
         F    ||    V 
               V (pensar na tabela verdade)

        § a <= b+c || c != a-b && b == b- 3*c
            V    ||    V     &&     F
            V    ||          F
                  V
        
        § !(a == b - 3*c)
            !V
             F

-> Comando if/else:
    * Em Java e C, escrevemos da seguinte maneira
        if (expressão lógica) {
            todos os comandos para o caso verdadeiro;
        }
        else {
            todos os comandos para o caso falso;
        }

