# 📚 Projeto ADS

Este é um projeto backend desenvolvido com **Spring Boot** e **MongoDB**, utilizando Java 21. Ele serve como base para uma aplicação de demonstração e aprendizado com API REST segura e persistência de dados NoSQL.

---

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3.4.5
- Spring Data MongoDB
- Spring Web
- Spring Security
- Bean Validation
- Lombok
- Maven

---

## ⚙️ Configuração da Aplicação

O projeto já vem com a configuração padrão para o banco de dados MongoDB no arquivo `application.properties`:

```properties
spring.application.name=ads

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=projeto

spring.security.user.password=none


🛠️ Como Executar Localmente
1. Pré-requisitos
Antes de começar, você precisa ter instalado:

Java 21+

Maven 3.8+

MongoDB Community Edition
