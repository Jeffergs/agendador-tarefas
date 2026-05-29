<div align="center">

# 📋 Gerenciador de Tarefas — Microsserviço de Gestão de Tarefas

Microsserviço desenvolvido com **Spring Boot** responsável pelo gerenciamento de tarefas, status, prioridades e fluxo operacional dentro da arquitetura distribuída da plataforma Agenda.

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0-green?style=for-the-badge&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-336791?style=for-the-badge&logo=postgresql&logoColor=white)
![JPA](https://img.shields.io/badge/Spring_Data_JPA-ORM-success?style=for-the-badge)
![Docker](https://img.shields.io/badge/Docker-Containerization-2496ED?style=for-the-badge&logo=docker&logoColor=white)

<p>
Sistema responsável por centralizar o controle de tarefas, permitindo criação, atualização, acompanhamento de status e organização das atividades dos usuários.
</p>

</div>

---

# 📑 Índice

1. [🌱 Sobre o Projeto](#-sobre-o-projeto)
2. [🏗 Arquitetura](#-arquitetura)
3. [💻 Tecnologias Utilizadas](#-tecnologias-utilizadas)
4. [⚡ Funcionalidades](#-funcionalidades)
5. [📋 Regras de Negócio](#-regras-de-negócio)
6. [🔗 Endpoints](#-endpoints)
7. [📂 Estrutura do Projeto](#-estrutura-do-projeto)
8. [🗄 Banco de Dados](#-banco-de-dados)
9. [🔐 Segurança & Validações](#-segurança--validações)
10. [🚀 Como Executar](#-como-executar)
11. [⚙️ Variáveis de Ambiente](#️-variáveis-de-ambiente)
12. [📘 Swagger](#-swagger)
13. [🐳 Docker](#-docker)
14. [🧠 Decisões Técnicas](#-decisões-técnicas)
15. [🚧 Melhorias Futuras](#-melhorias-futuras)

---

# 🌱 Sobre o Projeto

O **Gerenciador de Tarefas** é um microsserviço responsável pelo controle completo das tarefas dentro da arquitetura da plataforma Agenda.

A aplicação foi construída seguindo princípios de separação de responsabilidades e arquitetura distribuída, permitindo que o gerenciamento de tarefas aconteça de forma desacoplada dos demais serviços da plataforma.

O sistema possibilita:
- criação de tarefas
- atualização de informações
- gerenciamento de status
- organização operacional das atividades
- integração com outros microsserviços

---

# 🏗 Arquitetura

O projeto segue arquitetura em camadas, organizada para facilitar manutenção, escalabilidade e separação das responsabilidades.

## 📐 Estrutura Arquitetural

```text
Controller
   ↓
Service
   ↓
Repository
   ↓
Database
```

## 🔹 Camadas da Aplicação

### 📡 Controller
Responsável pela exposição dos endpoints REST.

### 🧠 Service
Contém regras de negócio e validações do sistema.

### 🗄 Repository
Camada de persistência utilizando Spring Data JPA.

### 📦 DTOs
Responsáveis pela transferência segura de dados entre as camadas.

### ⚠️ Exceptions
Tratamento global e padronizado de erros da API.

---

# 💻 Tecnologias Utilizadas

## 🚀 Backend
- Java 17
- Spring Boot 4
- Spring Web
- Spring Data JPA
- Lombok

## 🗄 Banco de Dados
- PostgreSQL

## 📘 Documentação
- Swagger / OpenAPI

## 🐳 DevOps
- Docker
- Docker Compose

---

# ⚡ Funcionalidades

## 📋 Gerenciamento de Tarefas
- Criar tarefas
- Atualizar tarefas
- Remover tarefas
- Buscar tarefas
- Listar tarefas

---

## 📌 Organização
- Controle de status
- Priorização de atividades
- Acompanhamento operacional

---

## 🔄 Integração
- Comunicação com BFF
- Integração com microsserviços
- Padronização de respostas HTTP

---

# 📋 Regras de Negócio

- Toda tarefa deve possuir informações válidas
- Status devem seguir o fluxo operacional definido
- Campos obrigatórios passam por validação
- Erros são tratados globalmente pela API
- Respostas seguem padronização REST

---

# 🔗 Endpoints

| Método | Endpoint | Descrição |
|---|---|---|
| POST | `/tarefas` | Criar tarefa |
| GET | `/tarefas` | Listar tarefas |
| GET | `/tarefas/{id}` | Buscar tarefa por ID |
| PUT | `/tarefas/{id}` | Atualizar tarefa |
| DELETE | `/tarefas/{id}` | Remover tarefa |

---

# 📂 Estrutura do Projeto

```bash
src/main/java/com/jefferson/gerenciador_tarefas
│
├── business
│   ├── dto
│   ├── enums
│   ├── services
│
├── controller
│
├── infrastructure
│   ├── entity
│   ├── repository
│   ├── exceptions
│
└── GerenciadorTarefasApplication.java
```

---

# 🗄 Banco de Dados

O sistema utiliza **PostgreSQL** para persistência dos dados das tarefas.

## 📌 Recursos Utilizados
- ORM com Spring Data JPA
- Mapeamento de entidades
- Persistência relacional
- Consultas automatizadas via Repository

---

# 🔐 Segurança & Validações

A aplicação possui:
- Validação de dados de entrada
- Tratamento global de exceções
- Padronização de respostas de erro
- Separação de DTOs para proteção das entidades

---

# 🚀 Como Executar

## ✅ Pré-requisitos

- Java 17
- Maven
- PostgreSQL
- Docker

---

# 📥 Clonar o Projeto

```bash
git clone <URL_DO_REPOSITORIO>
```

---

# ▶️ Executar Localmente

```bash
./mvnw spring-boot:run
```

---

# 🐳 Executar com Docker

```bash
docker-compose up --build
```

---

# ⚙️ Variáveis de Ambiente

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tarefas
spring.datasource.username=postgres
spring.datasource.password=postgres

server.port=8081
```

---

# 📘 Swagger

Após iniciar a aplicação:

```bash
http://localhost:8081/swagger-ui.html
```

ou

```bash
http://localhost:8081/swagger-ui/index.html
```

---

# 🐳 Docker

O projeto possui:
- Dockerfile
- Docker Compose
- Containerização do microsserviço
- Configuração de ambiente isolado

---

# 🧠 Decisões Técnicas

- Separação da responsabilidade de tarefas em microsserviço dedicado
- Uso de DTOs para desacoplamento das entidades
- Spring Data JPA para simplificar persistência
- Arquitetura em camadas para maior organização
- Estrutura preparada para integração distribuída

---

# 🚧 Melhorias Futuras

- Implementação de autenticação JWT
- Paginação de tarefas
- Filtros avançados
- Testes automatizados
- Observabilidade e métricas
- Cache com Redis
- Mensageria com RabbitMQ
- Deploy em cloud

---

# 👨‍💻 Autor

Desenvolvido por Jefferson Gomes.

[![GitHub](https://img.shields.io/badge/GitHub-24292e?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Jeffergs)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/)
