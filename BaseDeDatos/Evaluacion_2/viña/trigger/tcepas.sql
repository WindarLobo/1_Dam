DROP FUNCTION tcepas() CASCADE;
CREATE FUNCTION tcepas()
RETURNS TRIGGER
LANGUAGE PLPGSQL
 AS 
$$  
DECLARE
contaH integer;
contaV integer;
y integer;
BEGIN
 y = 0;
select count (codv) into contaH from ten where codv=new.codv;
if contaH >=4  then
raise exception 'Este viñedo ya tienes 4 variedades de cepas, rechaza insercion';


  else
   raise notice ' hecha la insercion';
	
  	
  end if;

  return new;
END;
$$;
CREATE TRIGGER tcepasf before INSERT ON ten for each row EXECUTE PROCEDURE tcepas();
/*
insert into ten values('v2','c6',300)
*/