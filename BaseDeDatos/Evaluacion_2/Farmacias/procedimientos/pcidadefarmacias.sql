 DROP PROCEDURE pcidadefarmacias(codigoF integer); 
CREATE or replace procedure pcidadefarmacias (codigoF integer)
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
filax integer;
fila record;
r varchar;
	
BEGIN
r=E'\n';
   select count(*) into filax from cidades where codc=codigoF;
 if filax = 0 then
  r = r || 'esta farmacia no se enceuntra en esa ciudad'; 
   else

for fila in select nomf from farmacias where codc=codigoF  LOOP
 r = r||'La farmacia es:'||fila.nomf||E'\n';

   end LOOP; 
 
	   end if;
			   
raise notice '%',r;
end;
$$;


/* tambien asi 
call pcidadefarmacias(16) 

CREATE or replace procedure pcidadefarmacias (codigo integer)
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
cuenta=0;


for fila in select nomf,codc  from farmacias  where codigo=codc LOOP
cuenta = cuenta+1;
 r=r||E'\n '|| fila.nomf;
end LOOP;

if cuenta =0 then 
 r=r||E'\n '|| 'La farmacia no existe ';
  end if;


raise notice ' % ',r;

end;
$$;
*/