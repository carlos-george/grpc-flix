DROP TABLE IF EXISTS TB_MOVIE;

create table tb_movie (id integer not null, genre varchar(255), rating double not null, title varchar(255), year integer not null, primary key (id));

INSERT INTO TB_MOVIE(id, genre, rating, title, year) values(1, 'ACTION', 4.5, '007 - Sem tempo para morrer', 2021);
INSERT INTO TB_MOVIE(id, genre, rating, title, year) values(2, 'WESTERN', 3.5, 'O Assassinato de Jesse James pelo Covarde Robert Ford', 2007);
INSERT INTO TB_MOVIE(id, genre, rating, title, year) values(3, 'ACTION', 4.5, 'Transformers: O Último Cavaleiro', 2017);
INSERT INTO TB_MOVIE(id, genre, rating, title, year) values(4, 'ACTION', 3.0, 'Velozes E Furiosos 8', 2017);
INSERT INTO TB_MOVIE(id, genre, rating, title, year) values(5, 'DRAMA', 5.0, 'O Poderoso Chefão de Mario Puzo, Coda: A Morte de Michael Corleone', 2020);
INSERT INTO TB_MOVIE(id, genre, rating, title, year) values(6, 'DRAMA', 2.0, 'A Busca', 2012);
INSERT INTO TB_MOVIE(id, genre, rating, title, year) values(7, 'WESTERN', 4.7, 'Sete Homens E Um Destino', 2016);
INSERT INTO TB_MOVIE(id, genre, rating, title, year) values(8, 'WESTERN', 3.5, 'Era Uma Vez No Oeste', 1968);
INSERT INTO TB_MOVIE(id, genre, rating, title, year) values(9, 'CRIME', 4.5, 'Mente Criminosa', 2016);