CREATE or replace procedure pfarmacianome (codigoF integer)
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
fila record;
r varchar;
cuenta integer;
	
BEGIN
r=E'\n';
cuenta = 0;
for fila in select nomf,codf from farmacias where codf=codigoF LOOP
cuenta = cuenta +1;
   end LOOP; 
   if cuenta != 0 then
     r = r||'La farmacia es : '||fila.nomf ||E'\n';
   		else
		r = r || E'\n' || 'esta farmacia no existe'; 
   	end if;
raise notice '%',r;
end;
$$;
