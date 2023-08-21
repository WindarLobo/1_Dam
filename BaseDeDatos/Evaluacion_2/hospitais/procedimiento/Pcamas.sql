/*


phcamas:

procedimento que, pasandolle o numero de camas como parametro, devolte os nomes dos hospitais propios que as superan asi como os nomes dos hospitalizados de 1º categoria que estiveron neles, e o seu total. Se ningun hospital propio supera o numero de camas a mensaxe debe ser: 'ningun hospital propio supera ese numero de camas'
Si agun dos hospitais non ten hospitalizados de 1ª categoria a mensaxe debe ser : 'hospital sen hospitalizados'.




Ex:
call phcamas(150);
hospital: canalejo
dolores
dolores
o numero de hospitalizados e : 2

hospital: meixoeiro
hospital sen hospitalizados

hospital: paz
andrea
o numero de hospitalizados e : 1
Ex:
call  phcamas(3000);
ningun hospital propio supera ese numero de camas
*/

create or replace procedure phcamas(ncamas integer)
	language plpgsql
	as
$$
declare
r varchar;
fila record;
fila2 record;
nomAseg varchar;
m integer;
m2 integer;
begin
r = E'\n';
m=0;
m2=0;

for fila in select * from hospital where codh in (select codh from propio) and numc>ncamas loop
	r=r||'nombreh: '||fila.nomh||E'\n';
	m = 1;
		m2=0;
		for fila2 in select * from hosp1 where codh = fila.codh loop
			m2=m2 +1;	

				select nomas into nomAseg from asegurado where codp = fila2.codp and numas = fila2.numas;

					r=r||'nombreASEG:  '||nomAseg||E'\n';



		end loop;
		
		if m2 = 0 then
		r=r||E'\t'||'hospital sen hospitalizados'||E'\n';
		else
		r=r||'el numero de hospitalizads es: '||m2||E'\n';


		end if;


end loop;
	
	if m = 0 then
		r=r||'ningun hospital propio supera ese numero de camas';

	end if;
	

raise notice '%',r;
end;
$$
;