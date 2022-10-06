create table assistances
(
id bigint auto_increment primary key,
name varchar(100)  not null,
description varchar(100)  not null
);

INSERT INTO assistances( name, description) VALUES('Troca de aparelhos', 'Troca de aparelho decodificador de sinal');
INSERT INTO assistances( name, description) VALUES('Troca de cabo interno', 'Troca de cabo interno');
INSERT INTO assistances( name, description) VALUES('Troca de fiação', 'Substituição de ficção interna de requidencia');
INSERT INTO assistances( name, description) VALUES('Manutenção de fiação', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances( name, description) VALUES('Manutenção de geladeira', 'Reparo sem necessidade de compra de peças');
INSERT INTO assistances( name, description) VALUES('Manutenção em maquina de lavar', 'Reparo sem necessidade de compra de peças');