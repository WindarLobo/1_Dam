--pxestores 
--valor: 2'5 puntos
--procedimiento que devolva para cada codigo de xestor os postos e a 
--descripcion dos mesmos que xestionou dito xestor, asi como o numero total de postos
-- xestionados por dito xestor.
--si o xestor non xestionou ningun posto debe lanzarse 
--a mensaxe 'este xestor non xestionou ningun posto'
--call pxestores
/*
resultado:
xestor: x1
p1----direc. dep. informatica
p8----vendedor senora
p11----disenador aplicacions
p14----vendedor caballero
p15----vendedor neno
p16----vendedor viaxes
p17----vendedor plantas
total: 7

xestor: x10
este xestor non xestionou ningun posto

xestor: x2
p2----barrendeiro
p7----xefe iluminacion
p9----xefe xardineiros
p10----instalador software
p12----revisor ascensores
total: 5

xestor: x3
p3----limpador colexios
p6----perforador pozos
p13----coidador parques
total: 3

xestor: x4
p4----instalador ordenadores
total: 1

xestor: x5
p342----empregado biblioteca
total: 1

xestor: x6
p5----limpador instalaciones
total: 1

xestor: x7
este xestor non xestionou ningun posto

xestor: x8
este xestor non xestionou ningun posto

xestor: x9
p18----vendedor plantas
total: 1


*/
CREATE or replace procedure pxestores()
    LANGUAGE PLPGSQL
    AS
$$
DECLARE
  x record;
  z record;
  cuenta integer;
  r varchar;
BEGIN
   r = '';
   for x in select cod_xestor from xestores LOOP
   	cuenta = 0;
   	r = r || E'\nXestor: ' || x.cod_xestor;
   	for z in select cod_posto, des_posto from postos where cod_xestor=x.cod_xestor LOOP
   		r = r || E'\n\t' || z.cod_posto || '----' || z.des_posto;
	   	
   	end LOOP;
   	
   	if cuenta = 0 then
   		r = r || E'\n\t' || 'este xestor non xestionou ningun posto'; 
   		else
   		    r = r || E'\n\t\t' || 'total: ' || cuenta;
   	end if;
   	
   end LOOP;
   raise notice '%',r;

end;
$$;

