
/*
pnaveslan.sql
decir si ou non unha nave cuxo nome se pasa como parametro , ten capacidade para levar a toda a sua tripulacion dunha vez nas lanzaderas de que dispon.
call pnaveslan('voyager');
resultado:= 'a nave pode levar a todos os seus tripulantes no conxunto das suas lanzqderas';
call pnaveslan('enterprise');
a nave non pode levar a todos os seus tripulantes no conxunto das suas
lanzaderas
*/CREATE or replace procedure pnaveslan(nome varchar)
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
  x varchar;
  fila record;
  suma integer;
  filax record;
  filay record;
  z integer;
BEGIN
 x = '';
   select codn, nomen, tripul into STRICT fila from naves where nome=nomen;
   z = fila.tripul;
   select sum(capacidade) into suma from lanzaderas where codn=fila.codn;
   
   if suma>=z then
   	x = x || E'\n' || 'El resultado : a nave pode levar a todos os tripulantes no conxunto das suas lanzaderas';
     else
	       x = x || E'\n' || 'a nave non pode levar a todos os tripulantes no conxunto das suas lanzaderas';
   end if;
   raise notice '%', x;
   
 exception
   when no_data_found then
   raise notice 'nome no encontrado';

end;
$$;