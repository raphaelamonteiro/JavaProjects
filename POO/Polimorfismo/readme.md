# O que é Polimorfismo?
A palavra polimorfismo vem do grego e significa "muitas formas". Em programação orientada a objetos, polimorfismo se refere à capacidade de um objeto assumir diferentes formas.


### Exemplo Prático: Animais

#### Superclasse Animal

Imagine que você tem uma classe chamada `Animal` que define um comportamento genérico para todos os animais: o som que eles fazem. Esse método se chama `fazerSom()`.

```java
class Animal {
    void fazerSom() {
        System.out.println("Algum som de animal");
    }
}
```

#### Subclasses (Cachorro e Gato)

Você também tem subclasses chamadas `Cachorro` e `Gato`. Cada um desses animais faz um som diferente, então você "sobrescreve" o método `fazerSom()` na classe `Cachorro` e na classe `Gato` para representar os sons específicos que eles fazem.

```java
class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Latido");
    }
}

class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Miau");
    }
}
```

#### O Polimorfismo em Ação

Agora, imagine que você tem uma lista de animais e não sabe exatamente qual tipo de animal está nela. Tudo o que você sabe é que são objetos do tipo `Animal`. Quando você pedir para cada um fazer um som, o Java vai determinar o som certo de acordo com o tipo real do animal.

```java
public class Main {
    public static void main(String[] args) {
        Animal meuAnimal1 = new Cachorro();  // meuAnimal1 é um Cachorro
        Animal meuAnimal2 = new Gato();      // meuAnimal2 é um Gato

        meuAnimal1.fazerSom();  // Saída: Latido
        meuAnimal2.fazerSom();  // Saída: Miau
    }
}
```

Aqui está o **polimorfismo**: a variável `meuAnimal1` e `meuAnimal2` são ambas do tipo `Animal`, mas na hora de executar o método `fazerSom()`, elas exibem comportamentos diferentes. Isso acontece porque o método que é executado depende do tipo real do objeto que está sendo referenciado (`Cachorro` ou `Gato`), não do tipo da variável (`Animal`).

#### Em Resumo:

- O **polimorfismo** permite que um mesmo método (`fazerSom()`) tenha comportamentos diferentes dependendo do objeto que o chama.
- Isso é útil porque você pode escrever código genérico que funcione com diferentes tipos de objetos.

Imagine que você esteja criando um jogo com vários tipos de animais. Você poderia simplesmente dizer "todos os animais devem fazer um som" e, independentemente de ser um `Cachorro` ou um `Gato`, eles saberão como fazer o som correto. Isso simplifica muito o código!

O polimorfismo facilita a reutilização e a extensibilidade do código, tornando-o mais flexível e fácil de manter.


Claro, vamos simplificar mais ainda! Existem dois tipos principais de polimorfismo em Java:

1. **Polimorfismo em Tempo de Compilação (Sobrecarga)**
2. **Polimorfismo em Tempo de Execução (Sobrescrita)**

### 1. Polimorfismo em Tempo de Compilação (Sobrecarga de Métodos)

A *sobrecarga* significa ter **vários métodos com o mesmo nome**, mas que aceitam **diferentes tipos ou números de argumentos**. Isso permite que você use o mesmo método para fazer coisas ligeiramente diferentes, dependendo dos parâmetros que você passa.

**Exemplo simples:**
```java
class Calculadora {
    int somar(int a, int b) {
        return a + b;
    }

    double somar(double a, double b) {
        return a + b;
    }
}
```
Aqui, há dois métodos `somar`:
- Um que recebe dois números inteiros (`int`)
- Outro que recebe dois números decimais (`double`)

Dependendo dos valores que você passa, o Java escolhe automaticamente o método correto. Essa é a ideia de "muitas formas" durante a **compilação**.

### 2. Polimorfismo em Tempo de Execução (Sobrescrita de Métodos)

A *sobrescrita* significa que uma **classe filha redefine um método** que já existe na **classe pai**, para que o comportamento seja específico para a classe filha.

**Exemplo simples:**
```java
class Animal {
    void fazerSom() {
        System.out.println("Algum som de animal");
    }
}

class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("Latido");
    }
}
```
- `Animal` tem um método `fazerSom()`.
- `Cachorro` **sobrescreve** o método `fazerSom()` para que ele faça algo diferente (latir).

Quando você cria um `Cachorro` e chama `fazerSom()`, ele vai latir, porque o método específico da classe `Cachorro` é o que será executado. Isso é decidido em **tempo de execução**, de acordo com o tipo real do objeto.

### Diferença Principal

- **Polimorfismo em Tempo de Compilação (Sobrecarga)**: Escolha do método ocorre na fase de compilação, dependendo dos **parâmetros**.
- **Polimorfismo em Tempo de Execução (Sobrescrita)**: O comportamento é decidido em **tempo de execução**, dependendo do **tipo real do objeto** que chama o método.

Essa distinção torna o código mais **flexível**, pois você pode ter um comportamento apropriado de acordo com o contexto, sem precisar criar nomes de métodos diferentes para cada variação.
