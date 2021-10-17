DROP TABLE IF EXISTS TB_USER;

create table tb_user (login varchar(255) not null, genre varchar(255), name varchar(255), primary key (login));


INSERT INTO TB_USER(login, name, genre) values('bolinha', 'Carlos George', 'CRIME');
INSERT INTO TB_USER(login, name, genre) values('renata', 'Renata Vitoriano', 'ACTION');