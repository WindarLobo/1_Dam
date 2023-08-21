/*llamado pfarmaciascidades que liste los nombres de todasa las farmacias y el nombre de la ciudad donde se encuentran*/


CREATE or replace procedure pfarmaciascidades()
    LANGUAGE PLPGSQL
    AS
$$

DECLARE
fila record;
filax record;
r varchar;
 cuenta integer;
  e integer;
	
BEGIN
r=E'\n';
cuenta = 0;
cuenta = cuenta+1;
for fila in select nomf,codc from farmacias  LOOP
FOR filax IN select nomc from cidades where codc=fila.codc LOOP
 r=r||E'\n '|| fila.nomf||E'\n\t' ||filax.nomc;

end LOOP;
end LOOP;
raise notice ' % ',r;

end;
$$;
