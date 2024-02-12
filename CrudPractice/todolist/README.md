# Endpoints
```
GET /api/todo - Retorna todas as tarefas cadastradas.

POST /api/todo - Cadastra uma nova tarefa.

PUT /api/todo - Atualiza uma tarefa previamente cadastrada.

DELETE /api/todo - Remove uma tarefa previamente cadastrada.
```

# JSON
Para utilizar das funcionalidades dos endpoints acima será necessário utilizar os devidos JSONs:
```
POST:
  {
    "name": "",
    "description": "",
    "accomplished": bool,
    "priority": int
  }

PUT:
  {
    "id": int (obrigatório)
    "name": "",
    "description": "",
    "accomplished": bool,
    "priority": int
  }

DELETE:
  {
    "id": int (obrigatório)
  }
```

# Database
### Para que este projeto funcione perfeitamente em sua máquina será necessário ter o MYSQL ou Banco SQL de escolha rodando em sua máquina/hospedado na nuvem.
### <sub>Obs: Se optar por outro banco SQL será necessário encontrar e atualizar o driver nas dependencias do maven.</sub>

## Configuração:
1. Atualize as informações em application.properties localizada na pasta resources.
2. Dentro do MYSQL ou DB de escolha crie uma DATABASE vazia com o nome de todo (O restante será gerenciado pelas migrations utilizando flyway).
