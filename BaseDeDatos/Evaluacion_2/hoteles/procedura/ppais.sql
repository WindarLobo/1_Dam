/*

 2) procedimiento ppais que al dar el nombre del país muestre los nombres de todos los participantes de este, 
 mostrar también el total de participantes registrados y si no tiene, 
 que el mensaje sea ''país sin participantes registrados''.
 En caso de que no exista el país que el mensaje sea ''país inexistente''
call ppais('bulgaria') 
Pais sin particpante registrados
*/

CREATE or replace procedure ppais(nombre varchar)
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
  q record;
  x varchar;
  fila  record;
   filax  record;
  cuenta integer;
BEGIN

 x = E'\n';
cuenta=0;
 select nome,np  into STRICT   fila   from pais where nome=nombre;
  x = x || E'\n' ||fila.nome||E'\n';
     for filax in select codp,nomp from participante where np=fila.np loop
	cuenta=cuenta+1;
	 x = x || E'\n' ||' * ' ||filax.nomp;
	end loop;
	 if cuenta=0 then
   	x = x ||'Pais sin particpante registrados'|| E'\n';
    else
  x = x || E'\n'||'El total es : '|| cuenta ||E'\n';
  
 	   end if;
	   
    raise notice '%',x ;
	 exception
      when no_data_found then
      x = x || 'País inexistente';
      raise notice '%',x ;
end;
$$;