# Endpoints
```
GET /api/product - Retorna uma lista de todos os produtos.

POST /api/product - Cadastra um novo produto.

PUT /api/product - Atualiza um produto previamente cadastrado.

DELETE /api/product - Remove um produto previamente cadastrado.
```

# JSON
Para utilizar das funcionalidades dos endpoints acima será necessário utilizar os devidos JSONs:
```
POST:
  {
    "name": "", (obrigatório)
    "price": 0.00 (obrigatório)
  }

PUT:
  {
    "id": "", (obrigatório)
    "name": ""
    "price": 0.00
  }

DELETE:
  {
    "id": "" (obrigatório)
  }
```

# Database
### Para que este projeto funcione perfeitamente em sua máquina será necessário ter o MYSQL ou Banco SQL de escolha rodando em sua máquina/hospedado na nuvem.
### <sub>Obs: Se optar por outro banco SQL será necessário encontrar e atualizar o driver nas dependencias do maven.</sub>

## Configuração:
1. Atualize as informações em application.properties localizada na pasta resources.
2. Dentro do MYSQL ou DB de escolha crie uma DATABASE vazia com o nome de product (O restante será gerenciado pelas migrations utilizando flyway).