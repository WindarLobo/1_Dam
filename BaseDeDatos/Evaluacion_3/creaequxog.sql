
set datestyle = "ISO, DMY";
set datestyle to DMY, SQL;
show datestyle;


drop table if exists xogador cascade ;
drop table if exists equipo cascade ;


create table equipo(
codequ varchar(3),
nomequ varchar(17),
numx integer,
primary key (codequ));

create table xogador (
codx varchar(3),
nomx varchar(11),
codequ varchar(3),
salario integer,
comision integer,
datan date,
primary key (codx),
foreign key (codequ) references equipo(codequ));



insert into equipo values('e1','cuspedrinos',null);
insert into equipo values('e2','gambusinos',null);
insert into equipo values('e3','croques',null);
insert into equipo values('e4','reboludos',null);
insert into equipo values('e5','novo',null);



insert into xogador values('x1','luis','e1',2000,null,'3/1/1990');
insert into xogador values('x2','juan','e3',1500,0,'13/4/1991');
insert into xogador values('x3','pedro','e4',1000,null,'12/11/1990');
insert into xogador values('x4','alberto','e2',1000,5,'1/7/1990');
insert into xogador values('x5','juan','e1',1200,10,'23/8/1990');
insert into xogador values('x6','luis','e1',800,20,'12/9/1990');
insert into xogador values('x7','carlos','e3',null,null,'8/10/1990');
insert into xogador values('x8','pedro','e4',3000,5,'7/6/1990');
insert into xogador values('x9','bent','e4',1500,10,'23/4/1990');
insert into xogador values('x10','manuel','e4',null,10,'25/12/1990');
insert into xogador values('x11','antonio','e3',2000,null,'16/6/1990');
insert into xogador values('x12','eliseo','e4',1350,10,'14/5/1990');
insert into xogador values('x13','juan','e2',2000,5,'7/4/1990');
insert into xogador values('x14','federico','e1',1000,10,'5/1/1990');
insert into xogador values('x15','leon','e1',null,null,'27/11/1990');

/*create or replace procedure pequiponumx()  language plpgsql as $$
declare
fx  record; 
--x cursor for select codequ, count(*) cuenta  from xogador group by codequ;
begin
for fx in select codequ, count(*) cuenta  from xogador group by codequ loop
	update equipo set numx= fx.cuenta where codequ= fx.codequ;
end loop;
end;
$$
;
--call pequiponumx();
*/

