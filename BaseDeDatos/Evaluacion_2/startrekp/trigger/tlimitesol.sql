/*
tlimitesol
impedir que una personaxe poda ter por xefe a un soldado (inserindo)
insert into personaxes values ('p48','zira','soldado','p21');
'este personaxe non debe ter por xefe a un soldado'
insert into personaxes values ('p48','zira','soldado','p46');
'rexistro inserido'
*/
DROP FUNCTION tlimiteso() CASCADE;
CREATE FUNCTION tlimiteso()
	RETURNS TRIGGER
	LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
 x varchar;
BEGIN
 select graduacion into x from personaxes where codper=new.codper2;
 if x='soldado' then
 	raise exception 'este personaje no debe tener por  jefe a un soldado ';
    else
        raise notice 'registro añadido ';
 end if;
  return new;
END;
$$;
CREATE TRIGGER tlimitesot before INSERT ON personaxes for each row EXECUTE PROCEDURE tlimiteso();