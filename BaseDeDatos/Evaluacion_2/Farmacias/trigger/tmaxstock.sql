-- insert into stock values ('1','4','2', '1');

DROP FUNCTION tmaxstock() CASCADE;
CREATE FUNCTION tmaxstock()
	RETURNS TRIGGER
	LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
contaP integer;
BEGIN
 select sum(cantidads) into contaP from stock where codf=new.codf and codm=new.codm;

 if  contaP >3 then
     raise exception 'rechazada insecion';
    else
 raise notice ' aceptada insercion ';
  	 
  end if;
    return new;
END;
$$;
CREATE TRIGGER tmaxstockt before INSERT ON stock for each row EXECUTE PROCEDURE tmaxstock();
