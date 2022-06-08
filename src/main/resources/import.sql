insert into cozinha (id,nome) values (1,'Tailandesa');
insert into cozinha (id,nome) values (2,'Indiana');

insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Gourmet', 10, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Thai Delivery', 9.50, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ('Tuk Tuk Comida Indiana', 15, 2);

insert into forma_pagamento (id, nome) values (1, 'Cartão de Crédito');
insert into forma_pagamento (id, nome) values (2, 'Boleto');

insert into permissao (id, nome, descricao) values (1, 'Consultar Produtos', 'Permite consultar produtos');

insert into estado (id, nome) values (1, 'Acre');
insert into cidade (id, nome, estado_id) values (1, 'Acrelândia', 1);
insert into cidade (id, nome, estado_id) values (2, 'Assis Brasil', 1);
insert into cidade (id, nome, estado_id) values (3, 'Brasiléia', 1);
insert into cidade (id, nome, estado_id) values (4, 'Bujari', 1);