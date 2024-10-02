## O Que é Abstração?

**Abstração** é um dos conceitos fundamentais da programação orientada a objetos. Em resumo, abstração significa **esconder detalhes complexos** e mostrar apenas as partes essenciais para o usuário. Isso ajuda a focar no que é importante, sem se preocupar com os detalhes internos.

É como usar um aparelho eletrônico: você não precisa entender como todos os circuitos funcionam, apenas precisa saber **como usá-lo**. Em Java, abstração permite criar classes que representam **conceitos gerais**, deixando os detalhes complexos escondidos dentro da classe.

### Exemplos do Dia a Dia

Vamos pensar em um exemplo comum: **um carro**. Quando você dirige um carro, você interage com o volante, os pedais, o câmbio etc. Mas você não precisa saber como funciona o motor por dentro ou o sistema de combustível. Esses detalhes são "escondidos" de você, enquanto você usa apenas os controles essenciais.

- **Volante, pedais, câmbio**: São a **abstração** do carro — o que você precisa para dirigir.
- **Motor, sistema elétrico**: São os **detalhes complexos** que ficam escondidos.

### Abstração em Java

Em Java, você usa **classes e interfaces** para criar abstrações.

Por exemplo, vamos criar uma classe que representa um **Carro**.

```java
abstract class Carro {
    // Método abstrato: não tem implementação, só a definição.
    abstract void dirigir();

    // Método concreto: tem implementação.
    void parar() {
        System.out.println("O carro parou.");
    }
}
```

No exemplo acima:

- `Carro` é uma classe abstrata.
- O método `dirigir()` é **abstrato** — ele não tem implementação aqui, só está dizendo que "todo carro deve poder ser dirigido", mas não especifica como.
- O método `parar()` tem uma implementação concreta, que pode ser usada diretamente.

Uma classe abstrata não pode ser instanciada diretamente, mas outras classes podem **herdar** dela e fornecer implementações para os métodos abstratos:

```java
class CarroEsportivo extends Carro {
    @Override
    void dirigir() {
        System.out.println("Dirigindo o carro esportivo rapidamente!");
    }
}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new CarroEsportivo();
        meuCarro.dirigir();  // Saída: Dirigindo o carro esportivo rapidamente!
        meuCarro.parar();    // Saída: O carro parou.
    }
}
```

- `CarroEsportivo` é uma classe que **herda** de `Carro` e implementa o método `dirigir()`.
- `Carro` fornece uma **abstração** para a ideia de um carro — todo carro pode ser dirigido e parar, mas os detalhes de **como** dirigir dependem de cada tipo de carro.

### Resumindo

- **Abstração** é focar no que é importante, escondendo os detalhes complexos.
- Em Java, usamos **classes abstratas** e **interfaces** para definir comportamentos que serão implementados por classes específicas.
- **Métodos abstratos** são como "esqueletos" — eles só dizem que uma ação deve ser realizada, mas não como, deixando isso para as classes concretas. 

Isso ajuda a criar código mais limpo, fácil de entender e manter, pois se concentra no que os objetos **fazem** e não nos detalhes de **como fazem**.
