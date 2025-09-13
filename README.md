#  Classe Livro em Java

Este projeto contém uma classe simples em **Java** chamada `Livro`, que representa um livro em uma biblioteca.  
A classe permite **emprestar, devolver e consultar o status** de um livro, além de armazenar informações básicas como título, autor e número de páginas.

---

##  Estrutura da Classe

A classe possui os seguintes atributos:

- `String titulo` → Título do livro  
- `String autor` → Autor do livro  
- `int numerodepaginas` → Número de páginas do livro  
- `boolean emprestado` → Define se o livro está emprestado ou não  

---

##  Funcionalidades

- **Construtores**  
  - `Livro(String titulo, String autor, int numerodepaginas, boolean emprestado)`  
  - `Livro()`  

- **Métodos principais**  
  - `emprestar()` → Marca o livro como emprestado  
  - `devolver()` → Devolve o livro (marca como não emprestado)  
  - `status()` → Retorna a situação do livro (emprestado ou disponível)  
  - `setNumerodepaginas(int paginas)` → Define o número de páginas (não permite valores inválidos)  

---

##  Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256, false);

        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);

        livro1.emprestar();
        System.out.println(livro1.status());

        livro1.devolver();
        System.out.println(livro1.status());
    }
}
