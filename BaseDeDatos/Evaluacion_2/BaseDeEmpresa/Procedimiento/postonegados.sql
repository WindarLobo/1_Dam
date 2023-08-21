/*
procedemento postosnegados que dado o dni dunha persoa devolte a lista dos postos de traballo para os que non  poderia  ser entrevistada debido a que algunhas empresas rexeitan a dita persoa.
call postosnegados('36202020');
p2
p9
p13
p8
p14
p15
p16
p17
esta persoa e rexeitada para un total de 8 postos
call postosnegados('36222222');
esta persoa e entrevistable para calquera posto de calqueira empresa
*/

CREATE or replace procedure postonegados(codigo varchar)
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
  z record;
  t record;
  y record;
  x varchar;
  cuenta integer;
BEGIN
   x = '';
   cuenta = 0;
   select num_persoa into z from persoas where dni=codigo;
   for z in select cod_empresa from rexeita where num_persoa=z.num_persoa LOOP
   	for y in select cod_posto from postos where cod_empresa=z.cod_empresa LOOP
   	   	x = x || E'\n' || y.cod_posto;
   	   	cuenta = cuenta + 1;
   	end LOOP;
   end LOOP;
   if cuenta > 0 then
   	x = x || E'\n' || 'esta persona e rexeitada para ' || cuenta || ' postos';
   	else
   	   x = x || E'\n' || 'esta persoa e entrevistable para calquera posto de calqueira empresa';
   end if;
   raise notice '%',x;

end;
$$;