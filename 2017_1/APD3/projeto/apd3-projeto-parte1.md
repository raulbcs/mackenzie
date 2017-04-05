# Projeto de "Análise de projetos e desenvolvimento" - Parte I: Visão de Projeto Prelimiar  
## Documento de Visão

######Aluno: Raul Bernardeli
######TIA: 41638441  

Índice:  <br />\
1. [Objetivo do software](#objetivo)<br>\
2. [Escopo do software](#escopo)  <br>\
3. [Principais requisitos de negócio](#requisitos)<br>\
|- a. [Na visão do dono do evento](#dono)<br>\
|- b. [Na visão do promoter](#promoter)<br>\
|- c. [Na visão do fornecedor de serviços](#fornecedor)<br>\
|- d. [Requisitos não funcionais](#naofuncionais)<br>\
4. [Modelo de classes de domínio](#modelo)<br>\

------------------------------------------------------------------------

###<a name="objetivo"></a>Objetivo do software
O **Organizâe** é uma aplicação web com a finalidade de facilitar a contratação de qualquer tipo de evento, desde festa de aniversário até evento corporativo com palestra.

###<a name="escopo"></a>Escopo do software
Através do software o promoter deverá capaz de agendar; dimensionar; especificar os serviços necessários; procurar, contratar e pagar fornecedores; receber pagamentos.  
O dono do evento deverá ser capaz de escolher um promoter; definir um contrato com as especificações do evento; acompanhar o andamento; fazer uma avaliação de todos os serviços após a realização do evento.  
Já o fornecedor de serviços poderá oferecer serviços; subcontratar outros fornecedores; calcular o orçamento; controlar recursos, etc.

###<a name="requisitos"></a>Principais requisitos de negócio
######<a name="dono"></a> Na visão do dono do evento:

- Procurar, selecionar e contratar um promoter
- Definir um contrato especificando as características
- Aprovar orçamento
- Acompanhar o andamento da preparação do evento
- Realizar o pagamento
- Avaliar a organização (promoter/fornecedores)

######<a name="promoter"></a> Na visão do promoter:

- Procurar, selecionar e contratar fornecedores de serviços da listagem de fornecedores
- Definir um contrato especificando as características de cada serviço requisitado
- Calcular o orçamento de um evento
- Acompanhar o andamento do fornecimento de serviços
- Emitir nota fiscal
- Receber pagamento
- Pagar fornecedores
- Avaliar fornecedores

######<a name="fornecedor"></a> Na visão do fornecedor de serviços:

- Oferecer serviços
- Subcontratar serviços
- Calcular orçamento
- Controlar recursos utilizados no fornecimento de serviços
- Controlar calendário de serviços contratados
- Emitir nota fiscal
- Pagar subcontratado
- Receber pagamento do serviço
- Avaliar subcontratado

######<a name="naofuncionais"></a> Requisitos não funcionais: {#naofuncionais}

- Conjunto de funcionalidades que podem ser configuradas pelo usuário (customização)
- Pagamentos realizados através da plataforma serão taxados
- O portal deve ter alta disponibilidade
- Deverá ser uma API de Level 2 (HTTP Verbs) no modelo de maturidade Richardson ([_Richardson Maturity Model_](https://martinfowler.com/articles/richardsonMaturityModel.html))


###<a name="modelo"></a>Modelo de classes de domínio (aplicando padrões de análise)

![modelo](apd3-projeto1.png)