/*
tmesmotitulop
impedir que se rexistre una película de igual titulo que calquera das series existentes
insert into peliculas values ('pel10','cosmos',1980, 'adams');
rexeitada insercion;
insert into peliculas values ('pel10','cosmas',1980, 'adams');
aceptada insercion
*/
DROP FUNCTION tmesmotitulop() CASCADE;
CREATE FUNCTION tmesmotitulop()
	RETURNS TRIGGER
	LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
  x record;
  y integer;
BEGIN
 y = 0;
 for x in select titulo from series LOOP
 	if x.titulo=new.titulo then
 		y = 1;
 	end if;
 end lOOP;
 
 if y = 1 then
 	raise exception 'inserción rexeitada';
 	else
	 	raise notice 'inserción aceptada';
 end if;
  return new;
END;
$$;
CREATE TRIGGER tmesmotitulopt before INSERT ON peliculas for each row EXECUTE PROCEDURE tmesmotitulop();