/*
insert into xoga values ('x14','p1', 4, 0);
rexeitada
insert into xoga values ('x14','p3', 4, 0);
aceptada
*/
DROP FUNCTION tlimitexoga() CASCADE;
CREATE FUNCTION tlimitexoga()
	RETURNS TRIGGER
	LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
 cuenta integer;
BEGIN
  select count(codx) into cuenta from xoga where codpar=new.codpar;
  if cuenta<5 then
  	 raise notice 'jugador añadido';
    else
  	 raise exception 'para el partido % no se puede añadir otro jugador por que ya tiene 5 jugadores',new.codpar;
  end if;
  return new;
END;
$$;
CREATE TRIGGER tlimitexogat before INSERT ON xoga for each row EXECUTE PROCEDURE tlimitexoga();