# Desafio Full Stack
Desafio de implementação full stack

Autor: Rafael Meliani Velloso

## Organização
O diretório está dividido em três sub-diretórios:
  1. `gerenciador`: contém a implementação do backend da aplicação;
  2. `gerenciador_front_end`: contém a implementação do frontend da aplicação;
  3. `sql`: diretório auxiliar para gerar uma base de dados de teste inicial.

## BACKEND
O Backend foi feito utilizando-se a tecnologia Spring Boot. O banco de dados utilizado foi PostgreSQL. Os arquivos principais encontram-se em `gerenciador/src/main/java`.
Não foi possível implementar todas as operações desejadas, porém foram implementadas:
  1. Listagem de linhas de uma base de dados (READ);
  2. Criação de uma nova linha na base de dados (CREATE);
  3. Também foram implementados métodos para verificar se os dados recebidos do cliente estão bem formatados (quantidade de caracteres correta, etc.).

## FRONTEND
Desenvolvido em Angular.js, é capaz de visualizar todos os membros na base de dados e possui interface para adicionar novos membros.
Não houve tempo para implementar os requisitos 'f', 'g' e 'h' (referência ao arquivo pdf da descrição do desafio). 

## Execução
- Para executar o backend é recomendado que se use a IDE Intellij Idea, para que seja possível instalar facilmente todas as dependências. As dependências podem ser observadas em `gerenciador/pom.xml`. A classe `main` se encontra em `gerenciador/src/main/java/GerenciadorApplication.java`.
- O frontend pode ser executado simplesmente abrindo as páginas HTML em algum navegador.

## Lógica geral da aplicação
- O usuário é capaz de entrar em duas páginas, uma que gerencia empresas e outra que gerencia fornecedores.
- Quando entra na página se depara com uma tabela contendo todas as informações contidas na base de dados referentes ao escopo da página (empresas ou fornecedores).
- Em baixo tem a opção de inserir novas linhas na tabela. A criação de novas linhas é restringida de acordo com algumas regras associadas aos dados em questão (número de digítos no CNPJ/CPF/RG/CEP, campos vazios, formatação de certos campos, etc.).
- Por exemplo, uma pessoa física não pode criar um número com a quantidade de dígitos diferente de 11 no campo CNPJ/CPF. Em contrapartida uma empresa não pode criar um número com quantidade de dígitos diferente de 14 (número de dígitos no CNPJ).
- A leitura e criação de linhas da tabela "relações" (tabela que diz quem é fornecedor de quem) foram implementadas no backend, mas não no frontend.
