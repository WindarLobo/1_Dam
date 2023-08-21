/*
hay quelanzar la tabla primero de ejecutar (OjO)
ppersoa
procedemento chamdo ppersoa que amose para unha persoa cuxo dni se pasa por parámetro o seu nome e os postos para os que se lle fixeron entrevistas e o nome e apelidos do xestor que llas fixo 


call ppersoa('36555555');

persoa: elisa,bermudez,bastos
postos e xestor que o xestionou:
p1 : ricardo,leiro,suarez
p342 : eva,bastos,boullosa
p14 : ricardo,leiro,suarez*/


CREATE or replace procedure ppersoa(codigo varchar)
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
  x varchar;
  z record;
  y record;
  w record;
  t record;
BEGIN
   x = '';
   select num_persoa, nom_persoa, ap1_persoa, ap2_persoa into z from persoas where dni=codigo;
   
   x = x || E'\n Persoa:' || z.nom_persoa || ', ' || z.ap1_persoa || ', ' || z.ap2_persoa || E'\n Postos e xestor que o xestionou:';
  
   for y in select cod_posto from entrevista where num_persoa=z.num_persoa LOOP
   	select cod_xestor into w from postos where cod_posto=y.cod_posto;   
	select nom_xestor, ap1_xestor, ap2_xestor into t from xestores where cod_xestor=w.cod_xestor;
	
	x = x || E'\n\t' || y.cod_posto || ' : ' || t.nom_xestor || ', ' || t.ap1_xestor || ', ' || t.ap2_xestor;
	
   end LOOP;
   raise notice '%',x;

end;
$$;
