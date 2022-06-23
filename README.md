# ValidationAndSecurity

Criei este projeto para aplicar os conhecimentos de Spring boot security, contendo um CRUD de web services REST para acessar um recurso de eventos em determinadas cidades.

Este projeto contém validação de dados com Bean Validation, autenticação e autorização com OAuth2 e JWT, configuração de CORS, restrição de acesso em nível de rotas, e uma estruturação para que dê suporte a segurança.

O sistema de eventos e cidades contém uma relação N-1 entre eles, conforme a imagem abaixo: 

![image](https://user-images.githubusercontent.com/100853329/175298511-d1ea99ec-b650-442d-b8cd-d353df949093.png)

Neste sistema, somente as rotas de leitura (GET) de eventos e cidades são públicas (não precisa de login). Usuários CLIENT podem também inserir (POST) novos eventos. Os demais acessos são permitidos apenas a usuários ADMIN.

# Guiado por testes
Além da implementação de segurança, o sistema foi desenvolvido guiado por testes, abaixo os testes implementados:

## Testes na camada controller da cidade
- insert deverá
  - retornar unauthorized (Código 401) quando o usuário não estiver logado.
- insert deverá
  - retornar forbidden (Código 403) quando o cliente estiver logado.
- insert deverá
  - inserir um recurso quando o perfil "ADMIN" estiver logado e os dados estiverem corretos.
- insert deverá
  - retornar Unprocessable Entity (código 422) quando o perfil "ADMIN" tentar inserir o nome da cidade em branco.
- findAll deverá
  - retornar todas as cidades ordenadas por nome.

![image](https://user-images.githubusercontent.com/100853329/175300468-ecbcf529-b2de-4aef-9350-e1f91195569f.png)

## Testes na camada controller dos eventos
- insert deverá
  - retornar unauthorized (Código 401) quando o usuário não estiver logado.
- insert deverá
  - inserir um recurso quando o perfil "CLIENT" estiver logado e os dados estiverem corretos.
- insert deverá
  - inserir um recurso quando o perfil "ADMIN" estiver logado e os dados estiverem corretos.
- insert deverá
  - retornar Unprocessable Entity (código 422) quando o perfil "ADMIN" tentar inserir o nome da cidade em branco.
- insert deverá
  - retornar Unprocessable Entity (código 422) quando o perfil "ADMIN" tentar inserir uma data passada.
- insert deverá
  - retornar Unprocessable Entity (código 422) quando o perfil "ADMIN" tentar inserir o nome da cidade nulo.
- findAll deverá
  - retornar todas os eventos paginados.

![image](https://user-images.githubusercontent.com/100853329/175301448-fad40b5c-b84b-40a3-8e77-2dab1e0d18ea.png)

## Postman
Abaixo a collection utilizada no Postman caso deseje testar as funcionalidades:
https://www.getpostman.com/collections/2e364bc906103fbb5ca0








