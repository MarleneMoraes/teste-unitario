## Teste Unitário em Java com JUnit

1. O que é o JUnit?
JUnit é uma das frameworks de teste mais populares para Java. Ele fornece anotações e asserções para ajudar você a escrever e executar testes facilmente.

2. Configurando o JUnit
Para começar, você precisa configurar o JUnit na sua IDE. Isso vai depender da IDE que você prefere usar. Dessa forma, procure na internet como configurar o JUnit na IDE usada.

3. Escrevendo seu primeiro teste
Vamos criar um teste simples para uma classe Calculadora.

3.1 Classe a ser testada:
```java
public class Calculadora {
     public int soma(int a, int b) {
         return a + b;
     }
}
```
3.2 Classe de Teste:
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

@Test
public void testSoma() {
   Calculadora calc = new Calculadora();
    assertEquals(5, calc.soma(2, 3));
   }
}
```
Observe a anotação `@Test`. Ela indica que o método abaixo é um teste unitário.

4. Executando o teste
Na maioria das IDEs, como IntelliJ IDEA ou Eclipse, você pode clicar com o botão direito do mouse no método de teste ou na classe de teste e selecionar "Run" para executar o teste.


5. Mais exemplos 
Inicialmente, temos a classe Calculadora  que estaremos testando:

 
```java
public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }

    public int subtrai(int a, int b) {
        return a - b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double multiplica(double a, double b) {
        return a * b;
    }
}
```

Agora temos a classe que roda os testes:

```java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    public void testSoma() {
        // Usando assertEquals
        assertEquals(5, calc.soma(2, 3));
    }

    @Test
    public void testSubtrai() {
        assertEquals(2, calc.subtrai(5, 3), "5 - 3 deve ser igual a 2");
    }

    @Test
    public void testMultiplica() {
        assertTrue(calc.multiplica(2, 3) == 6);
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, calc.divide(5, 2), 0.01);  // Margem de erro de 0.01
    }

    @Test
    public void testDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}
```

Usamos `assertEquals` para verificar se dois valores são iguais.
`assertTrue` verifica se uma condição booleana é verdadeira.
No método `testDivide`, usamos `assertEquals` com um terceiro argumento para fornecer uma margem de erro. Isso é útil para comparações de ponto flutuante onde pode haver pequenas discrepâncias.
`assertThrows` é usado para garantir que uma exceção específica seja lançada. No exemplo, estamos garantindo que dividir por zero lançará um `ArithmeticException`.
