# Boarding House (Registro de Pensionato com Vetores)

Este é um programa de console simples, escrito em Java, focado no uso de **vetores (arrays)** para armazenamento de dados.

O programa pergunta ao usuário quantos quartos serão alugados (`n`). Em seguida, ele solicita o nome, o e-mail e o número do quarto para cada um dos `n` aluguéis. Os dados de cada aluguel são armazenados em três vetores paralelos. Ao final, o programa exibe uma lista de todos os registros inseridos, formatados sob o título "Busy Rooms:".

## Funcionalidades

  * **Entrada de Dados:** Solicita ao usuário o número total de aluguéis (`n`) que serão registrados.
  * **Armazenamento em Vetores:** Utiliza três vetores paralelos para armazenar as informações: `String[] names`, `String[] emails` e `int[] rooms`.
  * **Coleta de Registros:** Itera `n` vezes, solicitando os dados de cada inquilino (Nome, Email, Quarto).
  * **Exibição de Resultados:** Após a coleta, imprime na tela uma lista formatada de todos os quartos registrados ("Busy Rooms:").

## Estrutura do Repositório

O projeto está organizado da seguinte forma:

```
/
├── src/
│   ├── pensionato/
│   │   └── Program.java      # Classe principal (main) que executa a aplicação
│   └── module-info.java    # Define o módulo Java (pensionato)
│
├── bin/
│   ├── pensionato/
│   │   └── Program.class     # Arquivo .class compilado
│   └── module-info.class
│
└── README.md                 # Este arquivo de descrição
```

## Como Usar

Este é um projeto de console Java. Para executá-lo, você precisará ter o Java Development Kit (JDK) instalado e configurado.

1.  **Compilação (Opcional, se já não estiver compilado):**
    Navegue até a raiz do projeto e compile os arquivos-fonte, direcionando a saída para a pasta `bin`:

    ```bash
    javac -d bin src/pensionato/Program.java src/module-info.java
    ```

2.  **Execução:**
    A partir da raiz do projeto, execute a classe `Program` que está dentro da pasta `bin`:

    ```bash
    java -cp bin pensionato.Program
    ```

3.  **Interação com o Programa:**
    O console solicitará:

      * `How many rooms will be rented?` (Quantos quartos serão alugados?)

    Em seguida, para cada aluguel (`Rent #1`, `Rent #2`, etc.), ele pedirá:

      * `Name:` (Nome)
      * `Email:` (E-mail)
      * `Room:` (Número do quarto)

    Após a inserção de todos os dados, o programa exibirá a lista `Busy Rooms:` com todos os registros.

## Observações

  * **Foco em Vetores:** Diferente dos projetos anteriores (como `Employee` ou `Bank-System`), este programa não utiliza Programação Orientada a Objetos (POO) com classes de entidade. O foco aqui é a manipulação direta de múltiplos vetores.
  * **Leitura de Nomes:** O programa usa `sc.next()` para ler o nome. Isso significa que ele **não captura nomes compostos** (com espaço). Se o usuário digitar "João Silva", apenas "João" será armazenado.
