# Nginx Spring Boot

![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Nginx](https://img.shields.io/badge/nginx-%23009639.svg?style=for-the-badge&logo=nginx&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

Este simples projeto serve para demonstrar uma implementação utilizando Nginx que divide as requisições entre duas instâncias da aplicação.

## Seções

- [Instalação](#instalação)
- [Rodar Aplicação](#rodar-aplicação)
- [API Endpoints](#api-endpoints)

## Instalação

1. Baixe o repositório:

```bash
git clone https://github.com/lucasrluz/nginx-spring-boot.git
```

2. Instale as dependências do Maven

3. Instale o Docker e Docker Compose

## Rodar Aplicação

1. Inicie a aplicação com `docker compose up`

## API Endpoints
### POST `/user`
REQUEST
```
{
  "username": "<username>"
}
```

### GET `/user/{userid}`
### DELETE `/user/{userid}` 
