set datestyle = "ISO, DMY";
set datestyle to DMY, SQL;
show datestyle;

drop table if exists  xoga cascade ;
drop table if exists  movemento cascade ;
drop table if exists  partida cascade ;
drop table if exists  xornada cascade ;
drop table if exists  aloxa cascade ;
drop table if exists  arbitro cascade ;
drop table if exists  xogador cascade ;
drop table if exists  participante  cascade ;
drop table if exists  dispon  cascade ;
drop table if exists  medio  cascade ;
drop table if exists  sala  cascade ;
drop table if exists  hotel  cascade ;
drop table if exists  pais  cascade ;


create table pais (
np integer,
nome varchar(15),
nclubs integer,
npr integer,
primary key (np),
foreign key (npr) references pais(np)
);

insert into pais values(1,'espanha',6,null);
insert into pais values(2,'francia',7,null);
insert into pais values(3,'holanda',5,null);
insert into pais values(4,'portugal',6,null);
insert into pais values(5,'italia',20,3);
insert into pais values(6,'alemania',10,null);
insert into pais values(7,'bulgaria',10,3);


create table hotel (
nomh varchar(15),
dirh varchar(15),
telfh integer,
primary key (nomh)
);

insert into hotel values('viveiro','r/auga',9865);
insert into hotel values('mexico','r/lua',9861);
insert into hotel values('zurich','r/pedra',9862);
insert into hotel values('vento','r/mar',9863);
insert into hotel values('laias','r/sol',9864);




create table sala(
cods varchar(3),
capacidade integer,
nomh varchar(15),
primary key (cods),
foreign key (nomh) references hotel(nomh)
);

insert into sala values('s1',40,'mexico');
insert into sala values('s2',50,'mexico');
insert into sala values('s3',60,'mexico');
insert into sala values('s4',40,'mexico');
insert into sala values('s5',30,'mexico');
insert into sala values('s6',40,'vento');
insert into sala values('s7',50,'vento');
insert into sala values('s8',60,'vento');
insert into sala values('s9',50,'vento');
insert into sala values('s10',30,'vento');
insert into sala values('s11',30,'vento');


create table medio(
nomm varchar(20),
primary key (nomm)
);
insert into medio values('proxector');
insert into medio values('tv');
insert into medio values('pdixital');
insert into medio values('videoconferencia');
insert into medio values('interede');
insert into medio values('son');


create table dispon(
cods varchar(3),
nomm varchar(20),
primary key (cods,nomm),
foreign key (cods) references sala(cods),
foreign key (nomm) references medio(nomm)
);

insert into dispon values('s1','tv');
insert into dispon values('s1','videoconferencia');
insert into dispon values('s2','son');
insert into dispon values('s2','interede');
insert into dispon values('s2','pdixital');
insert into dispon values('s3','interede');
insert into dispon values('s7','pdixital');
insert into dispon values('s8','tv');
insert into dispon values('s8','son');


create table participante(
codp varchar(3),
nomp varchar(15),
dirp varchar(15),
telfp integer, 
np integer,
primary key (codp),
foreign key (np) references pais(np)
);

insert into participante values('p1','ana',null,null,1);
insert into participante values('p2','pedro',null,9869,1);
insert into participante values('p3','rafael',null,null,1);
insert into participante values('p4','bieito',null,null,1);
insert into participante values('p5','jana',null,null,2);
insert into participante values('p6','xiana',null,98612,2);
insert into participante values('p7','comba',null,null,2);
insert into participante values('p8','xulia',null,98621,2);
insert into participante values('p9','ainara',null,98617,3);
insert into participante values('p10','isabel',null,null,3);
insert into participante values('p11','felipe',null,null,3);
insert into participante values('p12','manuel',null,null,3);
insert into participante values('p13','felipe',null,null,4);
insert into participante values('p14','laura',null,null,4);
insert into participante values('p15','luisa',null,null,4);
insert into participante values('p16','ramona',null,null,4);
insert into participante values('p17','angeles',null,null,1);
insert into participante values('p18','daniel',null,null,2);
insert into participante values('p19','amelia',null,null,3);
insert into participante values('p20','xoan',null,null,4);
insert into participante values('p21','xandre',null,null,6);
insert into participante values('p22','felipe',null,null,6);
insert into participante values('p23','xose',null,null,6);
insert into participante values('p24','ana',null,null,6);
insert into participante values('p25','felipe',null,null,6);


create table xogador(
codp varchar(3),
nivel integer,
primary key (codp),
foreign key (codp) references participante(codp)
);

insert into xogador values ('p1',null);
insert into xogador values ('p2',null);
insert into xogador values ('p3',null);
insert into xogador values ('p4',null);
insert into xogador values ('p5',null);
insert into xogador values ('p6',null);
insert into xogador values ('p8',null);
insert into xogador values ('p9',null);
insert into xogador values ('p10',null);
insert into xogador values ('p11',null);
insert into xogador values ('p12',null);
insert into xogador values ('p13',null);
insert into xogador values ('p14',null);
insert into xogador values ('p15',null);
insert into xogador values ('p16',null);
insert into xogador values ('p17',null);
insert into xogador values ('p18',null);
insert into xogador values ('p19',null);




create table arbitro(
codp varchar(3),
primary key (codp),
foreign key (codp) references participante(codp)
);

insert into arbitro values ('p21');
insert into arbitro values ('p22');
insert into arbitro values ('p23');
insert into arbitro values ('p24');


create table aloxa(
codp varchar(3),
nomh varchar(15),
den date,
dsa date,
primary key (codp,nomh,den),
foreign key (nomh) references hotel (nomh) 
);

insert into aloxa values ('p4','vento','1/6/2017','1/8/2017');
insert into aloxa values ('p5','vento','1/6/2017','1/8/2017');
insert into aloxa values ('p6','laias','1/6/2017','1/8/2017');
insert into aloxa values ('p7','laias','1/6/2017','1/8/2017');
insert into aloxa values ('p8','vento','1/7/2017','1/9/2017');
insert into aloxa values ('p9','mexico','1/7/2017','1/9/2017');
insert into aloxa values ('p10','mexico','1/7/2017','1/9/2017');
insert into aloxa values ('p11','zurich','1/7/2017','1/9/2017');
insert into aloxa values ('p12','zurich','1/7/2017','1/9/2017');
insert into aloxa values ('p13','mexico','1/7/2017','1/9/2017');
insert into aloxa values ('p14','mexico','1/8/2017','1/10/2017');
insert into aloxa values ('p15','zurich','1/8/2017','1/10/2017');
insert into aloxa values ('p16','laias','1/8/2017','1/10/2017');
insert into aloxa values ('p17','vento','1/8/2017','1/10/2017');
insert into aloxa values ('p18','vento','1/8/2017','1/10/2017');
insert into aloxa values ('p19','laias','1/8/2017','1/10/2017');
insert into aloxa values ('p21','laias','1/6/2017','1/2/2018');
insert into aloxa values ('p22','vento','1/6/2017','1/2/2018');
insert into aloxa values ('p23','mexico','1/6/2017','1/2/2018');
insert into aloxa values ('p1','mexico','1/9/2017','1/11/2017');
insert into aloxa values ('p2','zurich','1/9/2017','1/11/2017');
insert into aloxa values ('p3','zurich','1/9/2017','1/11/2017');
insert into aloxa values ('p4','mexico','1/9/2017','1/11/2017');
insert into aloxa values ('p5','mexico','1/9/2017','1/11/2017');
insert into aloxa values ('p6','zurich','1/9/2017','1/11/2017');
insert into aloxa values ('p7','laias','1/9/2017','1/11/2017');
insert into aloxa values ('p8','vento','1/9/2017','1/11/2017');
insert into aloxa values ('p9','vento','1/11/2017','1/2/2018');
insert into aloxa values ('p10','laias','1/11/2017','1/2/2018');
insert into aloxa values ('p11','laias','1/11/2017','1/2/2018');
insert into aloxa values ('p12','vento','1/11/2017','1/2/2018');
insert into aloxa values ('p13','mexico','1/11/2017','1/2/2018');
insert into aloxa values ('p14','mexico','1/11/2017','1/2/2018');
insert into aloxa values ('p15','zurich','1/11/2017','1/2/2018');
insert into aloxa values ('p16','zurich','1/11/2017','1/2/2018');
insert into aloxa values ('p17','mexico','1/11/2017','1/2/2018');





create table xornada (
dia integer,
mes integer,
ano integer,
primary key (dia,mes,ano)
);

insert into xornada values (3,6,2017);
insert into xornada values (5,6,2017);
insert into xornada values (8,6,2017);
insert into xornada values (2,7,2017);
insert into xornada values (5,7,2017);
insert into xornada values (8,7,2017);
insert into xornada values (9,7,2017);
insert into xornada values (15,7,2017);
insert into xornada values (21,7,2017);
insert into xornada values (3,8,2017);
insert into xornada values (7,8,2017);
insert into xornada values (12,8,2017);
insert into xornada values (14,8,2017);
insert into xornada values (21,9,2017);
insert into xornada values (2,10,2017);
insert into xornada values (4,10,2017);
insert into xornada values (20,10,2017);
insert into xornada values (21,10,2017);
insert into xornada values (2,11,2017);
insert into xornada values (4,11,2017);
insert into xornada values (7,11,2017);
insert into xornada values (20,11,2017);
insert into xornada values (1,12,2017);
insert into xornada values (14,12,2017);
insert into xornada values (15,12,2017);
insert into xornada values (17,12,2017);
insert into xornada values (10,1,2018);
insert into xornada values (13,1,2018);
insert into xornada values (15,1,2018);
insert into xornada values (17,1,2018);
insert into xornada values (19,1,2018);
insert into xornada values (22,1,2018);
insert into xornada values (24,1,2018);
insert into xornada values (25,1,2018);
insert into xornada values (26,1,2018);
insert into xornada values (28,1,2018);
insert into xornada values (29,1,2018);
insert into xornada values (30,1,2018);
insert into xornada values (1,2,2018);

create table partida(
codpa varchar(4),
cods varchar(3),
codp varchar(3),
dia integer,
mes integer,
ano integer,
primary key (codpa),
foreign key (cods) references sala(cods),
foreign key (codp) references arbitro(codp),
foreign key (dia,mes,ano) references xornada (dia,mes,ano)
);

insert into partida values ('pa1','s1','p21',3,6,2017);
insert into partida values ('pa2','s1','p22',3,6,2017);
insert into partida values ('pa3','s1','p22',5,6,2017);
insert into partida values ('pa4','s2','p23',8,6,2017);
insert into partida values ('pa5','s2','p23',8,6,2017);
insert into partida values ('pa6','s2','p23',2,7,2017);
insert into partida values ('pa7','s3','p21',2,7,2017);
insert into partida values ('pa8','s3','p21',9,7,2017);
insert into partida values ('pa9','s3','p21',9,7,2017);
insert into partida values ('pa10','s4','p22',21,7,2017);
insert into partida values ('pa11','s4','p22',3,8,2017);
insert into partida values ('pa12','s4','p22',3,8,2017);
insert into partida values ('pa13','s5','p23',7,8,2017);
insert into partida values ('pa14','s5','p23',12,8,2017);
insert into partida values ('pa15','s6','p23',2,11,2017);
insert into partida values ('pa16','s6','p21',2,11,2017);
insert into partida values ('pa17','s7','p21',2,11,2017);

insert into aloxa values ('p1','mexico','1/6/2017','1/8/2017');
insert into aloxa values ('p2','zurich','1/6/2017','1/8/2017');
insert into aloxa values ('p3','laias','1/6/2017','1/8/2017');





create table movemento(
codpa varchar(4),
n integer,
comentario varchar(20),
primary key (codpa,n),
foreign key (codpa) references partida(codpa) 
);

insert into movemento values ('pa1',1,'comentario1');
insert into movemento values ('pa1',2,'comentario2');
insert into movemento values ('pa1',3,'comentario3');
insert into movemento values ('pa2',1,'comentario4');
insert into movemento values ('pa2',2,'comentario5');
insert into movemento values ('pa3',1,'comentario6');
insert into movemento values ('pa3',2,'comentario7');
insert into movemento values ('pa3',3,'comentario8');
insert into movemento values ('pa4',4,'comentario9');
insert into movemento values ('pa4',5,'comentario10');
insert into movemento values ('pa5',1,'comentario11');
insert into movemento values ('pa6',1,'comentario12');
insert into movemento values ('pa7',1,'comentario13');
insert into movemento values ('pa8',1,'comentario14');
insert into movemento values ('pa9',1,'comentario15');
insert into movemento values ('pa10',1,'comentario16');
insert into movemento values ('pa11',1,'comentario17');
insert into movemento values ('pa12',1,'comentario18');
insert into movemento values ('pa14',1,'comentario20');
insert into movemento values ('pa14',2,'comentario21');
insert into movemento values ('pa14',3,'comentario22');
insert into movemento values ('pa15',4,'comentario23');

create table xoga(
codp varchar(3),
codpa varchar(4),
cor varchar(7),
primary key(codp,codpa),
foreign key (codp) references xogador(codp),
foreign key (codpa) references partida(codpa)
);


insert into xoga values ('p1','pa1','brancas');
insert into xoga values ('p2','pa1','negras');
insert into xoga values ('p3','pa2','brancas');
insert into xoga values ('p4','pa2','negras');
insert into xoga values ('p5','pa3','brancas');
insert into xoga values ('p6','pa3','negras');
insert into xoga values ('p5','pa4','brancas');
insert into xoga values ('p8','pa4','negras');
insert into xoga values ('p9','pa5','brancas');
insert into xoga values ('p10','pa5','negras');
insert into xoga values ('p11','pa6','brancas');
insert into xoga values ('p12','pa6','negras');
insert into xoga values ('p13','pa7','brancas');
insert into xoga values ('p11','pa7','negras');
insert into xoga values ('p11','pa8','brancas');
insert into xoga values ('p1','pa8','negras');
insert into xoga values ('p2','pa9','brancas');
insert into xoga values ('p3','pa9','negras');
insert into xoga values ('p4','pa10','brancas');
insert into xoga values ('p5','pa10','negras');
insert into xoga values ('p8','pa11','brancas');
insert into xoga values ('p9','pa11','negras');
insert into xoga values ('p10','pa12','negras');
insert into xoga values ('p11','pa12','brancas');
insert into xoga values ('p12','pa13','negras');
insert into xoga values ('p13','pa13','brancas');
insert into xoga values ('p14','pa14','negras');
insert into xoga values ('p15','pa14','brancas');
insert into xoga values ('p9','pa15','negras');
insert into xoga values ('p17','pa15','brancas');

