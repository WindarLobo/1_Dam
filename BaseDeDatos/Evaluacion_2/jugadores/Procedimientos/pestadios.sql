CREATE or replace PROCEDURE pestadio()
	LANGUAGE plpgsql
       AS
    $$
    DECLARE
	fila record;
	filax record;
	r varchar;
	c integer;
    BEGIN
    	r=E'\n';
	for fila in select * from estadio LOOP
	r= r||fila.codest ||','||fila.nomest ||E'\n';
	c=0;
		for filax in select * from partido where codest=fila.codest LOOP
		c=c+1;		
		r=r||E'\t'||filax.codpar||','||filax.nompar||','||filax.data||filax.codest||E'\n';
	END LOOP;
	if c != 0 then
	r = r||'En este estadio se han celebrado:'||c||E'\n';
	else
	r = r||'No se han celebrado partidos en este estadio'||E'\n';
	end if;
	END loop;
	raise notice '%',r;
    END;
    $$
    ;
