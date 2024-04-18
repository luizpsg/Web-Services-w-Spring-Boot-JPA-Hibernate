# Web Services com Spring Boot, JPA e Hibernate

## Descrição
Este projeto é uma demonstração de como construir um serviço web utilizando Spring Boot, JPA e Hibernate. Foi criado com o objetivo de fornecer uma aplicação exemplo para operações de CRUD em diversas entidades como Usuários, Produtos, Pedidos, etc.

## Estrutura do Projeto
A aplicação está organizada da seguinte maneira:
- **Entities**: Classes que representam as entidades do domínio e são mapeadas para o banco de dados.
- **Repositories**: Interfaces do Spring Data JPA para acesso aos dados das entidades.
- **Resources**: Controladores REST que expõem endpoints da API.
- **Services**: Classes de serviço que contêm a lógica de negócios.
- **Exceptions**: Classes de exceção customizadas para tratamento de erros.
- **Config**: Classes de configuração do projeto.

## Entidades
- `User`
- `Order`
- `Product`
- `Category`
- `OrderItem`
- `Payment`

Cada entidade tem um repositório correspondente para operações de banco de dados e um recurso REST para interação via HTTP.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação.
- **Spring Boot**: Framework para facilitar a configuração e o lançamento de aplicações baseadas em Spring.
- **JPA / Hibernate**: Para mapeamento objeto-relacional e interação com o banco de dados.

## Como Rodar o Projeto
Para executar o projeto, siga os passos abaixo:

1. Clone o repositório.
2. Abra o terminal na raiz do projeto.
3. Execute `mvn spring-boot:run` para iniciar a aplicação.
4. A aplicação estará disponível em `http://localhost:8080`.

## Testes
Para rodar os testes, você pode usar o perfil de teste que utiliza a base de dados H2, uma base de dados em memória ideal para testes. Isso pode ser feito configurando o `application-test.properties` e utilizando a classe `TestConfig` para configurar o ambiente de teste adequado.

1. Garanta que o arquivo `application-test.properties` está configurado para usar o banco de dados H2.
2. Configure a classe `TestConfig` com qualquer configuração específica para o ambiente de teste.
3. Execute os testes utilizando o perfil de teste, que pode ser ativado com o parâmetro de linha de comando `spring.profiles.active=test`.

## Configuração
Os arquivos `application.properties`, `application-dev.properties`, `application-test.properties` e `application-prod.properties` podem ser usados para configurar o ambiente de desenvolvimento, teste e produção, respectivamente.
