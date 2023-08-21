/*impedir que un mismo actor interprete mas de 500 horas en una misma serie.
insert into  interpretesser values('a18','p16','s3',1);
rechaza insercion, ese actor no puede trabajar mas de 500 horas en la serie s3
insert into actores interpretesser values('a12','p16','s3',101);
rechaza insercion, ese actor no puede trabajar mas de 500 horas en la serie s3
insert into actores interpretesser values('a12','p16','s3',100);
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





/*
thorasmaxs
impedir que un mismo actor interprete mas de 500 horas en un misma serie
insert into interpretesser values ('a18','p1','s3',1);
	insercion rechadaza, este actor non pode traballar máis de 500 horas realizadas na serie s3
	
insert into interpretesser values('a12','p1','s3',101);
	insercion rechadaza, este actor non pode traballar máis de 500 horas realizadas na serie s3
	
insert into interpretesser values('a12','p1','s3',100);
	insercion añadida
*/


DROP FUNCTION HorasMaximas() CASCADE;
CREATE FUNCTION HorasMaximas()
RETURNS TRIGGER
LANGUAGE PLPGSQL
 AS 
$$  
DECLARE
sumHoras integer;
BEGIN
 select sum(coalesce(horas,0))+coalesce(new.horas,0) into sumHoras from interpretesser where coda=new.coda and cods=new.cods;
  sumHoras = sumHoras + coalesce(new.horas,0);
  if sumHoras <= 500 then
  	raise notice 'inserción añadida';
	else
	   raise exception 'inserción fallida, este actor no puede traballar máis de 500 horas en la serie %',new.cods;
  end if;
  return new;
END;
$$;
CREATE TRIGGER HorasMaximasf before INSERT ON interpretesser for each row EXECUTE PROCEDURE HorasMaximas();
