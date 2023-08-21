/*tmesmotitulop

impedir que se rexistre una película de igual titulo que calquera das series existentes

insert into peliculas values ('pel10','cosmos',1980, 'adams');rexeitada insercion;

insert into peliculas values ('pel10','cosmas',1980, 'adams');
aceptada insercion*/


DROP FUNCTION HorasMaximas() CASCADE;
CREATE FUNCTION HorasMaximas()
RETURNS TRIGGER
LANGUAGE PLPGSQL
 AS 
$$  
DECLARE
sumHoras integer;
BEGIN
select sum(horas) into sumHoras from interpretesser where cods=new.cods and coda=new.coda;
 if(sumHoras+new.horas)>500 then
  	 raise exception 'rechaza insercion, ese actor no puede trabajar mas de 500 horas en la serie';
    else
  	 raise notice 'aceptada insercion';
  end if;
  return new;
END;
$$;
CREATE TRIGGER HorasMaximasf before INSERT ON interpretesser for each row EXECUTE PROCEDURE HorasMaximas();
