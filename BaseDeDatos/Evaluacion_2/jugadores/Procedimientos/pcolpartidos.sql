/*
procedimiento chamado pcolpartidos que amose para cada colexiado (codigo e nome ) o nome e as datas dos partidos nos que interven. tamen amosar o total de partidos en que interven cda colexiado , si non interven en nungunpartido amosar a mensaxe -colexiado sen partidos arbitrados
pasos posibles a seguir antes de chegar ao resultado final:
paso 1 : amosar codigo e nome de colexiado : for ..loop para colexiados
paso 2 : amosar codigos de partidos : for .. loop para tabla interven
paso 3 : amosar nome e data dos partidos : select into en table partidos
paso 4 : amosar numero de partidos arbitrados por cada colexiado e mensaxe en caso de non arbitrar ningun
*/
CREATE or replace procedure pcolpartidos()
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
  x varchar;
  fila record;
  filax record;
  filay record;
  cuenta integer;
BEGIN
   x='';
   for fila in select nomc,codc from colexiado LOOP
   cuenta = 0;
   x = x || E'\n' || fila.nomc || ', ' || fila.codc;
   	for filax in select codc, codpar from interven where codc=fila.codc LOOP
  	 	cuenta = cuenta +1;
  	 	select codpar, nompar, data into filay from partido where codpar=filax.codpar;
  	 	x = x || E'\n\t' || filay.nompar ||', ' || filay.data;
    	end LOOP;
    	x = x || E'\n     ';
   	if cuenta = 0 then
   		x = x || 'sin partidos arbitrados' || E'\n';
   	   else
   	   	x = x || cuenta || ' partidos arbitrados en total' || E'\n';
   	end if;
   end LOOP;   
   raise notice '%', x;
end;
$$;