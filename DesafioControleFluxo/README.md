# Projeto Contador

Este projeto Java permite ao usuário inserir dois números inteiros e realizar uma contagem a partir do primeiro até o segundo número. Se o primeiro número fornecido for maior ou igual ao segundo, uma exceção personalizada é lançada, indicando que o segundo número deve ser maior que o primeiro.

## Pré-requisitos

Para executar este projeto, você precisa ter o seguinte instalado em seu ambiente de desenvolvimento:

- Java Development Kit (JDK) versão 8 ou superior
- Um ambiente de desenvolvimento integrado (IDE) compatível com Java, como IntelliJ IDEA, Eclipse, ou simplesmente o compilador Java e um editor de texto

## Como usar

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/hugogadelha/contador-java.git

2. **Importe o projeto:**

Abra seu ambiente de desenvolvimento e importe o projeto contador-java.

3. **Execute o projeto:**

Localize o arquivo Contador.java e execute-o como um programa Java. Certifique-se de configurar os argumentos de execução conforme solicitado pelo programa.

4. **Entrada de Dados:**

O programa solicitará que você digite dois números inteiros. Certifique-se de inserir números válidos.

5. **Saída Esperada:**

Se os números fornecidos forem válidos (o segundo número é maior que o primeiro), o programa contará e imprimirá os números entre eles.
Caso contrário, uma mensagem de erro será exibida indicando que o segundo número deve ser maior que o primeiro.

6. **Tratamento de Exceções:**

O programa usa uma exceção personalizada (ParametrosInvalidosException) para tratar o caso em que o segundo parâmetro é menor ou igual ao primeiro. Esta exceção é capturada e tratada adequadamente.

7. **Fechar o Programa:**

Após a execução do programa, todos os recursos são fechados automaticamente, incluindo o Scanner utilizado para entrada de dados.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests para melhorar este projeto.

## Autor

Este projeto foi desenvolvido por **Hugo Branches Gadelha Santos.**