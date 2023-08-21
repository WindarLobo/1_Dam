/* 1) procedimiento photeis, que muestre todos los nombres de los hoteles, por cada hotel mostrar las fechas de entrada y salida en la que se alojaron, además del nombre de la persona que se alojó en esas fechas. Además, mostrar la cantidad total de alojados por hotel.

Si no tiene personas alojadas mostrar un mensaje que diga ''no hay personas alojadas en este hotel?*/

create or replace procedure photeis() 
language PLPGSQL
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

   for fila in select nomh from hotel LOOP
	 x = x || E'\n\t' ||'******* Hotel '|| fila.nomh || '******';
	  cuenta =0;
	for q in  select codp,den,dsa from aloxa  where nomh =fila.nomh loop
	  select nomp into filax from participante a where codp =q.codp;
	  cuenta=cuenta+1;
	 x = x || E'\n'||'Nombre :  ' ||filax.nomp ||'  fecha entrada:  '||q.den||'  fecha salida:  '||q.dsa||E'\n' ;
	
end loop;
if cuenta=0 then 
 x = x || E'\n'||'No hay personas  alojadas en este hotel  '||E'\n';
 
 else
  x = x || E'\n'||'El total es : '|| cuenta ||E'\n';
  end if;
    end loop; 
	
    raise notice '%',x ; 
end;
$$;
end;
$$;
     
  
    raise notice '%',x;
end;