**Getters** e **setters** são métodos usados para acessar e modificar os atributos privados de uma classe. Eles fazem parte do conceito de **encapsulamento** e ajudam a controlar o acesso aos dados, garantindo que eles sejam manipulados de forma segura e adequada.

### O Que São Getters e Setters?

- **Getters**: São métodos usados para **obter** (ou "get") o valor de um atributo.
- **Setters**: São métodos usados para **definir** (ou "set") um novo valor para um atributo.

Eles permitem que os atributos de uma classe sejam acessados e modificados de maneira controlada, mantendo os dados protegidos.

### Por Que Usar Getters e Setters?

- **Encapsulamento**: Atributos de uma classe são frequentemente declarados como `private`, o que significa que eles não podem ser acessados diretamente fora da classe. Para permitir o acesso a esses atributos de forma segura, você usa *getters* e *setters*.
- **Controle de Acesso**: Você pode adicionar validações nos métodos *setters* para garantir que os dados sejam modificados de forma correta.
- **Consistência**: Usar métodos para acessar atributos ajuda a manter consistência e facilitar mudanças futuras no código.

### Como Funciona na Prática

Aqui está um exemplo de uma classe `Pessoa` que usa *getters* e *setters* para o atributo `idade`:

```java
class Pessoa {
    // Atributo privado
    private int idade;

    // Getter para obter o valor de 'idade'
    public int getIdade() {
        return idade;
    }

    // Setter para definir o valor de 'idade'
    public void setIdade(int novaIdade) {
        if (novaIdade >= 0) {  // Validação: idade não pode ser negativa
            idade = novaIdade;
        } else {
            System.out.println("Idade inválida");
        }
    }
}
```

- **Getter (`getIdade`)**: Retorna o valor do atributo `idade`. Você usa esse método quando quer **ler** o valor da idade.
- **Setter (`setIdade`)**: Define um novo valor para o atributo `idade`. Neste exemplo, há uma **validação** para garantir que a idade não seja negativa.

### Exemplo de Uso

Vamos criar um objeto da classe `Pessoa` e usar os métodos *getters* e *setters*:

```java
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        // Definindo a idade usando o setter
        pessoa.setIdade(25);

        // Obtendo a idade usando o getter
        int idade = pessoa.getIdade();
        System.out.println("Idade: " + idade);  // Saída: Idade: 25

        // Tentando definir uma idade negativa
        pessoa.setIdade(-5);  // Saída: Idade inválida
    }
}
```

No exemplo acima:
- Usamos `pessoa.setIdade(25)` para definir a idade como `25`.
- Usamos `pessoa.getIdade()` para obter a idade e imprimimos `25`.
- Quando tentamos definir uma idade negativa (`-5`), a validação no *setter* impede que o valor seja alterado para um valor inválido.

### Resumindo

- **Getters** e **setters** são usados para acessar e modificar atributos privados de uma classe.
- **Getter**: Método para **obter** o valor de um atributo (`getIdade()`).
- **Setter**: Método para **definir** o valor de um atributo (`setIdade(int novaIdade)`), com a possibilidade de adicionar **validações**.

Eles são muito úteis para proteger os dados da classe, garantir consistência e controlar o acesso aos atributos.
