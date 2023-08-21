create or replace procedure pklingon() 
language PLPGSQL
AS
$$
DECLARE
fila record;
fila2 record;
a integer;
r varchar;
media numeric;

begin
r=E'\n';

FOR fila IN select codpel,titulo from peliculas LOOP
r=r||E'\n'||'Titulo:'|| fila.titulo||E'\n';

FOR fila2 IN select  peliculas.titulo,personaxes.nomper 
from interpretespel 
inner join peliculas on interpretespel.codpel=peliculas.codpel
inner join personaxes on interpretespel.codper=personaxes.codper
inner join klingon on personaxes.codper=klingon.codper
WHERE peliculas.codpel = fila.codpel  LOOP
r=r||'Personaje: '||fila2.nomper||E'\n';

END loop;   

END loop;
raise notice '%',r;
end;
$$
;
