--trigger que impida que nunha mesma farmacia traballen mais de duas personas.

DROP FUNCTION tnomasdospersoasfarmacia() CASCADE;
CREATE FUNCTION ttnomasdospersoasfarmacia()
	RETURNS TRIGGER
	LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
 x integer;
BEGIN
  select count(*) into x from traballan where codf=new.codf;
  if x >= 2 then
  	raise exception 'non se pode añadir xa que esa farmacia xa consta de 2 traballadores';
    else
    	raise notice 'inserción añadida';
  end if;
  return new;
END;
$$;
CREATE TRIGGER ttnomasdospersoasfarmaciat before INSERT ON traballan for each row EXECUTE PROCEDURE ttnomasdospersoasfarmacia();