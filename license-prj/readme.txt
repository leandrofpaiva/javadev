Comandos do plugin

Verificando se os fontes est�o com o header definido
mvn license:check -Dyear=2008 -Demail=myemail@company.com

Atualizando / Adicionando o header nos arquivos do projeto
mvn license:format -Dyear=2008 -Demail=myemail@company.com 

Executando o c�digo
mvn exec:java