# Checkpoint 1 – API de Pedidos (Spring Boot)

Projeto desenvolvido para o Checkpoint da disciplina de Arquitetura SOA e Web Services, utilizando Java 17 e Spring Boot 3.4.5.

## ✅ Tecnologias Utilizadas
- Java 17
- Spring Boot 3.4.5
- Spring Data JPA
- H2 Database (em memória)
- Lombok
- Jakarta Validation
- Hibernate Validator

## 📁 Estrutura do Projeto

```
src/main/java/br/com/fiap/checkpoint1/
├── controller/
│   └── PedidoController.java
├── model/
│   └── Pedido.java
├── repository/
│   └── PedidoRepository.java
├── service/
│   └── PedidoService.java
└── Checkpoint1Application.java
```

## ⚙️ Como Rodar

### Pré-requisitos:
- Java 17 instalado
- Maven configurado (pode usar ./mvnw)
- VS Code ou IntelliJ

### Passos:

1. Clone ou extraia o projeto
2. Execute no terminal:
```bash
./mvnw clean install
./mvnw spring-boot:run
```

A aplicação estará disponível em: [http://localhost:8080](http://localhost:8080)

## 🧪 Endpoints da API

### 1. Criar um novo pedido
`POST /pedidos`

```json
{
  "clienteNome": "João da Silva",
  "valorTotal": 250.75
}
```

### 2. Listar todos os pedidos
`GET /pedidos`

### 3. Buscar pedido por ID
`GET /pedidos/{id}`

### 4. Atualizar um pedido existente
`PUT /pedidos/{id}`

```json
{
  "clienteNome": "João Atualizado",
  "valorTotal": 300.00
}
```

### 5. Deletar um pedido
`DELETE /pedidos/{id}`

## 💾 Console do H2 Database

Acesse: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

- JDBC URL: `jdbc:h2:mem:pedidosdb`
- User: `sa`
- Password: *(deixe em branco)*

## 📎 Prints dos testes (inserir screenshots aqui)

- POST /pedidos → ✅
- GET /pedidos → ✅
- GET /pedidos/{id} → ✅
- PUT /pedidos/{id} → ✅
- DELETE /pedidos/{id} → ✅

## 📌 Autores
Nome:Aksel Viktor Caminha Rae
RM: 99011

Nome: Ian Xavier Kuraoka
RM: 98860

Nome: Arthur Petrin
RM: 98735
---