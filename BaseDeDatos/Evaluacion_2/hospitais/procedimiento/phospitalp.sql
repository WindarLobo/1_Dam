/*
phospitalp
procedimento que, pasandolle o nome dun hospital, imprima os nomes dos asegurados de 1ª categoria que foron hospitalizados nel .
 Se non ten asegurados de primeira categoria hospitalizados debe imprimirse a mensaxe 'este hospital non ten asegurados de 1º categoria hospitalizados'  
 Se o hospital non existe debe imprimirse a mensaxe adecuada (mediante tratamento de excepcions) .

call phospitalp ('povisa');
andrea
dorotea

call phospitalp ('sonic');
este hospital non ten asegurados de 1º categoria hospitalizados

execute phospital ('roma');
este hospital non existe

*/


create or replace procedure phospitalp(nome varchar) 
language PLPGSQL
AS
$$
declare
x varchar;
  fila record;
  filay record;
  filaz record;
  z integer;
BEGIN
   x = '';
   select codh into STRICT fila from hospital where nomh=nome;
   x = x || E'\n' || nome;
   z = 0;
   for filay in select codp,numas from hosp1 where codh=fila.codh LOOP
   	z = 1;
   	for filaz in select nomas from asegurado where codp=filay.codp and numas=filay.numas LOOP
   		x = x || E'\n\t' || filaz.nomas;
   	end LOOP;
   end LOOP;
   if z=0 then
   	x = x || E'\n\t' || 'Este hospital no tiene asegurados de 1º categoria hospitalizados';
   end if;
   raise notice '%',x;
   
   exception
      when no_data_found then
      x = x || 'este hospital no existe';
      raise notice '%',x;
      
end;
$$;