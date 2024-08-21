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
