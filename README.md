# 📝 ForumHub API - Spring Boot

Está aplicação é uma **API REST** robusta desenvolvida para o gerenciamento de tópicos de um fórum (ForumHub). Desenvolvida como desafio do programa Oracle Next Education (ONE) em parceria com a Alura.
A aplicação permite a criação, visualização, atualização e exclusão (CRUD) de discussões, integrando usuários e cursos de forma organizada.

---

## 🛠️ Tecnologias e Ferramentas
O projeto utiliza as tecnologias mais modernas do ecossistema Java:

* **Java 17** (ou superior)
* **Spring Boot 3**
* **Spring Data JPA** (Persistência de dados)
* **Jakarta Validation** (Validação de beans)
* **Maven** (Gerenciador de dependências)
* **Banco de Dados Relacional** (PostgreSQL/MySQL)

---

## 🚀 Endpoints da API (`/topicos`)

A API segue os princípios REST, utilizando os métodos HTTP adequados para cada operação:

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **POST** | `/topicos` | Cadastra um tópico (Valida autor e curso). |
| **GET** | `/topicos` | Lista tópicos com **paginação** (padrão: 10 itens). |
| **GET** | `/topicos/{id}` | Detalha um tópico específico pelo ID. |
| **PUT** | `/topicos/{id}` | Atualiza o título e a mensagem de um tópico. |
| **DELETE** | `/topicos/{id}` | Remove um tópico permanentemente. |

---

## 🏗️ Destaques da Implementação

No código do `TopicoController`, foram aplicadas boas práticas de desenvolvimento:

* **Records (DTOs):** Uso de Java Records para transferência de dados de forma imutável e limpa.
* **Paginação e Ordenação:** Implementação de `Pageable` para evitar sobrecarga do banco de dados e melhorar a performance no front-end.
* **Respostas HTTP Semânticas:** Uso de `ResponseEntity` para retornar códigos de status precisos, como `201 Created` e `204 No Content`.
* **Gestão de Transações:** Uso da anotação `@Transactional` para garantir a integridade dos dados em operações de escrita e atualização.

---
## 🙏 Agradecimentos

- [![Oracle](https://img.shields.io/badge/Oracle-Next_Education-red)](https://www.oracle.com/br/education/oracle-next-education)
-  [![Alura](https://img.shields.io/badge/Alura-Digital-blue)](https://www.alura.com.br)

* **Instrutores:**
  
  - Brena Souza
  - Eric Monné
  - Iasmin Araújo
  - Jacqueline Oliveira
  - Rodrigo da Silva Ferreira Caneppele
  

