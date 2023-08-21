/*trigger txpais que no permite que un mismo país represente a más de dos países, 
en caso contrario que la inserción sea aceptada*/

DROP FUNCTION txpais() CASCADE;
CREATE FUNCTION txpais()
RETURNS TRIGGER
LANGUAGE PLPGSQL
 AS 
$$  
DECLARE
contaH integer; 
BEGIN

select count(*) into contaH from pais where npr=new.npr;
 if contaH>1 then
 
 raise exception 'Este pais no puede representar a mas de dos paises';	
 
    else
	
	  raise notice 'Incersion aceptada ';
 
  	 
  end if;

  return new;
END;
$$;
CREATE TRIGGER txpaisg before INSERT ON pais for each row EXECUTE PROCEDURE txpais();

/*
insert into pais values(11,'espahna',10,6);
*/