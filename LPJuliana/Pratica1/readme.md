## Prática 1
#### Exercício 1 - Fazer um programa que imprime os números de 1 a 5 na tela. 
#### Usando for (início; teste; incremento ) { instruções do bloco }
Dicas:
<br>
a) este programa não requer entrada do usuário, ou seja, não precisaremos nos preocupar com a leitura do teclado;
<br>
b) para imprimir na tela um número podemos usar a instrução System.out.println( 1 );
<br>
c) para imprimir todos os números precisaremos repetir o item anterior 5 vezes. Como a diferença de uma linha para
outra será somente o conteúdo do método println, que será 1, 2, ..., então isto nos leva a ter de usar uma estrutura
de repetição.

#### Exercício 2 - Fazer um programa que imprime os números de 1 a 5 na tela. 
Usando while (teste) { instruções do bloco }
<br>
Dicas do Exercício 1.
<br>
#### Exercício 3 - Fazer um programa que imprime os números de 1 a 5 na tela. 
Usando do { instruções do bloco } while( teste );
<br>
Dicas do Exercício 1.
<br>
#### Exercício 4 - Fazer um programa que imprime os números pares que existem no intervalo entre 1 e 15.
Dicas: <br>
a) este programa não requer entrada do usuário, ou seja, não precisaremos nos preocupar com a leitura do teclado;
<br>
b) para imprimir na tela um número podemos usar a instrução System.out.println( 1 );
<br>
c) antes de imprimir um valor na tela precisaremos checar se ele é par. Para checar precisamos perguntar "você é
par?" e a resposta deverá ser "sim ou não". Para checar o resultado de uma pergunta e tomar a decisão de imprimir
o valor na tela, só temos uma opção, que é usar a estrutura if( teste ){ bloco de instruções }
<br>
d) para checar se um valor é par podemos usar o operador (%), pois ele retorna o resto da divisão:
• 3%2 tem como resultado 1, pois 1 é o resto da divisão 3/2
como qualquer valor inteiro x quando operado com % só poderá resultar em 0 ou 1, e será 0 quando o x for par,
então podemos fazer o seguinte teste:
• x%2 == 0
<br>
e) para imprimir todos os números pares precisaremos repetir o item (b). Para isso podemos usar uma estrutura for,
acontece que nem todos os valores entre 1 e 15 são pares, então precisaremos checar, ou seja, precisaremos
colocar a instrução do item (b) dentro de um if com um teste semelhante ao item (d). Desta forma, o programa será
composto por um único bloco for, que terá dentro um bloco if e dentro dele a instrução para imprimir o número;
<br>
#### Exercício 5 - Fazer um programa que imprime na tela o somatório dos números entre 0 e 10.
Dicas:<br>
a) este programa não requer entrada do usuário, ou seja, não precisaremos nos preocupar com a leitura do teclado;
<br>
b) o somatório é calculado somando cada um dos valores que compõem o intervalo, como os valores são inteiros,
então os valores serão somente: 0+1+2+3+...+9+10
<br>
Acontece que o programa não funciona assim, ele somente opera entre pares de números, então teremos de criar
uma variável para estocar os pares de soma, e toda variável precisa iniciar com algum valor, como o primeiro valor a
ser estocado é zero, então podemos criar uma variável s do tipo inteiro e iniciá-la com o valor zero:
int s = 0; <br>
Na sequência podemos fazer as seguintes somas: <br>
s = s + 1;<br>
s = s + 2;<br>
s = s + 3;<br>
...<br>
s = s + 9;<br>
s = s + 10;<br>
No final a variável s terá o somatório do intervalo de 0 a 10. No entanto, digitar cada uma das instruções de soma
seria inviável para intervalos grandes, então podemos colocar cada uma dessas instruções de soma dentro de uma
estrutura for, pois temos o valor de início, valor de finalização e incremento.<br>
c) desta forma temos que este programa será formado por três instruções:<br>
• uma instrução para a declaração de uma variável do tipo inteiro e a sua inicialização com valor zero;<br>
• uma instrução contendo um bloco for e dentro deste bloco teremos uma instrução de soma;<br>
• uma instrução para imprimir na tela o conteúdo da variável que possui o somatório. Observação, esta
instrução deverá estar fora do bloco for, pois ela deverá ser executada somente após o intervalo ser todo
somado.

#### Exercício 6 - Fazer um programa que imprime na tela a média dos números ímpares que estão no intervalo entre 0 e 100.
Dicas:<br>
a) a média é calculada dividindo o somatório pela quantidade de valores utilizados no somatório. Desta forma teremos
de criar duas variáveis inteiras, uma para acumular o somatório e outra para contar a quantidade de vezes que a
instrução de soma foi executada. Ambas devem ser iniciadas com zero;<br>
b) desta forma temos que este programa será formado por quatro instruções:<br>
• uma instrução para a declaração de uma variável do tipo inteiro e a sua inicialização com valor zero, esta
variável será usada para acumular o somatório;<br>
• uma instrução para a declaração de uma variável do tipo inteiro e a sua inicialização com valor zero, esta
variável será usada para contar a quantidade de vezes que a instrução de soma será executada;<br>
• uma instrução contendo um bloco for e dentro deste bloco teremos:<br>
▪ um bloco if, para checar se o valor é ímpar, e dentro desse bloco if teremos duas instruções:<br>
• uma para somar o valor e acumular na variável correspondente;<br>
• uma para incrementar o valor da variável contadora, pois esta variável irá iniciar com valor
zero e este será somada de 1 a cada vez.<br>
• uma instrução para imprimir na tela o valor da média. Para computar a média precisaremos dividir as duas
variáveis. Observação, quando dividimos dois valores/variáveis inteiras, o resultado também será inteiro,
ou seja, 4/3 será igual a 1 e não 1.33. Para resolver este problema teremos de converter um dos valores
para float, podemos fazer isso das seguintes maneiras:<br>
▪ 4/3f: neste caso transformou-se o valor 3 em 3.0;<br>
▪ 4f/3: neste caso transformou-se o valor 4 em 4.0;<br>
▪ 4f/3f: neste caso transformou-se os valores em 4.0 e 3.0;<br>
▪ 4/(float)3: neste caso transformou-se o valor 3 em 3.0;<br>
▪ (float)4/3: neste caso transformou-se o valor 4 em 4.0. Atenção, é um erro considerar que isso é
equivalente a (float)(4/3), pois esta operação resultaria em (float)(1) → 1.0<br>
