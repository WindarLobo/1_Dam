/*phospital2
procedemento que amose os nomes de todos os hospitais e para ca un deles os nomes dos medicos que prescribiron  hospitalizacions a asegurados de primeira categoria 


*/


CREATE or replace procedure phospital2()
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
  fila record;
  filay record;
  filaz record;
  x varchar;
BEGIN
x = '';
   for fila in select nomh, codh from hospital LOOP
   	x = x || E'\n' || fila.nomh;
   	for filay in select codm from hosp1 where codh=fila.codh LOOP
   		select nomm into filaz from medico where codm=filay.codm;
   		x = x || E'\n\t' || filaz.nomm;
   	end LOOP;
   end LOOP;
   raise notice '%',x;

end;
$$;
