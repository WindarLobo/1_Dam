/*trigger que impiden que una persona sea registrada    al mismo tiempo en la tabla    'farmacéuticos' y en la tabla 'propietaria'. (solo se puede registrar en una de las tablas).
En primer lugar borre del script 'farmacias.sql'    la línea que dice: insertar en valores farmacéuticos('3681',5,134); y tirarlo de vuelta
*/


DROP FUNCTION propiosRegistro() CASCADE;
CREATE FUNCTION propiosRegistro()
	RETURNS TRIGGER
	LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
contaP integer;
contaF integer;

BEGIN
select count (*) into contaP from persoas where  dnip=new.dnip;
select count (*) into contaF from farmaceuticos  where  dnip=new.dnip;
 if contaP=0  and contaF=0 then
  	 raise notice ' añadido';
    else
  	 raise exception 'no se puede añadir  en propio pq ya existe';
  end if;

    return new;
END;
$$;
CREATE TRIGGER propiosRegistrot before INSERT ON propios  for each row EXECUTE PROCEDURE propiosRegistro();





DROP FUNCTION farmaceuticosRegistro() CASCADE;
CREATE FUNCTION farmaceuticosRegistro()
	RETURNS TRIGGER
	LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
contaP integer;
contaV integer;
BEGIN
select count (*) into contaP from persoas where  dnip=new.dnip;
select count (*) into contaV from propios where  dnip=new.dnip;
 if contaP=0  and contaV=0 then
  	 raise notice ' añadido';
    else
  	 raise exception 'no se puede añadir farmaceutico  pq ya existe';
  end if;

    return new;
END;
$$;
CREATE TRIGGER farmaceuticosRegistrot before INSERT ON farmaceuticos  for each row EXECUTE PROCEDURE farmaceuticosRegistro();




/*
DROP FUNCTION tmeterpropios() CASCADE;
CREATE FUNCTION tmeterpropios()
	RETURNS TRIGGER
	LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
 z integer;
BEGIN
  select count(*) into z from farmaceuticos where dnip=new.dnip;
  if z > 0 then
  	raise exception 'non se pode añadir xa que está en farmaceuticos';
     else
     	 raise notice 'inserción añadida';
  end if;
  return new;
END;
$$;
CREATE TRIGGER tmeterpropiost before INSERT ON propios for each row EXECUTE PROCEDURE tmeterpropios();



DROP FUNCTION tmeterfarmaceuticos() CASCADE;
CREATE FUNCTION tmeterfarmaceuticos()
	RETURNS TRIGGER
	LANGUAGE PLPGSQL
    AS 
$$  
DECLARE
 z integer;
BEGIN
  select count(*) into z from propios where dnip=new.dnip;
  if z > 0 then
  	raise exception 'non se pode añadir xa que está en propios';
     else
     	 raise notice 'inserción añadida';
  end if;
  return new;
END;
$$;
CREATE TRIGGER tmeterfarmaceuticost before INSERT ON farmaceuticos for each row EXECUTE PROCEDURE tmeterfarmaceuticos();
*/
