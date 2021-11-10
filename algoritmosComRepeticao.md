-> Operadores incremento/decremento:
    * Acumuladores:
        - Operador atribuição (=): 
            § Variável = expressão -> diz-se que uma variável recebe o valor da expressão.
            § Exemplos: 
                int x = 12;
                int y = 2 * x;
                int z = x - 4*y
            § Cuidado: atribuição não é comutativa. Ex.: x + 2 = a -> NÃO poode porque a atribuição é da direita para esquerda sempre
            § Pode-se ter expressões de acumuladores: 
                int a = 2;
                a = a + 1; 
            § Outros exemplos:
                int x = 10;
                x = x - 1;
                x = x * 3;
                x = x/10;
                x = x % 2;

            § ##variável = variável operador expressão## -> processador avalia e manda o valor de volta

        - Formas diferentes de escrever expressões:
            § Operador incremento: ++. Ele simplifica a escrita de uma expressão com operador '+ 1'
                x = x + 1 -> x++
            § Operador decremento: --, y = y -1 -> y--
            § Outros operadores:
                a = a + 2 -> a += 2;
                b = b * 3 -> b *= 3;
                String palavra = 'oba';
                palavra = palavra + 'tem feriado'; -> concatena sentenças

    * Comandos de repetição:
        - While: é um super if
        - Do/while
        - For

    * Como funcionam os comandos de repetição:
        - TODO comando de repetição tem 3 elementos:
            § início: onde a repetição começa
            § fim: onde a repetição termina
            § passo: permite a atualização dos valores de início até o fim
        - Teste de continuidade: permite verificar se a repetição deve ocorrer mais uma vez ou encerrar. Alguns comandos fazem o teste no início e outros fazem no fim. Em java, C, C#, é comum fazer testes de falso, ou seja, ele processa enquanto a proposição for falso. Quando der verdadeiro, ele retorna o resultado e para o processamento.
        - Controle do laço:
            § contador: sabe-se quantas vezes o laço vai repetir
            § sentinela: não se sabe quantas vezes o laço repete e existe uma condição que define a situação no tempo de execução.
    
    * Como são comandos da linguagem Java:
        - Controle:
            Sentinela: do/while e while -> teste de continuidade no final -> os comandos são executados pelo menos uma vez
            Contador: for -> teste de continuidade no início -> os comandos podem não ser executados
        - Todos os comandos podem utilizar qualquer controle. Só ficam mais simples com os que foram definidos
    
    * Comando while: 
        - É um comando com teste de início
        - Funciona muito bem para controle com sentinela, mas pode ser usado com contadores
        - Sintaxe: 
            § Antes do comando, é preciso estabelecer a condição inicial (valor inicial do contador ou o valor inicial da condição de continuidade)

            § while (condição verdadeira) {
                todas as instruções que devem se repetir 
                atualizações de condição de continuidade
            }

        - Exemplos while:
            1 - Ler 10 valores, calcular e mostrar a média entre eles
                media = soma(valores)/quantidade
                uma variável para leitura <- vai ser atualizado em cada iteração
                uma variável para soma <- vai ser atualizado em cada iteração e vai acumular os vlaores
                depois disso, dividir

-> Observações:
    * Construtor não é método. É um bloco especial de inicialização de objetos
    * Não se declara mais que um objeto da classe Scanner na mesma aplicação
    
-> FOR:
    - É um while compactado
    - É um comando com teste de *início*
    - Funciona muito bem para controle com laços contados, mas pode ser usado com sentinela
    - Sintaxe:
        * for (condição de início; teste de continuidade; atualização da condição) {
            todas as instruções que devem se repetir
        }

-> DO - WHILE:
    * Teste de continuidade no final e é usado para controle de sentinela
    * Pode haver uma inicialização da condição
        do {
            instruções que podem se repetir
        } while (condição verdadeira);
    * 
    