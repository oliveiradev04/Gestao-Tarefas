# 📋 API REST - Gestão de Tarefas

API REST desenvolvida com Java, Spring Boot e PostgreSQL para gerenciamento de usuários e tarefas.

O projeto foi criado com foco em praticar conceitos de desenvolvimento backend utilizando Spring Boot, JPA, PostgreSQL e arquitetura em camadas.

---

# 📝 Sobre o Projeto

Esta API permite o gerenciamento de usuários e tarefas, realizando operações básicas de CRUD (Create, Read, Update e Delete).

O sistema possui relacionamento entre usuários e tarefas, onde um usuário pode possuir várias tarefas cadastradas.

---

# 🚀 Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Flyway
- Maven

---

# 📌 Funcionalidades

## 👤 Usuários

- Criar usuário
- Listar usuários
- Buscar usuário por ID
- Atualizar usuário
- Deletar usuário

## ✅ Tarefas

- Criar tarefa
- Listar tarefas
- Buscar tarefa por ID
- Atualizar tarefa
- Deletar tarefa

---

# 🗄️ Banco de Dados

O projeto utiliza PostgreSQL como banco de dados relacional e Flyway para controle de migrações.

Relacionamento utilizado:

```text
Usuário (1) -------- (N) Tarefas
```

---

# ▶️ Como Executar o Projeto

## Clonar o repositório

```bash
git clone https://github.com/oliveiradev04/Gestao-Tarefas
```

## Entrar na pasta do projeto

```bash
cd gestao-tarefas
```

## Executar a aplicação

### Windows

```bash
mvnw.cmd spring-boot:run
```

### Linux/Mac

```bash
./mvnw spring-boot:run
```

---

# 🌐 Endpoints

# 👤 Usuários

## Criar usuário

```http
POST /v1/usuarios
```

## Listar usuários

```http
GET /v1/usuarios
```

## Buscar usuário por ID

```http
GET /v1/usuarios/{id}
```

## Atualizar usuário

```http
PUT /v1/usuarios/{id}
```

## Deletar usuário

```http
DELETE /v1/usuarios/{id}
```

---

# ✅ Tarefas

## Criar tarefa

```http
POST /v2/tarefas
```

## Listar tarefas

```http
GET /v2/tarefas
```

## Buscar tarefa por ID

```http
GET /v2/tarefas/{id}
```

## Atualizar tarefa

```http
PUT /v2/tarefas/{id}
```

## Deletar tarefa

```http
DELETE /v2/tarefas/{id}
```

---

# 📦 Exemplo de JSON

## Criar usuário

```json
{
  "nome": "João Silva",
  "email": "joao@email.com"
}
```

## Criar tarefa

```json
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Aprender API REST",
  "status": "PENDENTE",
  "usuario": {
    "id": 1
  }
}
```

---

# 📚 Conceitos Aplicados

- API REST
- CRUD
- DTO
- Arquitetura em Camadas
- JPA/Hibernate
- Relacionamento OneToMany / ManyToOne
- Injeção de Dependência

---

# 👨‍💻 Autor

Demétrius Oliveira

