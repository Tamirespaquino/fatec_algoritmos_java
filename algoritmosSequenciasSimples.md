-> Em java, funciona da seguinte forma: entrada->processamento->saída. Existem módulos responsáveis por tarefas específicas, chamadas classes, que estão organizadas em pacotes.
-> Classe 'system' tem método chamado print e o executa. A classe system está no pacote principal, o pacote núcleo, o JavaLang, que não precisa importar
-> Classe 'JOptionPane' tem método chamado showMessageDialog e o executa. Ela está no pacote Javax.swing. Como ele não faz parte do núcleo, precisa importá-lo.
-> Nome de classe é sempre maiúscula e respeita o camelCase
-> Todo método começa com minúscula e também respeita o camelCase
-> O nome do arquivo tem que ter o nome da classe.
-> Existe método print, que exibe e não muda de linha (cursor fica no final da linha), o println, que exibe e muda a linha, e o printf exibe dados formatados.
-> Lembrar da indentação
-> Procedimento de como programar em Java:
    1. Escreve o programa (editar/corrigir)
    2. Salva NomeDaClasse.java
    3. Compila (javac NomeDaClasse.java)
        se erro, volta para 1
        se não, vai para 4
    4. Executa (java NomeDaClasse)
    5. Fim!

-> Algoritmo básico:
    * entrada -> procesamento -> saída
    * Toda informação que vai ser processada precisa estar na memória => variáveis
    * Variáveis são espaços reservados na memória para armazenar informações.
    * Variável: 
        - tipo -> define o tipo de informação
        - identificador único -> identifica qual variável está sendo utilizada
    * Para usar variáveis em java, precisamos declarar:
        tipo lista de variáveis;
    * Tipos primitivos do Java:
        - int: valores inteiros
        - double: valores de pontos flutuantes com dupla precisão
        - boolean: valores true/false
        - char: caracter
        - Especial: string-> sequencia de caracteres
    * Montar sentenças: "mensagem" + variavel + "mensagem" + variavel... O + concatena strings. 
    *Operações aritmeticas simples:
        +: soma
        -: subtração
        *: multiplicação
        /: divisão depende dos tipos. Se for inteiro/inteiro = inteiro, mas se for inteiro/double ou double/inteiro ou double/double, retorna um double
        %: resto da divisão inteira (módulo)
    * Quando se quer que uma divisão inteira dê um resultado double (float), então vc força através do casting.
    * Limitar casas decimais depois da vírgula através do printf.

-> Classes são organizadas por pacotes. Tipos:
    * Scanner (java.util): responsável pela entrada de dados. Métodos específicos para cada tipo de variável

    * JOptionPane (javax.swing): métodos de leitura que sempre devolve uma String

-> Método showInputDialog: é a caixa de diálogo para input (entrada). Método da classe JOptionPane, classe responsável por executar o showInputDialog e o retorno é sempre uma string. Ou seja, para se obter outros tipos, precisa-se converter. Para inteiro, Integer.parseInt. Para ponto flutuante, Double.parse. Para booleanos, Boolean.parseBoolean.

-> Caracteres: 'a', ',', '/'
   String: é uma sequencia de caracteres. Exemplo: "amor", "programar exige estudo". Quando se quer um caracter, pega a posição daquele caracter, a qual começa em 0. Para ler um caracter via showInputDialog:
    * ler a String
    * usar charAt(posição que deseja)

-> Aplicações para valores geradps randomicamente
    * Geração de senhas
    * Geração dinâmica de endereços de IP para uma rede: DHCP
    * Jogos
    * Em java:
        - Random: não tem um método só. Pertence ao pacote java.util - precisa importar. Ex.: nextInt, nextDouble, nextParse, etc

        - Math: random: gera valores entre 0 (incluído) e 1 (excluído). Pertence ao pacote java.lang - é o núcleo - não precisa importar.

