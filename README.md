# restaurante-ifsul

* Projeto LPII 2023;
* 26/10/2023;
* João Guilherme Borges Fernandes;
* 4i;

# Endpoints

* `/restaurantes`   
    -> URL base do projeto; <br>
    -> GET: Retorna uma lista com todos os restaurantes; <br>
    -> POST: Cadastra novos restaurantes;


* `/restaurantes/{id}`  
    -> GET: Busca restaurante pelo ID especificado em {id}; <br>
    -> PUT: Edita restaurante com o ID especificado em {id}; <br>
    -> DELETE: Deleta restaurante com o ID especificado em {id};

* `/nome/{nome}` <br>
    -> Busca todos os restaurantes com o nome especificado em {nome};

* `/endereco/{endereco}` <br>
    -> Busca todos os restaurantes com o endereço especificado em {endereco};

* `/cozinha/{cozinha}` <br>
    -> Busca todos os restaurantes pelo tipo de culinária especificada em {cozinha};