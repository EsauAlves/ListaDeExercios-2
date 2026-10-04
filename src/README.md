**1°-**
Usar getters e setters é uma boa prática porque garante o encapsulamento. Atributos públicos permitem que qualquer parte do código altere os dados diretamente para valores inválidos ou inconsistentes. O setter atua como um "filtro", validando a informação antes de salvar.   
exemplo:
```java
public class Pessoa {
    private int idade;

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 130) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
}
```
Em vez de deixar que qualquer pessoa ou outra parte do programa mude a idade diretamente para algum valor absurdo (como -5 ou 999), o método set atua como uma porta de segurança, apenas aceitando valores entre 0 e 130.

**2°-**
a) Informações que acredito ser importante: Título, autor, ISBN, ano de publicação, editora e o status de disponibilidade.

b) Porque considera apenas conceitoss importantes para o sitema da biblioteca (como seu título ou autor), ignorando detalhes irrelevantes (como expessura da capa ou seu peso).

c) 3 métodos importantes seriam:
- emprestar(): Serveria para alterar o status do livro para emprestado.
- devolver(): Serveria para atualizar o status para disponível.
- exibirDetalhes(): Imprime os dados principais do livro.