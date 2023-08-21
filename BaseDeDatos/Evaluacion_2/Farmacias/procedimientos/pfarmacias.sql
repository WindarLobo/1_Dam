/*
que liste os nomes de todas as farmacias */

CREATE or replace procedure pfarmacias()
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
fila record;
r varchar;	
BEGIN
r=E'\n';

for fila in select * from farmacias LOOP
r = r||fila.nomf ||E'\n';
 end LOOP;   
raise notice '%',r;
end;
$$;
