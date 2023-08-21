
create or replace procedure pmediasalarioequipo() 
language PLPGSQL
AS
$$
DECLARE
fila record;

r varchar;

media numeric;
begin
r=E'\n';
FOR fila IN select * from equipo LOOP 
r=r||fila.codequ||' , '||fila.nomequ||E'\t';
select avg(salario) into media from xogador where codequ=fila.codequ;
if media is not null then
r=r||media||E'\n';
else
r=r||' el equipo no tiene jugador'||E'\t';
 end if;
END loop;
raise notice '%',r;
end;
$$
;
