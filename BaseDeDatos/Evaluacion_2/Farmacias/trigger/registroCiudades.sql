/*) trigger que impida rexistrar dúas cidades co mesmo nome.*/


DROP FUNCTION cidadesRegistro() CASCADE;
CREATE FUNCTION cidadesRegistro()
	RETURNS TRIGGER
	LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
 cuenta integer;

BEGIN
  select count(*) into cuenta from cidades where  nomc =new.nomc;
 if  cuenta >0  then
 raise notice 'rechazada insecion no se puede tener el mismo nombre ';
    else
    raise exception ' aceptada insercion ';
  	 
  end if;
    return new;
END;
$$;
CREATE TRIGGER cidadesRegistrot before INSERT ON cidades for each row EXECUTE PROCEDURE cidadesRegistro();

