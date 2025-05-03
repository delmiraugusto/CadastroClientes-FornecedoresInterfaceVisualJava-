# Sistema de Cadastro de Clientes e Fornecedores

Este software de interface gráfica permite o cadastro e a visualização de **clientes** e **fornecedores**, utilizando o conceito de **herança** na modelagem de dados e persistência em **arquivo** (leitura e escrita). O sistema é composto por cinco janelas principais.

## Funcionalidades

### Cadastro de Clientes

Cada cliente possui os seguintes dados:

- Nome  
- Telefone  
- E-mail  
- Logradouro  
- Número  
- Complemento  
- Bairro  
- Cidade  
- Estado (selecionado via ComboBox)  
- CEP  
- CPF  

### Cadastro de Fornecedores

Cada fornecedor possui os seguintes dados:

- Nome  
- Telefone  
- E-mail  
- Logradouro  
- Número  
- Complemento  
- Bairro  
- Cidade  
- Estado (selecionado via ComboBox)  
- CEP  
- CNPJ  

## Estrutura do Sistema

O sistema possui 5 janelas principais:

1. **Janela Principal**
   - Contém um menu ou botões para abrir os cadastros de clientes e fornecedores.

2. **Janela de Cadastro de Clientes**
   - Exibe uma tabela com os clientes cadastrados.
   - Permite adicionar, editar e remover registros.

3. **Janela de Detalhes do Cliente**
   - Formulário para entrada e visualização dos dados de um cliente.
   - Contém botões "OK" e "Cancelar".

4. **Janela de Cadastro de Fornecedores**
   - Exibe uma tabela com os fornecedores cadastrados.
   - Permite adicionar, editar e remover registros.

5. **Janela de Detalhes do Fornecedor**
   - Formulário para entrada e visualização dos dados de um fornecedor.
   - Contém botões "OK" e "Cancelar".

## Arquitetura e Tecnologias

- Programação orientada a objetos com uso de **herança**.
- Interface gráfica.
- Persistência de dados em **arquivo** (leitura e escrita simples).

## Observações

- Tanto `Cliente` quanto `Fornecedor` herdam de uma classe base comum, contendo os atributos compartilhados (como nome, telefone, endereço, etc).

