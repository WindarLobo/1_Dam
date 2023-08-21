/*
parea
procedemento que liste os codigos de todas as areas e para cada codigo de area os nomes dos asegurados de dita area xunto co numero total deles.
Se un area non ten asegurados debe imprimirse a mensaxe: area sen asegurados:

puntuacion:
amosar codigos de area: .5
amosar nomes de asegurados: 1
amosar numero total de asegurados: .25
amosar 'area sen asegurados' : .25 



call parea();

codigo de area: a1
luis
ana
numero de asegurados: 2
codigo de area: a2
pedro
juan
carlos
numero de asegurados: 3
codigo de area: a3
bieito
numero de asegurados: 1
codigo de area: a4
xoan
eva
comba
ainara
numero de asegurados: 4
codigo de area: a5
dorotea
elisa
amalia
dolores
maria
xose
andrea
iria
antia
xana
numero de asegurados: 10
codigo de area: a6
area  sen asegurados
codigo de area: a7
jose
numero de asegurados: 1

*/

create or replace procedure parea() 
language PLPGSQL
AS
$$
DECLARE
fila record;
fila2 record;
a integer;
r varchar;
c integer;

begin
r=E'\n';

FOR fila IN select coda from area LOOP
r=r||E'\n'||'codigo de area:'|| fila.coda||E'\n';
c=0;
FOR fila2 IN select asegurado.nomas from asegurado 
WHERE asegurado.coda = fila.coda  LOOP
c=c+1;
r=r||fila2.nomas||E'\n';

END loop;
if c != 0 then
	r = r||'numero de asegurados:'||c||E'\n';
	else
	r = r||'area  sen asegurados'||E'\n';
	end if;
END loop;
raise notice '%',r;
end;
$$
;

