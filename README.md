# 📋 Cadastro de Usuários — CRUD com Spring Boot

API REST para gerenciamento de usuários, com operações de criação, leitura, atualização e exclusão. Projeto desenvolvido seguindo o tutorial do canal [Javanauta](https://www.youtube.com/@javanauta).

---

## 🚀 Tecnologias utilizadas

- **Java 21**
- **Spring Boot 3**
- **Spring Web**
- **Spring Data JPA**
- **Lombok**
- **H2 Database**
- **Maven**

---

## 📌 Funcionalidades

- ✅ Cadastrar um novo usuário (nome e e-mail)
- ✅ Listar todos os usuários
- ✅ Buscar usuário por ID
- ✅ Atualizar dados de um usuário
- ✅ Deletar um usuário

---

## 🏗️ Estrutura do projeto

```
src/
└── main/
    └── java/
        └── com/exemplo/usuarios/
            ├── controller/
            │   └── UsuarioController.java
            ├── dto/
            │   └── UsuarioDTO.java
            ├── model/
            │   └── Usuario.java
            ├── repository/
            │   └── UsuarioRepository.java
            └── service/
                └── UsuarioService.java
```

---

## 🔗 Endpoints

| Método | Endpoint           | Descrição                    |
|--------|--------------------|------------------------------|
| POST   | `/usuarios`        | Cadastrar novo usuário       |
| GET    | `/usuarios`        | Listar todos os usuários     |
| GET    | `/usuarios/{id}`   | Buscar usuário por ID        |
| PUT    | `/usuarios/{id}`   | Atualizar usuário            |
| DELETE | `/usuarios/{id}`   | Deletar usuário              |

### Exemplo de body (POST / PUT)

```json
{
  "nome": "José Gabriel",
  "email": "josegabriel@email.com"
}
```

### Exemplo de resposta (GET `/usuarios/{id}`)

```json
{
  "id": 1,
  "nome": "José Gabriel",
  "email": "josegabriel@email.com"
}
```

---

## ⚙️ Como executar

### Pré-requisitos

- Java 21+
- Maven

### Passos

```bash
# Clone o repositório
git clone https://github.com/josegabriel2006/nome-do-repositorio.git

# Acesse a pasta do projeto
cd nome-do-repositorio

# Execute a aplicação
./mvnw spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

---

## 🗄️ Configuração do banco de dados

O projeto utiliza o **H2**, banco de dados em memória — nenhuma instalação necessária. As configurações ficam em `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:usuarios
spring.datasource.driver-class-name=org.h2.Driver
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=create-drop
```

O console do H2 fica disponível em: `http://localhost:8080/h2-console`

> ⚠️ Por ser um banco em memória, os dados são perdidos ao reiniciar a aplicação.

---

## 📬 Testando com o Postman

Importe a URL base `http://localhost:8080` e utilize os endpoints descritos acima. Certifique-se de definir o `Content-Type: application/json` no header das requisições POST e PUT.

---

## 📖 Referência

Projeto desenvolvido com base no tutorial do canal **Javanauta** no YouTube.  
🔗 [https://www.youtube.com/@javanauta](https://www.youtube.com/@javanauta)

---

## 📄 Licença

Este projeto está sob a licença MIT.
