<h1 align="center">Kafka Producer</h1>

Descrição
=================
<p align="center">Exemplo de implementação de um micro serviço produtor de mensagens para o kafka utilizando o Spring Boot.</p>

<p align="center">
  <img alt="GitHub branch checks state" src="https://img.shields.io/github/checks-status/deyviddfs/kafka-producer/main">
  <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/deyviddfs/kafka-producer">
  <img alt="GitHub contributors" src="https://img.shields.io/github/contributors/deyviddfs/kafka-producer">
  <img alt="Twitter URL" src="https://img.shields.io/twitter/url?style=social&url=https%3A%2F%2Ftwitter.com%2Fdeyviddfs">
</p>

Índice
=================
<!--ts-->
- [Descrição](#descrição)
- [Índice](#índice)
- [Como-Usar](#como-usar)
- [Testes](#testes)
- [Status](#status)
<!--te-->


Como-Usar
=================

#Pré Requesitos
* Java 14
* Docker instalado

#Subindo Aplicação
* Clonar repositório
* Navergar até a pasta do arquivo docker-compose.yml
* Rodar comando <b>docker-compose up -d</b>
* Validar se foi tudo criado e está UP com o comando docker-compose ps
* Abrir o projeto cliente-producer
* Subir as duas aplicações através da classe SpringApplication



Testes
=================
* Fazer uma requesição POST 
<p>
curl --location --request POST 'http://localhost:8080/cliente/' \
--form 'id="1"' \
--form 'nome="Deyvid Fernandes"' \
--form 'idade="33"'
</p>

* Resultado esperado é produzir uma mensagem no formato json no tópico DEV.CLIENTE, uma forma de validar é exeutando o seguinte comando: 
<p>docker exec -ti broker ../../bin/kafka-console-consumer --bootstrap-server localhost:9092 --topic DEV.CLIENTE --from-beginning</p>


Status
=================
<h4 align="center"> 
	🚧  kafka - Em construção...  🚧
</h4>