Considere um sistema de agente on-line de viagens que é um tipo de sistema que intermédia a interação com outros sistemas, tais como, Sistema de Operadora de Cartões de Crédito, Sistema de Reservas de Hotel, Sistema de Vendas de Passagens Aéreas, Sistema de Locação de Carros. Você está interagindo com esse sistema para adquirir uma série de itens que podem fazer parte de sua viagem de férias, tais produtos seriam: passagem aérea, estadia em Hotel ou locação de carros. Nesta interação você encontra alguns cenários de uso relacionados abaixo:
- Comprar passagem de avião: Reservar um voo e fornecer informações de pagamento e suas informações e de endereço;
- Fornecer informações de pagamento: Fornecer um cartão de crédito para pagamento das despesas decorrentes;
- Fornecer Dados Cliente: Fornecer os seus dados e de endereço de residência e de correspondência;
- Alugar um carro: Reservar um carro para aluguel e forneça as informações de pagamento e endereço;
- Adquirir uma reserva de estadia de hotel: Reserve um quarto de hotel e forneça as informações de pagamento e endereço;
- Fazer uma compra: Faça compra de uma viagem e fornecer as informações de pagamento e endereço.

Considere o cenário de Uso Comprar Passagem Aérea, apresentado a seguir:

Cenário de Uso: Comprar Passagem Aérea
Ator principal: Cliente
Objetivo
Realizar uma compra de passagem aérea
Cenário principal
    •   Cliente informa seus dados de login e solicita confirmação.
    •   Sistema realiza a validação do login e solicita informação da passagem aérea (origem, destino e data)
    •   Cliente informa origem, destino e data solicita disponibilidade.
    •   Sistema realiza busca nas companhias Aéreas que atendam os critérios de origem, destino e data que tenha disponibilidade de voos.
    •   Sistema retorna a relação de voos resultados da busca (origem, destino, data, classe, posição poltrona, preço)
    •   Cliente seleciona as opções desejadas e solicita compra
    •   Sistema retorna o valor total da compra e solicita dados do pagamento
    •   Cliente informa dados do cartão e confirma pagamento
    •   Sistema valida dados do cartão e realiza confirmação com o sistema da operadora de Cartão 
    •   Sistema realiza a compra das passagens com o sistema da Companhia Aérea definidas pelo cliente
    •   Sistema envia uma notificação de confirmação de compra para o cliente
    •   Sistema exibe mensagem de operação realizada com sucesso.
Extensões
5. Passagem não disponível
    a. Sistema oferece alternativas
    b. Cliente seleciona a partir das alternativas
5b. Cliente rejeita as alternativas
     a. Encerra
6 Cliente recusa a oferta
     a. Encerra
9. Operadora de Cartão rejeita a pagamento
    a. Sistema envia mensagem informando que a reserva não foi realizada devido a problemas com o cartão.

Com base nos passos do cenário de uso e usando os estereótipos de análise, pede-se para: Elaborar o diagrama de classes e o diagrama de sequência do fluxo principal para o Cenário Comprar Passagem Area. Importante: Deve haver correspondência entre o diagrama de Classes e o diagrama de sequência. 

Critério de Avaliação para o diagrama de classes e de sequência são os seguintes:
    •   Identificação das classes envolvidas no cenário 
    •   Emprego correto dos tipos de associação entre as classes 
    •   Identificação dos atributos das classes adequadas
    •   Identificação das operações das classes adequadas 
    •   Identificação dos objetos envolvidos no cenário no diagrama de sequência
    •   Identificação correta dos estímulos gerados pelo Ator e que o sistema deve responder 


