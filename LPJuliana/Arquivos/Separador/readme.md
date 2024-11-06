# Caractere de separação
Para o Java entender a barra invertida “\” entre as aspas
duplas, tem-se de colocar o caractere de escape “\”, por este
motivo, nos caminhos de arquivos colocamos a dupla barra
invertida “\\”
<br> ✓ O caractere separador dos nomes dos diretórios e arquivos é
diferente nos vários sistemas operacionais:
<br> ✓ No Windows é a barra invertida: \
<br> ✓ Em plataformas UNIX: /
<br> ✓ Para obter o caractere de separação correto para o Sistema
Operacional onde o programa esta sendo executado,
podemos usar o atributo estático File.separatorChar
