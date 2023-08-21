CREATE or replace procedure pcidadefarmaciastodas  ()
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
filax record;
fila record;
r varchar;
cuenta integer;
nombre varchar;
nombreF varchar;
	
BEGIN
r=E'\n';
cuenta = 0;
nombre='';
nombreF='';

for fila in select nomc,codc from cidades  LOOP
 r = r||E'\nEn : '||fila.nomc||E'\n';
 for filax in select nomf,codc from farmacias where codc=fila.codc loop
  r = r||filax.nomf||E'\n';
   end LOOP;
   
     end LOOP;
   
raise notice '%',r;
end;
$$;